public class RectangleDriver {
	public static void main( String[] args ) {
		// Rectangle r = new Rectangle();
		// r.length = 10;
		// r.width = 5;

		Rectangle r = new Rectangle(10, 5);
		Rectangle b = new Rectangle(100, 25);
		Rectangle s = new Rectangle(3, 2);
		System.out.println("The area is " + r.getArea());
		System.out.println("The area is " + b.getArea());
		System.out.println("The area is " + s.getArea());

	}
}
