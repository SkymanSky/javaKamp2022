package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		// Field ve Attribute ile Çalışmak
		// Encapsulation İhtiyacını Anlamak
		// Getter ve Setter ile Çalışmak
		// Constructor ile Çalışmak
		Product product= new Product(1,"Laptop","Asus Laptop",1000,2,"Siyah");
//		Product product = new Product();
//		product.setName("Laptop");
//		product.setId(1);
//		product.setDescription("Asus Laptop");
//		product.setPrice(5000);
//		product.setStockAmount(3);
//		product.setRenk("kırmızı");
		
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getKod());
		

	}

}
