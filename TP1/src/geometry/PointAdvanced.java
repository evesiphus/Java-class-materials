package geometry;

public class PointAdvanced {
    private int x;
    private int y;

    public PointAdvanced(int x, int y) {
        if(x>=-300 && x<=300 && y>=-300 && y<=300){
            this.x = x;
            this.y = y;
        }
        else{
            System.out.println("Error");
            this.x = 0;
            this.y = 0;
        }
    }

    public PointAdvanced() {
        x = 0;
        y = 0;
    }

    public String toString() {
        return "Point_advanced [x=" + x + ", y=" + y + "]";
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
        PointAdvanced point_advanced = new PointAdvanced(100, 100);
        int x = point_advanced.getX();
        int y = point_advanced.getY();
        System.out.println("X value from point: " + x);
        System.out.println("Y value from point: " + y);

    }
}
