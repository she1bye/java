package zut.edu.cs.network.experiment6;

/**
 *
 * @author ’≈Ã⁄ª‘
 * Fan¿‡
 */
public class Fan {
	private int speed;
    private boolean on;
    private double radius;
    private String color;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString(){
        return "Fan [color=" + color + ", radius=" + radius + ", speed=" + speed +
                ", on=" + on + "]";
    }
}
