package creationalPattern.builder;


import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class EntityFactoryImpl implements EntityFactory {
	private final Map<Class<?>, Supplier<Builder>> entityBuilderSupplier;

	public EntityFactoryImpl() {
		entityBuilderSupplier = new HashMap<>();

		// Author Builder
		entityBuilderSupplier.put(AuthorBuilder.class, AuthorBuilder::new);

		// Category Builder
		entityBuilderSupplier.put(CategoryBuilder.class, CategoryBuilder::new);

		// Book Builder
		entityBuilderSupplier.put(BookBuilder.class, BookBuilder::new);
	}

	@Override
	public <E, B extends Builder<E>> B newEntityBuilder(Class<B> builderType) {
		return (B) entityBuilderSupplier
				.get(builderType)
				.get();
	}
}
