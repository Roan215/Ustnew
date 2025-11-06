package Outer;

import java.util.Scanner;

public class Multidimensional {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[2][3];
		for (int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.println("enter element");
				arr[i][j]=sc.nextInt();
			}
		}
		for (int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr[i][j]+"\t");	
			}
			System.out.println();
		}
	}
}
