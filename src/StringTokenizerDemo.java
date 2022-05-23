
import java.util.*;

public class StringTokenizerDemo {
		public static int getSum(String s) {
		
		int sum=0;
		
		StringTokenizer obj=new StringTokenizer(s);
		while(obj.hasMoreTokens()) {
			int n=Integer.parseInt(obj.nextToken());
			sum+=n;
			
		}
		
       return sum;
	}
	public static void main(String[] args) {
		int result=getSum("2 3 4 6");
		System.out.println(result);
		
		
		
		
	}

}
