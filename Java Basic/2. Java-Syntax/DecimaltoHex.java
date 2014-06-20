import java.util.Scanner;

/*
 * Write a program that enters a positive integer number num and converts and prints it in hexadecimal form. 
 * You may use some built-in method from the standard Java libraries. 
 */

public class DecimaltoHex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dec = sc.nextInt();
		String result = Long.toHexString(dec).toUpperCase();
		
        System.out.println(result);
        sc.close();
	}

}
