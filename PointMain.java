package gr.aueb.cf.ch12;

/**
 * Driver class
 */
public class PointMain {

    public static void main(String[] args) {

    Point p1 = new Point(1 , 2);
    Point p2 = new Point (11, 0);

        System.out.println("Point1 state");
        System.out.println("X1:" + p1.getX());
        System.out.println("Y1:" + p1.getY());

        System.out.println("Point2 state");
        System.out.println("X2:" + p1.getX());
        System.out.println("Y2:" + p1.getY());
        System.out.println("  ");
        System.out.println(Point.getNoOfPoints());
    }
}
