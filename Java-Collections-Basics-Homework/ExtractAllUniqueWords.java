
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;


/*
 * At the first line at the console you are given a piece of text. 
 * Extract all words from it and print them in alphabetical order. 
 * Consider each non-letter character as word separator. 
 * Take the repeating words only once. 
 * Ignore the character casing. 
 * Print the result words in a single line, separated by spaces
 * */
public class ExtractAllUniqueWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input =sc.nextLine().toLowerCase();
		input = input.toLowerCase();
		ArrayList<String> arrlist = new ArrayList<String>();
		String[] words = input.split("[\\:~#$%^&*)(!,? -.`'\"]+") ;
		Arrays.sort(words);
		for (String string : words) {
			arrlist.add(string);
		}
		
		removeDuplicate(arrlist);
		String[] newWords = new String[arrlist.size()];
		for (int i = 0; i < newWords.length; i++) {
			newWords[i] = arrlist.get(i);
		}
		
		Arrays.sort(newWords);
		for (String string : newWords) {
			
			System.out.print(string+ " ");
		}
		
		sc.close();
		
	}
	public static void removeDuplicate(ArrayList<String> arlList)
	{
	
	HashSet<String> h = new HashSet<String>(arlList);
	 arlList.clear();
	 arlList.addAll(h);
	 
	}

}
