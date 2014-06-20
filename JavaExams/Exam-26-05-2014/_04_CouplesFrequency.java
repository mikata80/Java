import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

import com.sun.javafx.collections.MappingChange.Map;

public class _04_CouplesFrequency {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		String input = "3 4 2 3 4 2 1 12 2 3 4";
		String[] couples = input.split(" ");
		int j = 0;
		ArrayList<String> list = new ArrayList<String>();
		
		for (int i = 0; i < couples.length; i++) {
			
			if (i+1 >= couples.length) {
				break;
			} else{
				list.add(couples[i] + " " + couples[i + 1]);
			//System.out.println(couples[i] + " " + couples[i + 1]);
			
			}
			j++;
		}
		
		for (Object  couple : GetUniqueValues(list)) {
			
			System.out.println(couple + " -> "+ 
			String.format("%.2f", Collections.frequency(list, couple)*10.00) + "%");
			
			//System.out.printf("%1$ -> %02d",couple ,Collections.frequency(list, couple)*10.00 + "%");
		}	
		
	}
	
	
	public static ArrayList<String> GetUniqueValues(Collection<String> values)
	{
	    return new ArrayList<String>(new HashSet<String>(values));
	}

}
