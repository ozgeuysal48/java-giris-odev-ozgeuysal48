
public class ReverseString {
	
	public static void main(String[] args) {
		String kelime = "hello world";
		String kelimeninTersi = "";
		
		for(int i = kelime.length() - 1 ; i >= 0 ; i-- ) {
			kelimeninTersi += kelime.charAt(i);
		}
		System.out.println(kelimeninTersi);
		
	}

}
