import java.util.Scanner;

public class Palindrom {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Bir sayi giriniz : ");
		int sayi = scan.nextInt();

		
		int ilkdeger = sayi;
		int uzunluk = String.valueOf(sayi).length();
		
		int kalan; 
		int deger = 0;
		
		for(int i = 0; i < uzunluk; i++) {
			
			kalan = sayi % 10;
			deger = deger * 10 + kalan; 
			sayi = sayi / 10; 
		}
		
		if(deger == ilkdeger) {
			System.out.println("Bu bir palindrom sayidir.");
		}
		else {
			System.out.println("Palindrom sayi degildir.");
		}
	}
}