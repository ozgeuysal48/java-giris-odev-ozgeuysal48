
public class Main {

	public static void main(String[] args) {
		Circle circle = new Circle();
		
		circle.setColor("red");
		circle.setRadius(2.15);
 
		System.out.println("The color of circle is : " + circle.getColor() + "\n");
		System.out.println("The radius of circle is : " + circle.getRadius() + "\n");

		System.out.println("The area of circle is : " + circle.areaOfCircle(circle.getRadius()) + "\n");
		
		circle.radiusOfCircle( circle.areaOfCircle( circle.getRadius()));
	}
	
}

