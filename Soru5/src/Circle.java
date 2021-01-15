
public class Circle {
	
	private double radius;
	private String color;
	
	public double getRadius() {
		return radius;
	}
	public String getColor() {
		return color;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public double areaOfCircle() {
		return radius * radius * Math.PI;
	}
	
	public void radiusOfCircle(double area) {
		System.out.println("The radius of circle is : " + Math.sqrt(area / Math.PI)  + "\n");
	}
}
