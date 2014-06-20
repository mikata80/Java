import java.util.Scanner;


/*Write a program to calculate the count of bits 1 in the binary representation of given integer number n. */

public class CountOfBitsOne {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = Integer.bitCount(n);
		System.out.println(cnt);
		sc.close();
	}
	
}
