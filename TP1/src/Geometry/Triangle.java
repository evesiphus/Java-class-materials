package Geometry;

public class Triangle{
    private Point point1;
    private Point point2;
    private Point point3;

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        point1 = new Point(x1, y1);
        point2 = new Point(x2, y2);
        point3 = new Point(x3, y3);
    }

    public Triangle(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public String toString() {
        return String.format("Triangle: point1 is %s, point2 is %s, and point3 is %s", point1, point2, point3);
    }

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    //5-3
    public void move(int x1, int y1, int x2, int y2, int x3, int y3) {
        point1.setX(x1);
        point1.setY(y1);
        point2.setX(x2);
        point2.setY(y2);
        point3.setX(x3);
        point3.setY(y3);
    }


    public static void main(String [] args) {
        Triangle t1 = new Triangle(0, 0, 0, 1, 2, 3);
        System.out.println(t1);
        // 5-3
        t1.move(1,2,3,4,5,6);
        System.out.println("Moved Triangle: " + t1);
        //test getPoint1 and setPoint1
        Point p1=t1.getPoint1();
        System.out.println("original point1: " + p1);
        t1.setPoint1(new Point(10, 10));
        System.out.println("new point1: " + t1.getPoint1());

    }

}