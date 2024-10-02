package Geometry;

import java.util.Arrays;

public class Rectangle{
    private Point point1;
    private Point point2;
    private Point point3;
    private Point point4;

    public Rectangle(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        point1 = new Point(x1, y1);
        point2 = new Point(x2, y2);
        point3 = new Point(x3, y3);
        point4 = new Point(x4, y4);
    }

    public Rectangle(Point point1, Point point2, Point point3, Point point4) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        this.point4 = point4;
    }

    public String toString() {
        return String.format("TRectangle: point1 is %s, point2 is %s, point3 is %s, point4 is %s.", point1, point2, point3, point4);
    }

    public Point getPoint1() {
        return point1;
    }
    public Point getPoint2() {
        return point2;
    }
    public Point getPoint3() {
        return point3;
    }
    public Point getPoint4() {
        return point4;
    }


   // Is it really a rectangle?
    public static int getDistanceSquared(Point point1, Point point2) {
        return (point1.getX()-point2.getX()) * (point1.getX()-point2.getX())
                +(point1.getY()-point2.getY()) * (point1.getY()-point2.getY());
    }

    public static boolean isRectangle(Point point1, Point point2, Point point3, Point point4) {
        // Calculate the squared distances between all pairs of points
        int d12 = getDistanceSquared(point1, point2);
        int d13 = getDistanceSquared(point1, point3);
        int d14 = getDistanceSquared(point1, point4);
        int d23 = getDistanceSquared(point2, point3);
        int d24 = getDistanceSquared(point2, point4);
        int d34 = getDistanceSquared(point3, point4);

        // Check if opposite sides are equal and diagonals are equal
        // Use vector dot product to check for right angles
        return isRightAngle(point1, point2, point3) && // Angle at point2
                isRightAngle(point2, point3, point4) && // Angle at point3
                isRightAngle(point3, point4, point1) && // Angle at point4
                isRightAngle(point4, point1, point2) && // Angle at point1
                (d12 == d34 && d13 == d24); // Check if diagonals are equal
    }

    // Method to check if the angle between three points is a right angle (using dot product)
    public static boolean isRightAngle(Point a, Point b, Point c) {
        int abx = b.getX() - a.getX();
        int aby = b.getY() - a.getY();
        int bcx = c.getX() - b.getX();
        int bcy = c.getY() - b.getY();
        // Dot product of vectors AB and BC should be zero for a right angle
        return (abx * bcx + aby * bcy) == 0;
    }

    public static void main(String [] args) {
        Rectangle t1 = new Rectangle(0, 0, 0, 1, 0,3,  1, 3);
        System.out.println(t1);

        //test getPoint1 and setPoint1
        Point p1=  t1.getPoint1();
        Point p2 = t1.getPoint2();
        Point p3 = t1.getPoint3();
        Point p4 = t1.getPoint4();
        System.out.println("original point1: "+ p1);

        // is it really a rectangle?
        if (isRectangle(p1, p2, p3, p4)) {
            System.out.println("rectangle found");
        }
        else {
            System.out.println("rectangle not found");
        }



    }

}