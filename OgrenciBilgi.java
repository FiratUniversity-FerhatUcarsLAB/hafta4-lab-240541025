/* Ad Soyad : [Mustafa Murat Hilaloğlu]
 * Ogrenci No : [240541025]
 * Tarih :[2.11.2025]
 * Aciklama : [Görev 1 - Ogrenci Bilgi Sistemi]
 */

import java.util.Locale;
import java.util.Scanner;
public class OgrenciBilgi {

	public static void main(String[] args) {
		
		// Kullanıcıdan veri almak için Scanner nesnesi oluşturuluyor
		Scanner input = new Scanner(System.in);
		
		
		// Ondalık sayı girişlerinde nokta (.) kullanılabilmesi için Locale ayarı yapılıyor
		input.useLocale(Locale.US);
	    
	    
		System.out.println("===OGRENCİ BİLGİ SİSTEMİ===");	
		
		System.out.print("Adinizi girin :");	
		String isim = input.next();
		
		System.out.print("Soyadinizi girin :");	
		String soyisim = input.next();	
		
		System.out.print("Ogrenci numaraniz");
		int ogrencinumara = input.nextInt();
	
		System.out.print("Yasiniz");
		int yas = input.nextInt();
	
		System.out.print("GPA(0.00-4.00): ");
	    double gpa = input.nextDouble();
		
	    
	    // GPA değerine göre başarı durumu belirleniyor
	    String durum ;
	    if (gpa>2.50) {
			durum = "Basarili Ögrenci" ;
		} else {
			durum = "Basarisiz Ögrenci" ;
		}
	
	    
	    
	    // Bilgiler düzenli şekilde ekrana yazdırılıyor
	    System.out.println("\n===OGRENCI BILGI SISTEMI===");
	    System.out.println("Ad Soyad: "+ isim +" "+soyisim);
	    System.out.println("Ogrenci No: "+ ogrencinumara);
	    System.out.println("Yas: "+ yas);
	    System.out.printf("GPA: %.2f%n", gpa); // GPA 2 ondalık basamakla gösteriliyor
        System.out.println("Durum: " + durum);
	    
	    input.close(); // Scanner kapatılıyor
	
	
	
	
	
	}


}


