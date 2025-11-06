package Outer;

import java.util.Scanner;

class Product1 {
	int id;
	String name;
	double price;

	@Override
	public String toString() {
		return "Product1 [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

}

public class Productlist {
	Product1 p[] = new Product1[3];
	Scanner sc = new Scanner(System.in);

	void add() {
		for (int i = 0; i < p.length; i++) {
			p[i] = new Product1();
			System.out.println("Enter the id:");
			p[i].id = sc.nextInt();
			System.out.println("Enter the name:");
			p[i].name = sc.next();
			System.out.println("Enter the price:");
			p[i].price = sc.nextDouble();
		}
	}

	void display() {
		for (int i = 0; i < p.length; i++) {
			if (p[i] != null) {
				System.out.println(p[i]);
			}
		}
	}

	void search(int id) {
		for (int i = 0; i < p.length; i++) {
			if (p[i].id == id) {
				System.out.println(p[i]);
			}
		}

	}

	void delete(int id) {
		for (int i = 0; i < p.length; i++) {
			if (p[i].id == id) {
				p[i] = null;
				System.out.println("Deleted");
				display();
			}
		}
	}

	void update(int id) {
		for (int i = 0; i < p.length; i++) {
			if (p[i] == null) {
				p[i] = new Product1();
			}
			if (p[i].id == id) {
				System.out.println("Enter the name:");
				p[i].name = sc.next();
				System.out.println("Enter the price:");
				p[i].price = sc.nextDouble();
			}
		}
	}

	public static void main(String[] args) {
		Productlist pl = new Productlist();
		System.out.println("-------------------------------------------------------------------");
		pl.add();
		System.out.println("-------------------------------------------------------------------");
		pl.display();
		System.out.println("-------------------------------------------------------------------");
		pl.search(2);
		System.out.println("-------------------------------------------------------------------");
		pl.delete(3);
		System.out.println("-------------------------------------------------------------------");
		pl.update(0);
		System.out.println("-------------------------------------------------------------------");
		pl.display();
		System.out.println("-------------------------------------------------------------------");
	}

}