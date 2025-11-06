package Pack.subpack;

public class Draw extends Square {
	
	public void welcome() {
		System.out.println("WELCOME");
	}
	
//	public void draw() {
//		System.out.println("draw");
//	}
	public static void main(String[] args) {
		
		Draw d = new Draw();
		d.welcome();
		d.draw();
		Shape.erase();
		
		Shape t = new Triangle();
		t.draw();
		t.print();
	}
}
