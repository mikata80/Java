import java.util.Scanner;

public class SumTwoNumbers {
	/*
	Write a program SumTwoNumbers.java that enters two integers from the console,
	calculates and prints their sum. 
	Search in Internet to learn how to read numbers from the console. 	 
	*/
	
	public static void main(String[] args) {
		System.out.print("Enter a = ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.print("Enter b = ");
		int b = sc.nextInt();
		int sum = a+b;
		System.out.print("sum = ");
		System.out.println(sum);
	}

}
