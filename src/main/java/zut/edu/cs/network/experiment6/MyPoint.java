package zut.edu.cs.network.experiment6;

public class MyPoint {
	private double x;
	private double y;
	
	public MyPoint() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MyPoint(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	/*public double distance(MyPoint secondPoint ) {
		
		
	}*/
    public double distance(MyPoint p1,MyPoint p2 ) {
    	double num = (p1.x-p2.x)*(p1.x-p2.x) + (p1.y-p2.y)*(p1.y-p2.y);
		double distance = Math.sqrt(num);
		return distance;
	}

}
