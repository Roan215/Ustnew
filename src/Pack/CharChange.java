package Pack;

public class CharChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="WelCome";
		String rs="";
		for (int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if((int)c<91 && (int)c>=65) {
				rs+=String.valueOf(c).toLowerCase();
			}
			else {
				rs+=String.valueOf(c).toUpperCase();
			}
		}
		System.out.println(rs);
	}

}
