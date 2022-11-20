package overriding;

public class Main {

	public static void main(String[] args) {
		
		//Java Dersi 39 : Overriding Altyapısıyla Çalışmak
		
		//OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
		//double tutar=ogretmenKrediManager.hesapla(1000);
		//System.out.println(tutar);
		
		BaseKrediManager[] krediManagers = new BaseKrediManager[] {new OgretmenKrediManager(), new TarimKrediManager(), new OgrenciKrediManager()};
		for (BaseKrediManager baseKrediManager : krediManagers) {
			double tutar=baseKrediManager.hesapla(1000);
			System.out.println(tutar);
		}
		

	}

}
