public class SurfaceCalculatorMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.13, 3.5);

        System.out.println("Rectangle dimensions:");
        System.out.println("Length: " + rectangle.getLength());
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Surface Area: " + rectangle.calculateSurfaceArea());
    }
}
