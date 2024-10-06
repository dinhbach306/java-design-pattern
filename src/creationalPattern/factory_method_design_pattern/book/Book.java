package creationalPattern.factory_method_design_pattern.book;

public class Book {
	private Long id;
	private String name;
	private Long categoryId;
	private Long authorId;

	public Book() {}

	public Book(Long id, String name, Long categoryId, Long authorId) {
		this.id = id;
		this.name = name;
		this.categoryId = categoryId;
		this.authorId = authorId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() { return id; }

	public void setId(Long id) { this.id = id; }

	public Long getCategoryId() { return categoryId; }

	public void setCategoryId(Long categoryId) { this.categoryId = categoryId; }

	public Long getAuthorId() { return authorId; }

	public void setAuthorId(Long authorId) { this.authorId = authorId; }

	@Override
	public String toString() {
		return "Book{" +
				"id=" + id +
				", name='" + name + '\'' +
				", categoryId=" + categoryId +
				", authorId=" + authorId +
				'}';
	}
}
