package homework;

public class homework {

	public static void main(String[] args) {
/*		System.out.println("Merhaba Dünya.");

		// Variables
		int ogranciSayisi = 12;
		String mesaj = "Öğrenci sayısı: ";
		System.out.println(mesaj + ogranciSayisi);
		System.out.println(mesaj + ogranciSayisi);
		System.out.println("Öğrenci sayım: " + ogranciSayisi);
		System.out.println("Öğrenci sayım: " + ogranciSayisi);
		System.out.println("Öğrenci sayım: " + ogranciSayisi);

		// datatypes
		byte sayi1 = 121;
		double sayi2 = 12.5;
		int sayi = 12;
		sayi = 1211111111;

		char karakter = 'A';

		boolean dogruMu = false;

		// conditionals
		int sayi3 = 24;
		if (sayi3 < 20) {
			System.out.println("Sayı 20 den küçüktür.");
		}

		if (sayi3 < 15) {
			System.out.println("Sayı 20 den küçüktür.");
		}

		if (sayi3 < 20) {
			System.out.println("Sayı 20 den küçüktür.");
		} else {
			System.out.println("Sayı 20 den küçük değildir.");
		}

		if (sayi3 < 20) {
			System.out.println("Sayı 20 den küçüktür.");
		} else if (sayi3 == 20) {
			System.out.println("Sayı 20 ye eşittir.");
		}

		if (sayi3 < 20) {
			System.out.println("Sayı 20 den küçüktür.");
		} else if (sayi3 == 20) {
			System.out.println("Sayı 20 ye eşittir.");
		} else {
			System.out.println("Sayı 20' den büyüktür.");
		}

		// ReCap Demo 1 En büyük sayı hangisi
		int sayi4 = 29;
		int sayi5 = 22;
		int sayi6 = 26;
		int enBuyukSayi = sayi4;

		if (enBuyukSayi < sayi5) {
			enBuyukSayi = sayi5;
		}

		if (enBuyukSayi < sayi6) {
			enBuyukSayi = sayi6;
		}

		System.out.println("En büyük sayi= " + enBuyukSayi);

		// Switch bloklarıyla çalışmak.
		char grade = 'G';

		switch (grade) {
		case 'A':
			System.out.println("Mükemmel: Geçtiniz");
			break;
		case 'B':
			System.out.println("Çok güzel: Geçtiniz");
			break;
		case 'C':
			System.out.println("İyi: Geçtiniz");
			break;
		case 'D':
			System.out.println("Fena Değl: Geçtiniz");
			break;
		case 'F':
			System.out.println("Maalesef Kaldınız.");
			break;
		default:
			System.out.println("Geçersiz not girdiniz.");
		}

		// döngüler
		// for
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("Döngü bitti.");

		for (int i = 0; i < 10; i += 2) {
			System.out.println(i);
		}
		System.out.println("Döngü bitti.");

		// while döngüsü
		int i = 1;
		while (i < 10) {
			System.out.println(i);
			i++;
		}
		System.out.println("while döngüsü bitti.");

		int j = 1;
		while (j < 10) {
			System.out.println(j);
			j += 2;
		}
		System.out.println("while döngüsü bitti.");

		// Do while döngüsü
		int k = 100;
		do {
			System.out.println(k);
			k += 2;
		} while (k < 10);

		System.out.println("Do while döngüsü bitti.");

		// diziler
		String ogrenci1 = "Engin";
		String ogrenci2 = "Derin";
		String ogrenci3 = "Salih";
		String ogrenci4 = "Ahmet";

		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);

		System.out.println("-----------------------------");

		String[] ogrenciler = new String[4];
		ogrenciler[0] = "Engin";
		ogrenciler[1] = "Derin";
		ogrenciler[2] = "Salih";
		ogrenciler[3] = "Ahmet";
		// ogrenciler[4]="Ali";

		for (int x = 0; x < ogrenciler.length; x++) {
			System.out.println(ogrenciler[x]);
		}

		System.out.println("---------------------");

		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}

		// ReCap Demo 2 - Dizilerle çalışmak

		double[] myList = { 1.2, 1.3, 4.3, 6.4 };
		double total = 0;
		double max = 0;

		for (double number : myList) {
			if (max < number) {
				max = number;
			}
			total += number;
			System.out.println(number);

		}
		System.out.println(total);
		System.out.println("En büyük sayı: " + max);

		// Çok Boyutlu Dizilerle Çalışmak
		String[][] sehirler = new String[3][3];

		sehirler[0][0] = "İstanbul";
		sehirler[0][1] = "Bursa";
		sehirler[0][2] = "Bileckik";
		sehirler[1][0] = "Ankara";
		sehirler[1][1] = "Konya";
		sehirler[1][2] = "Kayseri";
		sehirler[2][0] = "Diyarbakır";
		sehirler[2][1] = "Şanlıurfa";
		sehirler[2][2] = "Gaziantep";

		for (int y = 0; y < 3; y++) {
			for (int z = 0; z < 3; z++) {
				System.out.println(sehirler[y][z]);
			}
			System.out.println("-------------");
		}

		// Stringlerle çalışmak1
		String mesaj1 = "Bugün hava çok güzel.";
		System.out.println(mesaj1);
		System.out.println("Eleman sayısı: " + mesaj1.length());
		System.out.println("5. eleman: " + mesaj1.charAt(4));
		System.out.println(mesaj1.concat(" Yaşasın.!"));
		System.out.println(mesaj1.startsWith("b"));
		System.out.println(mesaj1.endsWith("."));
		char[] karakterler = new char[5];
		mesaj1.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(mesaj1.indexOf("av"));
		System.out.println(mesaj1.lastIndexOf("a"));

		// Stringlerle çalışmak2
		String yeniMesaj = mesaj1.replace(" ", "-");
		System.out.println(yeniMesaj);
		System.out.println(mesaj1.substring(2));
		System.out.println(mesaj1.substring(2, 5));
		for (String kelime : mesaj1.split(" ")) {
			System.out.println(kelime);
		}
		System.out.println(mesaj1.toLowerCase());
		System.out.println(mesaj1.toUpperCase());

		String mesaj2 = "      Bugün hava çok güzel.     ";
		System.out.println(mesaj2);
		System.out.println(mesaj2.trim());

		// Mini Proje 1 - Sayı Asal mı?
		int number = 1;
		int remainder = number % 2;
		// System.out.println(remainder);
		boolean isPrime = true;

		if (number == 1) {
			System.out.println("Sayı asal değildir.");
			return;
		}

		if (number <= 1) {
			System.out.println("Geçersiz sayı girdiniz.");
		}

		for (int l = 0; l < number; l++) {
			if (number % 2 == 0) {
				isPrime = false;
			}

		}

		if (isPrime == false) {
			System.out.println("Sayı asaldır.");
		} else {
			System.out.println("Sayı asal değildir.");
		}
*/
		

		// Mini Proje 2 - Kalın Sesli ve İnce Sesli Harfler
/*		char harf = 'I';

		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kalın Sesli harf.");
			break;
		default:
			System.out.println("İnce sesli harf.");

		}
*/

		// Mini Proje 3 - Mükemmel Sayılar
/*		int number2 = 28;
		int total2 = 0;

		for (int a = 1; a < number2; a++) {
			if (number2 % a == 0) {
				total2 = total2 + a;
			}
		}

		if (total2 == number2) {
			System.out.println("Mükemmel sayıdır.");
		} else {
			System.out.println("Mükemmel sayı değildir.");
		}
*/
		

		//Mini Proje 4 - Arkadaş Sayılar
/*		int sayi1=222;
		int sayi2=284;
		int toplam1=0;
		int toplam2=0;
		
		for (int i = 1; i < sayi1; i++) {
			if(sayi1%i==0) {
				toplam1=toplam1+i;
			}
			
		}
		
		for (int i = 1; i < sayi2; i++) {
			if(sayi2%i==0) {
				toplam2=toplam2+i;
			}
			
		}
		
		if(sayi1==toplam2 && sayi2==toplam1) {
			System.out.println("Bu iki sayı arkadaştır.");
		}else {
			System.out.println("Bu iki sayı arkadaş değildir.");
		}
*/
		
		//Mini Proje 5 - Sayı Bulma
		int[] sayilar = new int[] {1,2,5,7,9,0};
		int aranacak=5;
		boolean varMi=false;
		
		for (int sayi:sayilar) {
			if(sayi==aranacak) {
				varMi=true;
				break;
			}
		}
		
		if (varMi) {
			System.out.println("Sayi mevcuttur.");
		}else {
			System.out.println("Sayı mevcut değildir.");
		}
		
		
		
		
		
	
	}

}


