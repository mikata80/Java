import java.util.Scanner;


public class RectangleArea {

	public static void main(String[] args) {
		//  Write a program that enters the sides of a rectangle 
		// (two integers a and b) and calculates and prints the rectangle's area
		Scanner sc = new Scanner(System.in);
		//System.out.print("Enter a = ");
		double a = sc.nextDouble();
		//System.out.print("Enter b = ");
		double b = sc.nextDouble();
		double p = a*b;
		System.out.println(p);
		sc.close();
	}

}
