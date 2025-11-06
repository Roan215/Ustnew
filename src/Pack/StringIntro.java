package Pack;

public class StringIntro {
	public static void main(String[] args) {
		String s1 = "Welcome ";
		System.out.println(s1.charAt(2));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.length());
		
		//no reverse method in String class so do manually or use String Buffer
		
		System.out.println(s1.repeat(4));
		System.out.println(s1.replace('e', '5'));
		String arr[]=s1.split("l");
		for(int i=0;i< arr.length;i++) {
			System.out.println(arr[i]);
		}
		StringBuffer s2= new StringBuffer("Welcome");
		s2.reverse();
		s2.append("to java");
		System.out.println(s2);
		String wierd= s2.toString();
		s2.append("hehe").append(" gotchya");
		System.out.println(s2);
		System.out.println(s1.hashCode());
	}
}
