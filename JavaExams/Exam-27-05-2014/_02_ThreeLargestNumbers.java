import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class _02_ThreeLargestNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		BigDecimal[] bigarray = new BigDecimal[n];
		
		for (int i = 0; i < bigarray.length; i++) {
			String strbig = sc.next();
			BigDecimal newbig = new BigDecimal(strbig);
			bigarray[i] = newbig;
		}
		
		Arrays.sort(bigarray);
		
//		for (int i = 0; i < bigarray.length; i++) {
//			
//			System.out.println(bigarray[i]);
//		}
		if (n > 1) {
			int ch = 3;
			if (n<3) {
				ch = n;
			}
//			for (int i = n-ch; i < bigarray.length; i++) {
//				
//				System.out.println("i= " +i + " " + bigarray[i]);
//			}
			
			for (int i = bigarray.length; i >=n-ch; i--) {
				if (i< bigarray.length) {
					System.out.println(bigarray[i].toString() );
				}
			}
			
		} else {
			System.out.println(bigarray[0] );	
		}
		
		sc.close();
	   
	  }
}
