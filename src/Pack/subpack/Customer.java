package Pack.subpack;

class Sbi implements Bank{

	@Override
	public int interestRate(int a) {
		// TODO Auto-generated method stub
		return a*15/100;
	}
	
}

class Icic implements Bank{

	@Override
	public int interestRate(int a) {
		// TODO Auto-generated method stub
		return a*12/100;
	}
	
}

public class Customer extends Sbi{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c= new Customer();
		System.out.println(c.interestRate(100000));

	}

}
;