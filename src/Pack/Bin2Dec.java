package Pack;

public class Bin2Dec {
	public static void main(String[] args) {
		
		int bin=11011
				;
		int sum=0;
		int i=0;
		while (bin>0){
			int r=(int)Math.pow(2,i)*(bin%10);
			sum+=r;
			bin=bin/10;
			i++;
		}
		System.out.println(sum);
	}
}
