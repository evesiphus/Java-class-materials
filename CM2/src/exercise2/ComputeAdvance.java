package exercise2;

class ComputeAdvance {

    public double calculateArea(String shape, double a, double b){
        double area = 0;
        switch (shape.toLowerCase()){
            case "triangle":
                area = 0.5 * a  * b;
                break;
            case "rectangle":
                area = a * b;
                break;
            case "square":
                area = a * a;
                break;
            default:
                System.out.println("Invalid shape");

        }
        return area;
    }

    public static void main(String[] args) {
        // Create an instance of the Compute class
        ComputeAdvance compute = new ComputeAdvance();

        // Example of calculating the area for different shapes
        double triangleArea = compute.calculateArea("triangle", 5, 6);
        System.out.println("Triangle area: " + triangleArea);

        double rectangleArea = compute.calculateArea("rectangle", 4, 8);
        System.out.println("Rectangle area: " + rectangleArea);

        double squareArea = compute.calculateArea("square", 5, 0);  // Only one dimension is needed for square
        System.out.println("Square area: " + squareArea);
    }
}

