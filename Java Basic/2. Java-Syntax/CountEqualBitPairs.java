import java.util.Scanner;

/*
 * Write a program to count how many sequences of two equal 
 * bits ("00" or "11") can be found in the binary 
 * representation of given integer number n (with overlapping). 
 */
public class CountEqualBitPairs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String bin = Integer.toBinaryString(n);
		int cnt = 0;
		
		char[] binarr = bin.toCharArray();
		
		for (int i = 0; i < binarr.length-1; i++) {
			
			if (binarr[i] == binarr[i+1]) {
				cnt++;
			}
			
		}
		System.out.println(cnt);

		sc.close();
	}

}
