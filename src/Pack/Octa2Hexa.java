package Pack;

public class Octa2Hexa {
	public static void main(String[] args) {
		int oct=33;
		int sum=0;
		int i=0;
		while (oct>0){
			int r=(int)Math.pow(8,i)*(oct%10);
			System.out.println(r);
			sum+=r;
			oct=oct/10;
			i++;
		}
		//System.out.println(sum);		String hexa="";
		while(sum!=0){
			int r=sum%16;
			if (r>9){
				char dig=(char)((r-10)+'A');
				hexa=dig+hexa;
			}
			else {
				hexa=r+hexa;
			}
			sum=sum/16;
		}
		//System.out.println(hexa);
	}
	
}
