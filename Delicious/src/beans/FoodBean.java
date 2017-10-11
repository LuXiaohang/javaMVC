package beans;
import java.util.*;
public class FoodBean {
	List<Food> food = new ArrayList<Food>();//
	private String region;
	private String restaurant;
	private String type;
	private String size;
	private String price;
	private String favor;
	private String name;
	private String domestic;
	public int showPage; //��ʾҳ��ҳ��   
	public int pageCount; //��ҳ��       
	
	
	public String getName() {
		return name;	
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getDomestic() {
		return domestic;	
	}
	public void setDomestic(String domestic) {
		this.domestic = domestic;
	}
	public String getRegion() {
		return region;	
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getRestaurant() {
		return restaurant;	
	}
	public void setRestaurant(String restaurant) {
		this.restaurant = restaurant;
	}
	public String getType() {
		return type;	
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSize() {
		return size;	
	}
	public void setSize(String size) {
		this.size = size;
	}
	
	public String getPrice() {
		return price;	
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getFavor() {
		return favor;	
	}
	public void setFavor(String favor) {
		this.favor = favor;
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
	public int getNumber() {//��������
		return this.food.size();
	} 
	public Food get(int i) {//���ض���
		return this.food.get(i);
	}
	public void add(Food s) {
		this.food.add(s);
	}
	public void clear() {
		this.food.clear();
	}

}
