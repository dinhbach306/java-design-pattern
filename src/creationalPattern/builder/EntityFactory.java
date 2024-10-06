package creationalPattern.builder;

public interface EntityFactory {
	<E, B extends Builder<E>> B newEntityBuilder(Class<B> builderType);
}
