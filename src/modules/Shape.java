package modules;

import java.util.ArrayList;

public class Shape {
    // container of Points (e.g. ArrayList<Point>)
    ArrayList<Point> points = new ArrayList<Point>();

    // addPoint(Point) - adds to the container
    public void addPoint(Point newPoint){
        points.add(newPoint);
    }

    // calculatePerimeter()
    public double calculatePerimeter(){
        double P = 0.0;
        int numberOfSides = points.size();
        for(int i = 0; i< numberOfSides; i++){
            Point curPoint = points.get(i);
            Point nextPoint = points.get((i+1)%numberOfSides);
            P+=curPoint.distanceTo(nextPoint);
        }
        return P;
    }

    // getAverageSide()
    public double getAverageSide(){
        double threeSides = 0.0;
        double averageSide = 0.0;

        int numberOfSides = points.size();
        for(int i = 0; i < numberOfSides; i++){
            Point curPoint = null;
            Point nextPoint = null;

            curPoint = points.get(i);
            nextPoint = points.get(i+1);

            threeSides = threeSides + curPoint.distanceTo(nextPoint);

        }

        averageSide = threeSides/numberOfSides;
        return averageSide;

    }

    // getLongestSide()
    public double getLongestSide(){
        double longestSide = 0.0;

        int numberOfSIdes = points.size();
        for(int i = 0; i < numberOfSIdes; i++){
            Point curPoint = null;
            Point nextPoint = null;

            curPoint = points.get(i);
            nextPoint = points.get((i+1)/numberOfSIdes);

            double curSide = curPoint.distanceTo(nextPoint);

            if(longestSide < curSide){
                longestSide = curSide;
            }

        }

        return longestSide;
    }
}
