package creationalPattern.factory_design_pattern;

public class Product {
	private String name;
	private long price;

	public Product(String name, long price) {
		this.name = name;
		this.price = price;
	}

	public Product() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}
}
