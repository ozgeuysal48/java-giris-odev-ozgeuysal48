
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
	
	public double areaOfCircle(double radius) {
		return radius * radius * Math.PI;
	}
	
	public void radiusOfCircle(double areaofCircle) {
		System.out.println("The radius of circle is : " + Math.sqrt(areaofCircle / Math.PI)  + "\n");
	}
}
