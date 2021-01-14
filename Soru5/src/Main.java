
public class Main {

	public static void main(String[] args) {
		Circle circle = new Circle();
		
		circle.setColor("red");
		circle.setRadius(2.15);
 
		System.out.println("The color of circle is : " + circle.getColor());
		System.out.println("The radius of circle is : " + circle.getRadius());

		System.out.println("The area of circle is : " + areaofCircle(circle.getRadius()));
		
		radiusofCircle(areaofCircle(circle.getRadius()));
	}
	
	public static double areaofCircle(double radius) {
		return radius * radius * Math.PI;
	}
	public static void radiusofCircle(double areaofCircle) {
		System.out.println("The radius of circle is : " + Math.sqrt(areaofCircle / Math.PI));
	}
}

