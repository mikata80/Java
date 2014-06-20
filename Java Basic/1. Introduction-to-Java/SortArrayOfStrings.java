import java.util.Arrays;
import java.util.Scanner;


public class SortArrayOfStrings {
	 /* Write a program that enters from the console number n and n strings, 
	  * then sorts them alphabetically and prints them. 
	  * Note: you might need to learn how to use loops and arrays in Java 
	  * (search in Internet). 
	  */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String[] arr = new String[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();
		}
		
		Arrays.sort(arr);
		
		for (String string : arr) {
			System.out.println(string);
		}
	}
}
