/* 
 * Ad Soyad   : [Mustafa Murat Hilaloğlu]
 * Ogrenci No : [240541025]
 * Tarih      : [2.11.2025]
 * Aciklama   : [Gorev 3 - Maas Hesaplama Sistemi]
 */

import java.util.Scanner;

public class MaasHesap {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Sabit oranlar (değiştirilmeyecek değerler)
		final double sgk_orani = 0.14;
		final double gelir_vergisi_orani = 0.15;
		final double damga_vergisi_orani = 0.00759;
		
		// Başlık
		System.out.println("============================");
		System.out.println("        MAAS BARDROSU       ");
		System.out.println("============================");
		
		// Kullanıcıdan temel bilgiler alınır
		System.out.print("Adınızı giriniz :");
		String ad = input.next();
		
		System.out.print("Soyadınızı giriniz :");
		String soyad = input.next();
		
		System.out.print("Aylık Maaşınızı brüt (TL) cinsinden giriniz: ");
		double aylikbrutmaas = input.nextDouble();
		
		System.out.print("Haftalık çalışma saatinizi giriniz: ");
		int haftalikcalismasaati = input.nextInt();
		
		System.out.print("Mesai saati sayınızı giriniz: ");
		int mesaisaatisayisi = input.nextInt();
		
		// Mesai ücreti hesaplanır (1.5 katsayılı fazla mesai)
		double mesaiucreti = (aylikbrutmaas / 160) * mesaisaatisayisi * 1.5;
		
		// Toplam gelir = brüt maaş + mesai
		double toplamgelir = aylikbrutmaas + mesaiucreti; 
		
		// Kesintiler hesaplanır
		double sgk_kesintisi = toplamgelir * sgk_orani;
		double gelir_vergisi = toplamgelir * gelir_vergisi_orani;
		double damga_vergisi = toplamgelir * damga_vergisi_orani;
		double toplam_kesinti = sgk_kesintisi + gelir_vergisi + damga_vergisi;
		
		// Net maaş ve ek bilgiler hesaplanır
		double net_maas = toplamgelir - toplam_kesinti;
		double kesinti_orani = (toplam_kesinti / toplamgelir) * 100;
		double saatlik_net_kazanc = net_maas / 176;  // Ortalama aylık çalışma saati
		double gunluk_net_kazanc = net_maas / 22;   // Ortalama aylık çalışma günü
		
		// Çıktıların yazdırılması
		System.out.println("============================");
		System.out.println("        MAAS BARDROSU       ");
		System.out.println("============================");		
		System.out.println("Çalışan: " + ad + " " + soyad);
		System.out.println();
		 
		// GELİRLER bölümü
		System.out.println("GELIRLER");
		System.out.printf("Brut Maaş             : %.2f TL%n", aylikbrutmaas);
		System.out.printf("Mesai Ücreti          : %.2f TL%n", mesaiucreti);
		System.out.println("============================");	
		System.out.printf("TOPLAM GELIR          : %.2f TL%n%n", toplamgelir);
		
		// KESİNTİLER bölümü
		System.out.println("KESINTILER");
		System.out.printf("SGK Kesintisi (14.0%%): %.2f TL%n", sgk_kesintisi);
		System.out.printf("Gelir Vergisi (15.0%%): %.2f TL%n", gelir_vergisi);
		System.out.printf("Damga Vergisi (0.8%%) : %.2f TL%n", damga_vergisi);
		System.out.println("============================");	
		System.out.printf("TOPLAM KESINTI        : %.2f TL%n%n", toplam_kesinti);

		// Net maaş ve analiz bilgileri
		System.out.printf("NET MAAS              : %.2f TL%n", net_maas);
		System.out.println("============================");	
		 
		System.out.printf("Kesinti Oranı         : %.1f%%%n", kesinti_orani);
	  System.out.printf("Saatlik Net Kazanç    : %.2f TL%n", saatlik_net_kazanc);
	  System.out.printf("Günlük Net Kazanç     : %.2f TL%n", gunluk_net_kazanc);

		// Scanner kapatılır
		input.close();
	}
}


