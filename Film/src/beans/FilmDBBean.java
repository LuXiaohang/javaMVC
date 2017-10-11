package beans;

import java.sql.*;
import java.io.*; //1行

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.tokenattributes.*; //5行     
import org.wltea.analyzer.lucene.IKAnalyzer;

public class FilmDBBean {
	int pageSize = 3; // 每页显示记录数，这里为每页显示条记录
	int showPage = 1; // 当前显示页
	int rowCount = 0; // 总记录数
	int pageCount = 0; // 记录分页后的总页数
	FilmBean allFilm = new FilmBean();// 存放全被查询结果
	FilmBean results = new FilmBean();// 存放每页上查询结果
	Connection conn = null;
	Statement stmt = null;
	ResultSet rset = null;
	String sql;

	public FilmDBBean(int judge, String name, String director, String role,
			String score, String time, String type) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/film", "root", "abc");
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY);// 创建语句对象
			
			if (judge == 1) { // 按电影名或简介搜索
				sql = "select * from film where name LIKE '%" + name
						+ "%' OR transname LIKE '%" + name + "%';"; // 按电影名搜索
				System.out.println(sql);
				rset = stmt.executeQuery(sql);
				if (rset == null || !rset.next()) {// 按电影名检索找不到结果就按全文检索，先切分，每个切分词在简介字段中寻找相对应的电影
					Analyzer analyzer = new IKAnalyzer(true);
					TokenStream ts = analyzer.tokenStream("", new StringReader(
							name));
					CharTermAttribute termAtt = ts
							.addAttribute(CharTermAttribute.class); // 添加切分项文本属性
					ts.incrementToken();
					sql = "select * from film where name Like'%"
							+ termAtt.toString() + "%'";
					while (ts.incrementToken()) { // 遍历切分项
						sql += " and name Like '%" + termAtt.toString() + "%'";// 获得切分项文本，并添加到检索条件中
					}
					sql += ";";
					System.out.println(sql);
					ts.close();// 关闭切分项流 //55行
					analyzer.close();
					rset = stmt.executeQuery(sql);
				}
				allFilm.setSearchCondition(name);
			} else if (judge == 2) {
				sql = "select * from film where director LIKE'%" + director
						+ "%';"; // 按导演搜索
				System.out.println(sql);
				rset = stmt.executeQuery(sql);
				allFilm.setSearchCondition(director);
			} else if (judge == 3) {
				sql = "select * from film where role LIKE '%" + role + "%';"; // 按主演搜索
				System.out.println(sql);
				rset = stmt.executeQuery(sql);
				allFilm.setSearchCondition(role);
			} else if (judge == 4) {
				sql = "select * from film where score LIKE '" + score + "%';"; // 按评分升序搜索
				System.out.println(sql);
				rset = stmt.executeQuery(sql);
				allFilm.setSearchCondition(score);
			} else if (judge == 5) {
				sql = "select * from film where time >'" + time
						+ "' order by time asc;"; // 按上映时间升序搜索
				System.out.println(sql);
				rset = stmt.executeQuery(sql);
				allFilm.setSearchCondition(time);
			} else {
				sql = "select * from film where type LIKE'%" + type + "%';"; // 按电影名搜索
				System.out.println(sql);
				rset = stmt.executeQuery(sql);
				allFilm.setSearchCondition(type);
			}
			if (rset == null || !rset.next()) {// 找不到结果
				allFilm = null;
				return;
			}
			do {// 找到结果，将全部的查询结果保存到allFilm
				Film filmtmp = new Film();
				filmtmp.setName(rset.getString("name"));
				filmtmp.setTransname(rset.getString("transname"));
				filmtmp.setRole(rset.getString("role"));
				filmtmp.setIntroduction(rset.getString("introduction"));
				filmtmp.setSite(rset.getString("site"));
				filmtmp.setDirector(rset.getString("director"));
				filmtmp.setTime(rset.getString("time"));
				filmtmp.setScore(rset.getString("score"));
				filmtmp.setCountry(rset.getString("country"));
				filmtmp.setType(rset.getString("type"));
				filmtmp.setPicture(rset.getString("picture"));
				filmtmp.setLanguage(rset.getString("language"));
				filmtmp.setMinute(rset.getString("minute"));
				filmtmp.setHref(rset.getString("href"));
				allFilm.add(filmtmp);
			} while (rset.next());
			rset.last(); // 将指针移至最后一条记录
			rowCount = rset.getRow(); // 取得结果集中记录的条数
			// 计算显示的页数
			pageCount = ((rowCount % pageSize) == 0 ? (rowCount / pageSize)
					: (rowCount / pageSize) + 1);

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {// 释放资源
				if (rset != null)
					rset.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException ignored) {
			}
		}
	}

	public FilmBean getResult(String toPage) {// 获取每页实际要显示的结果
		showPage = Integer.parseInt(toPage); // 要作为当前页显示的页数
		System.out.println(showPage);
		if (allFilm == null) // 没有结果
			return null;
		if (toPage != null) {
			if (showPage > pageCount) { // 指定页数大于总页数, 则显示最后一页
				System.out.println(pageCount);
				showPage = pageCount;
			} else if (showPage <= 0) {// 若指定页数小于0, 则显示第一页
				showPage = 1;// 60行
			}
		}
		System.out.println(showPage);
		int pos = (showPage - 1) * pageSize; // 显示页中记录的起始位置
		System.out.println(pos);
		int i = 0; // 记录显示的记录数
		results.clear();// 清空已有内容
		while (i < pageSize && pos < allFilm.getSize()) { // 从全部结果中取出当前页上要显示的结果
			Film bb = new Film();
			System.out.println(pos);
			bb = allFilm.get(pos);
			results.add(bb);
			i++;// 70行
			pos++;
		}// while循环结束
		results.setSearchCondition(allFilm.getSearchCondition());
		results.setShowPage(showPage);// 设置当前页页码
		results.setPageCount(pageCount);// 设置总页数
		return results;
	}
}
