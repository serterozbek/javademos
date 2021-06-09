package classesWithAttributes;

public class Product {

	// CONSTRUCTOR
	public Product(int id, String name, String description, double price, int stockAmount, String renk) {
		System.out.println("Yap�c� Blok �al��t�.");
		this._id=id;
		this.description=description;
		this.name=name;
		this.price=price;
		this.renk=renk;
		this.stockAmount=stockAmount;
	}

	public Product() {

	}

	// attributes | field
	private int _id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String renk;
	private String kod;

	// getter
	public int getId() {
		return _id;
	}

	// setter
	public void setId(int id) {
		_id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public String getKod() {
		return this.name.substring(0, 1) + _id;
	}

}
