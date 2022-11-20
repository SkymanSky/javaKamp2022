package staticDemo;

public class ProductValidator {
	
	public ProductValidator() {
		System.out.println("Yapıcı blok çalıştı.");
	}
	
	static {
		System.out.println("Statik yapıcı blok çalıştı.");
	}
	
	//Yardımcı operasyonlarda new lememek için statik tanımlama yapılabilir.
	public static boolean isValid(Product product) {
		if(product.price>0 && !product.name.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	
	public void bisey() {
		
	}
	
	public static class BaskaBirClass{
		public static void sil() {
			
		}
	}
}