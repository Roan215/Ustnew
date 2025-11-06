package Outer;

import java.util.Scanner;

public class Product {
	
	String[] arr=new String[10];
	Scanner sc=new Scanner(System.in);
	
	void add() {
		System.out.println("enter product list");
		for(int i=0;i<3;i++) {
			arr[i]=sc.nextLine();
		}
	}
	
	void display() {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=null) {
				System.out.println(arr[i]);
			}
		}
	}
	
	void delete(int index) {
		this.arr[index]=null;
	}
	
	void update(int index, String name) {
		this.arr[index]=name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product pl=new Product();
		pl.add();
		pl.display();
		pl.delete(1);
		pl.display();
		pl.update(1, "Apples");
		pl.display();
	}

}
