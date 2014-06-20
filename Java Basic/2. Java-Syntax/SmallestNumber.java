import java.util.Scanner;

/*Write a program that finds the smallest of three numbers*/

public class SmallestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = Double.parseDouble(sc.next());
		double b = Double.parseDouble(sc.next());
		double c = Double.parseDouble(sc.next());
		
		double d = a;
		
		if (d > b ) {
			d = b;
		} else if (d>c) {
			d = c;
		}
		
		System.out.println(d);
		sc.close();
	}

}
