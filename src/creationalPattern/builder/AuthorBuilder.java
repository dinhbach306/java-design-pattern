package creationalPattern.builder;

import creationalPattern.factory_method_design_pattern.author.Author;

public class AuthorBuilder implements Builder<Author> {
	private Long id;
	private String name;

	public AuthorBuilder id(Long id) {
		this.id = id;
		return this;
	}

	public AuthorBuilder name(String name) {
		this.name = name;
		return this;
	}


	@Override
	public Author build() {
		final Author author = new Author();
		author.setId(id);
		author.setName(name);
		return author;
	}
}
