package Pack.subpack;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e = new Employee(101, "Rahul", 10000);
		
		System.out.println(e.getEmpid());
		System.out.println(e.getEmpname());
		System.out.println(e.getSalary());
		
		System.out.println(e);

	}

}
