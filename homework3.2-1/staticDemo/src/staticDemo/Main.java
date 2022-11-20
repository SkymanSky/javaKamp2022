package staticDemo;

public class Main {

	public static void main(String[] args) {
		// 45 : Composition - Inner Class ve Static
		
		Product product = new Product();
		product.price=10;
		product.name="";
		
		
		ProductManager manager = new ProductManager();
		manager.add(product);
		
		DatabaseHelper.Connection.crreateConnection();
		DatabaseHelper.Crud.delete();

	}

}
