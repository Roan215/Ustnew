package Pack.subpack;

public class Tiger extends Animal{
	
	void run() {
		System.out.println("Runs Fast");
	}
	
	void eat() {
		System.out.println("eats =non Vwg");
	}
	
class Grass extends Tiger{
	
	void floor() {
		System.out.println("grass on floor");
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tiger t = new Tiger();
		t.eat();
		t.run();
		Grass g = t.new Grass();
		g.eat();
	}
}