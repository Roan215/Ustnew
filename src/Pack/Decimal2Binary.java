package Pack;

public class Decimal2Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bin="";
		int dec=4;
		do {
			bin=(dec%2)+bin;
			dec=dec/2;
		}
		while(dec!=1);
		bin=1+bin;
		System.out.println(bin);
	}

}
