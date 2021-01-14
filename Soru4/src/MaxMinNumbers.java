import java.util.Arrays;

public class MaxMinNumbers {
	public static void main(String[] args) {
		int dizi1[] = {3, 5, 26, 1, 8, 12, 27};
		int dizi2[] = {99, 7, 79, 0, 456};
		int dizi3[] = {30, 15, 12, 19, 8, 45, 991};
		int dizi4[] = {3, 65, 25, 2, 24, 29};
		
		maxMinNumbers(dizi1);
		maxMinNumbers(dizi2);
		maxMinNumbers(dizi3);
		maxMinNumbers(dizi4);
	}
	
	public static void maxMinNumbers(int[] array) {
		int max = 0;
		for(int i=0; i < array.length; i++) {
			if(array[i] > max) {
				max = array[i];			
			}
		}
		int min = array[0];
		for(int i=0; i < array.length; i++) {
			if(array[i] < min) {
				min = array[i];
			}
		}
		System.out.println("Dizinin en küçük elemaný: " + min + " Dizinin en büyük elemaný: " + max + "\n");
	}
	
}
