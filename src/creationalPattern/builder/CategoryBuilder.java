package creationalPattern.builder;

import creationalPattern.factory_method_design_pattern.category.Category;

public class CategoryBuilder implements Builder<Category> {
	private Long id;
	private String name;

	public CategoryBuilder id(Long id) {
		this.id = id;
		return this;
	}
	public CategoryBuilder name(String name) {
		this.name = name;
		return this;
	}

	@Override
	public Category build() {
		Category category = new Category();
		category.setId(id);
		category.setName(name);

		return category;
	}
}
