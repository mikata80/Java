import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

/*
 	Write a program that enters an array of strings and finds in it the largest sequence of equal elements. 
 	If several sequences have the same longest length, print the leftmost of them. 
 	The input strings are given as a single line, separated by a space. 
 * */
public class LargestSequence {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input = "a b b xxx c c c";//sc.next();
		//String input2 = input + " mp";//??????
		String[] seq = input.split(" ");
		String[] seq2 = new String[seq.length];
		Arrays.sort(seq);
		String str = seq[0];
		String str2 = "";
		for (int i = 0; i < seq.length; i++) {
			System.out.println(seq[i]);
		}
		//System.out.println(seq.length);
		//System.out.print(seq[0]);
		int j = 0;
		for (int i = 0; i < seq.length; i++) {
			
			//System.out.println("i = "+ i);
			
			if (i == seq.length-1) {
				//j = i;
				break;
			} else{
				j = i+1;
				
				String stri = seq[i];
				String strj = seq[j];
				//System.out.println("j = "+ j);
				
				System.out.printf("stri[%d] =  " ,i);
				System.out.println(stri);
				System.out.printf("strj[%d] = " ,j);
				System.out.println(strj);
				if ( seq[j].equals(seq[i]) ) {
					//System.out.println(i);
				//System.out.print(seq[i] );
					str = str+ " " + strj;
					seq2[i] = str;
				} else{
					str = seq[j];
					seq2[0]= seq[0];
				}
			} 
			
		
			
		}
		sc.close();
		
		
		//System.out.println();
		//System.out.println("str = "+ str);
	}

}
