package geometry;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        x = 0;
        y = 0;
    }

    public String toString() {
        return  "(" + x + ", " + y + ")";
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }

    public static void main(String[] args) {
        // 3-a
        Point point = new Point(1, 1);
        System.out.println("Point created with (1,1): " + point.toString());
        //3-b
        Point defaultPoint = new Point();
        System.out.println("Default point created: " + defaultPoint.toString());
        //3-c
        int x = point.getX();
        int y = point.getY();
        System.out.println("X value from point: " + x);
        System.out.println("Y value from point: " + y);
        //3-d
        System.out.println("Output from toString(): " + point.toString());
        //3-e
        point.setX(100);
        point.setY(100);
        System.out.println("Point after setting x and y to 100: " + point.toString());
    }
}
