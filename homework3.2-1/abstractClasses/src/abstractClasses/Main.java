package abstractClasses;

public class Main {

	public static void main(String[] args) {
		
		// Java Dersi 40 : Abstract Sınıflarla Çalışmak
		
		WomanGameCalculator womanGameCalculator= new WomanGameCalculator();
		womanGameCalculator.hesapla();
		womanGameCalculator.gameOver();
		
		GameCalculator gameCalculator= new WomanGameCalculator();
		gameCalculator.hesapla();
		gameCalculator.gameOver();
		
		GameCalculator olderGameCalculator = new OlderGameCalculator();
		olderGameCalculator.hesapla();
		olderGameCalculator.gameOver();

	}

}
