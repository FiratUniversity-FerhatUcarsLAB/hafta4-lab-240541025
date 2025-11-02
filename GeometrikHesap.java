/* Ad Soyad : [Mustafa Murat Hilaloğlu]
 * Ogrenci No : [240541025]
 * Tarih : [2.11.2025]
 * Aciklama :[ Gorev 2- Geometrik Hesaplayici]
 */

import java.util.Scanner;

public class GeometrikHesap {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Sabit PI değeri tanımlanıyor
		final double PI = 3.14159 ;
		
		
		System.out.println("===GEOMETRIKHESAPLAYICI===");
		
		
		// Kullanıcıdan yarıçap bilgisi alınıyor
		System.out.print("Dairenin yaricapini girin(cm): ");
		double yaricap =input.nextDouble();
		
		// Hesaplamalar
		double dairealani =yaricap * PI ;
		double dairecevresi = 2 * yaricap * PI ;
		double dairecapi = 2 * yaricap ;
		double kurehacmi = 4.0/3.0 * PI * yaricap * yaricap * yaricap ;
		double kureyuzeyalani = 4 * PI * yaricap * yaricap ;
		
		 // Sonuçlar yazdırılıyor
		 System.out.println("SONUCLAR: ");
		 System.out.println("----------");
		 System.out.printf("Daire Alani : %.2f cm^2%n", dairealani);
		 System.out.printf("Daire Cevresi : %.2f cm%n", dairecevresi);
		 System.out.printf("Daire Capi : %.2f cm%n", dairecapi);
		 System.out.printf("Kure Hacmi : %.2f cm^3%n", kurehacmi);
		 System.out.printf("Kure Yuzey Alani : %.2f cm^2%n", kureyuzeyalani);
		
		
		
		
		input.close();
		
		
		
	}

}
