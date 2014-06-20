import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/*
 Write a program to enter a number n and n integer numbers and sort and print them. 
 Keep the numbers in array of integers: int[]. 
 */
public class SortArrayOfNumbers {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int[] numbers = new int[n];
			for (int i = 0; i < n; i++) {
				numbers[i] = sc.nextInt();
			}
			Arrays.sort(numbers);
			for (int i : numbers) {
				System.out.print(i+" ");
			}
			sc.close();
	}

}
