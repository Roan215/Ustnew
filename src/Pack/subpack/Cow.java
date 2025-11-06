package Pack.subpack;

public class Cow extends Animal implements Mammal{
	
	public static void main(String[] args) {
		Mammal m = new Cow();
		m.run();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("cow moos");
	}
}
