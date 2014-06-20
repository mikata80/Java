import java.util.Scanner;

/*Write a program to count the number of words in given sentence. Use any non-letter character as word separator.*/
public class CountAllWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] words = input.split("[~#$%^&*)(!,? -.`'\"]+") ;
		System.out.println(words.length);
		sc.close();
	}

}
