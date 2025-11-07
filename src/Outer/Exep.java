package Outer;

public class Exep {
	public static void main(String[] args) {
		int x=22;
		int y=0;
		try {
			System.out.println(x/y);
		}
		catch(ArithmeticException e) {
			System.out.println("cannot divide by zero");
		}
	}

}
