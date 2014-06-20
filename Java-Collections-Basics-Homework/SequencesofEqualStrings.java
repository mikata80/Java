import java.util.Scanner;

/*
	Write a program that enters an array of strings and finds in it all sequences of equal elements. 
	The input strings are given as a single line, separated by a space. 
 */
public class SequencesofEqualStrings {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String input = sc.next();
			String input2 = input + " mp";//??????
			String[] seq = input2.split(" ");
			
			for (int i = 0; i < seq.length-1; i++) {
				
				if (seq[i].equals(seq[i+1]) ) {
					System.out.print(seq[i] + " ");
				} else {
					System.out.println(seq[i]+ " ");
				}
			}
			sc.close();
	}

	
}
