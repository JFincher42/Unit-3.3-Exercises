
public class Rectangle {

	public static int area(int width, int height) {
		return width*height;
	}
	
	public static double coneVolume(double radius, double height) {
		return Math.PI*radius*radius*height/3;
	}

	public static void main(String[] args) {
		System.out.println("Area of (4,5) is " + area(4,5));
		System.out.println("Area of (5,4) is " + area(5,4));
		System.out.println("Area of (20,2) is " + area(20,2));
		System.out.println("Area of (12,17) is " + area(12,17));
		System.out.println("Volume of cone of (3, 5) is " + coneVolume(3,5));
	}
	
}
