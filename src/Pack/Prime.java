package Pack;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n =sc.nextInt();
		int flag=0;
		for(int i=2;i<n/2;i++) {
			if (n%i==0) {
				flag=1;
				break;
			}
			else {
				continue;
			}
		}
		if (flag!=1) {
			System.out.println("prime");
		}
		else {
			System.out.println("not prime");
		}
	}

}
