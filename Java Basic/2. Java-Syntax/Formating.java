//import java.text.Format;
import java.util.Scanner;

/*
 * Write a program that reads 3 numbers: an integer a (0 ≤ a ≤ 500), a floating-point b 
 * and a floating-point c and prints them in 4 virtual columns on the console. 
 * Each column should have a width of 10 characters. 
 * The number a should be printed in hexadecimal, left aligned; 
 * then the number a should be printed in binary form, padded with zeroes, 
 * then the number b should be printed with 2 digits after the decimal point, 
 * right aligned; the number c should be printed with 3 digits after the decimal point, left aligned.
*/

public class Formating {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		String hexa = Long.toHexString(a).toUpperCase();
		
		String bina = Long.toBinaryString(a);
		
		System.out.println(hexa+ b+c+bina);
		/*System.out.println('|' + String.format("%-10s", hexa) + '|' + bina + '|' 
							   + String.format("%10s", Double.toString(b).format("%.2f", b) + '|')
							   + String.format("%-10s", Double.toString(c).format("%.3f", c) ) + '|'
						  );*/
		sc.close();
	}

}
      