package beans;
import java.util.*;
public class FilmBean {
	//Set<Film> Films=new TreeSet<Film>();
	List<Film> Filml=new ArrayList<Film>();
	String searchCondition;
	
	public int showPage; //��ʾҳ��ҳ��   
	public int pageCount; //��ҳ��    
	public String getSearchCondition() {//���ü�������
		return searchCondition;
	}
	public void setSearchCondition(String searchCondition){//���ؼ�������
		this.searchCondition = searchCondition;
	}
	
	public int getShowPage() {//������ʾҳ��ҳ��
		return showPage;//15��
	}
	public void setShowPage(int showPage) {//������ʾҳ��ҳ��
		this.showPage = showPage;
	}
	public int getPageCount() {//������ҳ��
		return pageCount;
	}
	public void setPageCount(int pageCount) {//������ҳ��
		this.pageCount = pageCount;
	} 
	public int getSize() {//��������
		return this.Filml.size();
	} 
	public Film get(int i) {//���ض���
		return this.Filml.get(i);
	}
	public void add(Film s) {//����Ӱ���ӵ�Filml
		//if(this.Films.add(s)){
			this.Filml.add(s);
			return;
		//}
	}
	public void clear() {//���Films
		//this.Films.clear();
		this.Filml.clear();
	}

}