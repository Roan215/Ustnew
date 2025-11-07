package Tasks;

public class Cat extends Mammal {
	
	Cat(String name){
		super(name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c = new Cat("snowbell");
		c.sleep();
		c.eat();
		c.makesSound();

	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Cat is eating");
		
	}

	@Override
	public void makesSound() {
		// TODO Auto-generated method stub
		System.out.println("Cat is meowing");
	}

}
