package beans;

public class Food {
	private String name;
	private String domestic;
	private String region;
	private String restaurant;
	private String type;
	private String favor;
	private String size;
	private String price;
	private String href;
	private String pic;
	private String score;

	
	public String getName() {
		return name;	
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getFavor() {
		return favor;	
	}
	public void setFavor(String favor) {
		this.favor = favor;
	}

	public String getDomestic() {
		return domestic;	
	}
	public void setDomestic(String domestic) {
		this.domestic = domestic;
	}
	
	public void setPic(String pic) {
		this.pic = pic;
	}
	public String getPic(){
		return pic;
	}

	public String getRegion() {
		return region;	
	}
	public void setRegion(String region) {
		this.region = region;
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

	public String getRestaurant() {
		return restaurant;	
	}
	public void setRestaurant(String restaurant) {
		this.restaurant = restaurant;
	}

	public String getHref() {
		return href;	
	}
	public void setHref(String href) {
		this.href = href;
	}
	
	public String getScore() {
		return score;	
	}
	public void setScore(String score) {
		this.score = score;
	}

}
