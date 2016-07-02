//https://www.codewars.com/kata/cartesian-coordinates-from-degree-angle/train/java
package coordinatesinspector;

import java.awt.geom.Point2D;
import java.math.BigDecimal;

public class CoordinatesInspector {

    public static void main(String[] args) {
        System.out.println(coordinates(45d,1d));
    }
    
    public static Point2D coordinates(double degrees, double radius) {
        Point2D.Double cartPoint = new Point2D.Double();
        double x, y;
        double angle=degrees*Math.PI/180;   //Math.toRadians(angle);
        x=Math.cos(angle)*radius;
        y=Math.sin(angle)*radius;
                cartPoint.setLocation(new BigDecimal(x).setScale(10,BigDecimal.ROUND_HALF_UP).doubleValue(),
                              new BigDecimal(y).setScale(10,BigDecimal.ROUND_HALF_UP).doubleValue());
        return cartPoint;
    }
    
}
