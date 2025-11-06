package Outer;

public class Bank {
	int amount = 5000;

	void balance() {
		System.out.println("Acount balance is" + amount);
	}

	void withdraw(int x) {
		if (x < this.amount) {
			this.amount -= x;
			balance();
		} else {
			System.out.println("insufficient balance");
		}
	}

	void deposit(int x) {
		this.amount += x;
		balance();
	}

	public static void main(String[] args) {
		Bank obj = new Bank();
		obj.balance();
		obj.withdraw(2000);
		obj.deposit(1000);
		obj.withdraw(1000000);
		
	}
}
