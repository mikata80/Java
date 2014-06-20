import java.util.Scanner;

/*Write a program to find how many times a word appears in given text. 
 * The text is given at the first input line. 
 * The target word is given at the second input line. 
 * The output is an integer number. Please ignore the character casing. 
 * Consider that any non-letter character is a word separator*/
public class CountSpecifiedWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input =sc.nextLine();
		String[] words = input.split("[~#$%^&*)(!,? -.`'\"]+") ;
		String secstr = sc.next();
		int cnt = 0;
		for (String string : words) {
			//System.out.println(string.toLowerCase());
			if (string.toLowerCase().equals(secstr.toLowerCase()) ) {
				cnt++;
			}
		}
		System.out.println(cnt);
		sc.close();

	}

}
