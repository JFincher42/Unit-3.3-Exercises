
public class DoubleIt {

	public static void main(String[] args) {
		System.out.println(1 + doubleIt(2 + doubleIt(3)));
	}

	public static int doubleIt(int num) {
		return num*2;
	}
}
