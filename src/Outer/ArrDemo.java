package Outer;

public class ArrDemo {

	public static void main(String[] args) {
		int marks[]= {22,33,44,55,66};
		int count=0;
		for(int i : marks) {
			if(i<40) {
				count+=1;
			}
			System.out.println(i);
		}
		int marks1[]=new int[10];
		System.out.println("you have failed "+count+" subjects");
	}

}
