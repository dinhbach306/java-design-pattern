package creationalPattern.factory_design_pattern;




public class Main {
	public interface ProductFactory {
		Product newProduct(String name, long price);
	};

	public static class ConcreteProduct implements ProductFactory {

		@Override
		public Product newProduct(String name, long price) {
			final Product product = new Product();
			product.setName(name);
			product.setPrice(price);
			return product;
		}
	}


	public static void main(String[] args) {
		final ConcreteProduct factory = new ConcreteProduct();
		final Product pricedProduct = factory.newProduct("Computer", 1000);
		final Product freeProduct = factory.newProduct("Icecream", 0);

		System.out.println(pricedProduct.getName() + " costs " + pricedProduct.getPrice());
		System.out.println(freeProduct.getName() + " costs " + freeProduct.getPrice());
	}
}
