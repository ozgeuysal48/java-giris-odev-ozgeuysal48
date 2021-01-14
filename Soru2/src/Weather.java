import java.util.Scanner;

public class Weather {
	public static void main(String[] args) {

		System.out.print("Enter a temperature : ");
		Scanner scan = new Scanner(System.in);
		int derece = 0;
		derece = scan.nextInt();

		if (derece < 20) {
			System.out.println("The weather is cold.");
		} else if (derece >= 20 && derece <= 30) {
			System.out.println("The weather is warm.");
		} else {
			System.out.println("The weather is hot and the temperature is greater than 30!");
		}

	}

}
