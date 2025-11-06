package Pack;

class Recurs {
	public int fact(int a) {
		if(a==0) {
			return 1;
		}
		else {
			a=a*fact(a-1);
			return a;
		}
	}
}

public class Factorial {
	public static void main(String[] args) {
		Recurs r=new Recurs();
		System.out.println(r.fact(5));
	}
}
