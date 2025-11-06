package Pack;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		int result=0;
		for (int i=1;i<=x;i++) {
			result+=i;
		}
		System.out.println(result);
	}

}
