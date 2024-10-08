package creationalPattern.factory_method_design_pattern.category;

public class Category {
	private Long id;
	private String name;

	public Category() {}

	public Category(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() { return id; }

	public void setId(Long id) { this.id = id; }

	@Override
	public String toString() {
		return "Category{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}
}
