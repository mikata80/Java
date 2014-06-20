import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Write a program to extract all email addresses from given text. */
public class ExtractEmails {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] words = input.split(" ");
		Pattern email = Pattern.compile("^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9\\-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
		
		for (String string : words) {
			//System.out.println(string);
			if (string.endsWith(".")) {
				string = string.substring(0, string.length()-1)+"";
			}	
			Matcher match = email.matcher(string);
			while (match.find()) {
				System.out.println(match.group());
			}
		}
		sc.close();
	}
	


}
