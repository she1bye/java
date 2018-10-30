package zut.edu.cs.network.experiment6;

/**
*
* @author ’≈Ã⁄ª‘
* Rectangle¿‡
*/

public class Rectangle {
	private double width;
	private double height;
	private String color;
	
	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Rectangle(double width, double height, String color) {
		super();
		this.width = width;
		this.height = height;
		this.color = color;
	}
	
	public double findArea() {
		return width*height;		
	}
	
	public double findPerimeter() {
		return 2*(width + height);	
	}

	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
