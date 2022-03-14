import java.util.Scanner;

public class CircleWithException {
    private double radius;
    public static final double PI = Math.PI;


    public CircleWithException() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius < 1) {
            throw new IllegalArgumentException("The radius must be a positive number");
        }else {
            this.radius = radius;
        }
    }

    public double getArea() throws Exception {
        double area = PI * this.radius * this.radius;
        if (area >1000) {
            throw new Exception("The area must not be bigger than 1000");
        }else {
            return PI * this.radius * this.radius;
        }
    }

    public double getDiameter() {
        return this.radius + this.radius;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            CircleWithException circle = new CircleWithException();
            System.out.print("Radius of the circle: ");
            try{
                double radius = Double.parseDouble(sc.nextLine());
                circle.setRadius(radius);
            }
            catch(IllegalArgumentException e){
                System.out.println("The radius must be a positive number");
            }
            System.out.println("The radius of the circle is " + circle.getRadius());
            System.out.println("The area of the circle is " + circle.getArea());
            System.out.println("The diameter of the circle is " + circle.getDiameter());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
