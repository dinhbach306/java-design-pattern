package creationalPattern.builder;

import creationalPattern.factory_method_design_pattern.book.Book;

public class BookBuilder implements Builder<Book> {
	private Long id;
	private String name;
	private Long categoryId;
	private Long authorId;

	public BookBuilder id(Long id) {
		this.id = id;
		return this;
	}

	public BookBuilder name(String name) {
		this.name = name;
		return this;
	}

	public BookBuilder categoryId(Long categoryId) {
		this.categoryId = categoryId;
		return this;
	}

	public BookBuilder authorId(Long authorId) {
		this.authorId = authorId;
		return this;
	}

	@Override
	public Book build() {
		Book book = new Book();
		book.setId(id);
		book.setName(name);
		book.setCategoryId(categoryId);
		book.setAuthorId(authorId);
		return book;
	}
}
