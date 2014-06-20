import java.util.HashMap;
import java.util.Map;


public class MostFrequentWord {

	public static void main(String[] args) {
		String input = "Hello my friend, hello my darling. Come on, come here. Welcome, welcome darling.";
		
		Map<String,Integer> wordscount = new HashMap<String,Integer>();

		String[] words = input.split("[\\:~#$%^&*)(!,? -.`'\"]+");
		for(int i=0;i<words.length;i++)
		{
		     String s = words[i].toLowerCase();
		     if(wordscount.keySet().contains(s))
		     {
		          Integer count = wordscount.get(s) + 1;
		          wordscount.put(s, count);
		     }
		     else
		    	 wordscount.put(s, 1);

		}
		
		Integer frequency = 1;
		String mostFrequent = "";
		String[] arrlast = new String[input.length()];
		int j =0;
		for(String s : wordscount.keySet())
		{
		    Integer i = wordscount.get(s);
		    if(i >= frequency)
		    {
		    	
		         frequency = i;
		         mostFrequent = s;
		         if (frequency>1) {
		        	 arrlast[j] = mostFrequent+ " -> "+ frequency+ " times";
					}
		        
		         j++;
		        // System.out.println(mostFrequent+ " -> "+ frequency+ "times");
		    }
		    
		}
		
		for (String string : arrlast) {
			if (string!= null) {
				System.out.println(string);
			}
			
		}
		//System.out.println(mostFrequent+ " -> "+ frequency+ "times");

	}

}
