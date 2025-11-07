package Tasks;

public class Dog extends Mammal {

	public Dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog("rock");
		d.sleep();
		d.eat();
		d.makesSound();

	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Dog is eating");
	}

	@Override
	public void makesSound() {
		// TODO Auto-generated method stub
		System.out.println("Dog is barking");
	}

}
