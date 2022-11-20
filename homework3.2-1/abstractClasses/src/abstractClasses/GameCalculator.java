package abstractClasses;

public abstract class GameCalculator {
	
	//aşağıdaki metot varsayılan olarak işlem yapmamakta fakat class ı miras alan diğer class tarafından tanımlanarak kullanılmalıdır.
	public abstract void hesapla();
	
	public final void gameOver() {
		System.out.println("Oyun bitt.");
	}

}
