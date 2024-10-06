package creationalPattern.builder;

public class CategoryFactoryImpl implements IFactory<CategoryBuilder> {
	@Override
	public CategoryBuilder newBuilder() {
		return new CategoryBuilder();
	}
}
