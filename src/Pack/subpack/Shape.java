package Pack.subpack;

public interface Shape {
	public void draw();
	public static void erase() {
		System.out.println("erase");
	}
	default void print() {
		System.out.println("print");
	}
}
