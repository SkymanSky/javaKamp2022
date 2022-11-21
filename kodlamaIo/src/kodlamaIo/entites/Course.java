package kodlamaIo.entites;

public class Course {
	private int id;
	private int categoryId;
	private int educatorId;
	private String name;
	private double price;
	
	public Course() {
		
	}
	
	public Course(int id, int categoryId, int educatorId, String name,int price ) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.educatorId = educatorId;
		this.name = name;
		this.price=price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public int getEducatorId() {
		return educatorId;
	}

	public void setEducatorId(int educatorId) {
		this.educatorId = educatorId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
