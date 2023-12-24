package modules;
import java.lang.Math;

public class Point {
    private double x;
    private double y;

    // constructor having both parameters
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }


    // distance(Point dest) - distance from current point to the dest point
    public double distanceTo(Point dest){
        return Math.sqrt(Math.pow((this.x - dest.x), 2)+ Math.pow((this.y-dest.y),2));
    }


    // overriding toString method
    @Override
    public String toString() {
        return this.x + " and " + this.y;
    }
}
