import java.util.Scanner;

/*Write a program to find how many times given string appears in given text as substring. 
 * The text is given at the first input line.
 *  The search string is given at the second input line. 
 *  The output is an integer number. 
 *  Please ignore the character casing*/
public class Occurrences {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input =sc.nextLine();
		////String[] words = input.split("[~#$%^&*)(!,? -.`'\"]+") ;
		String secstr = sc.next();
		int cnt = 0;
		  for(int i=0; i<input.length()-secstr.length(); i++){
	            if((input.toLowerCase().substring(i, secstr.toLowerCase().length() + i).contains(secstr.toLowerCase()))){
	                cnt++;}
	        }

		System.out.println(cnt);
		sc.close();

	}

}
