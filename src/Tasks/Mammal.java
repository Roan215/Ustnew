package Tasks;

public abstract class Mammal implements Animal{
	String name;
	
	public Mammal() {
		
	}
	
	public Mammal(String name) {
		this.name = name;
	}
	
	public void sleep() {
		System.out.println(name + " is sleeping");
	}
	
	abstract public void makesSound();
}
