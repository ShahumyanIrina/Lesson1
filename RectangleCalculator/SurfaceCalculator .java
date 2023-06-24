import java.awt.Rectangle;

public class Rectangle{
	public static double calculateSurface(Rectangle rectangle) {
		double width = rectangle.width();
		double height = rectangle.height();
		double surface = width * height;
		return surface;
	}

	public static void main(String[] args){
		Rectangle rectangle = new Rectangle(5 ,10);
		double surfaceArea = calculateSurface(rectangle);
		System.out.println("Surface are of the rectangle" + surfaceArea);
	}
	
}