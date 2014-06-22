package com.ariel.javabasis;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Mikata {

	static TreeMap<String, TreeMap<String, Integer>> mapVal  = new TreeMap<String, TreeMap<String, Integer>>();	

	public static void main(String... args){	
		inputFromKeyboard();
		
		System.out.println("results:");
		System.out.println(getAllProductInfo("apples"));
		System.out.println(getAllProductInfo("bananas"));
	};	
	
	static void putInfo(String name, Integer count, String product){		
		
		if( mapVal.containsKey(product) ){
			TreeMap<String, Integer> inner = mapVal.get(product);
			if( inner.containsKey(name) ){
				Integer obj = inner.get(name);
				inner.put(name, obj+count);
			}else{
				inner.put(name,count);
			}			
		}else{
			TreeMap<String, Integer> inner = new TreeMap<String, Integer>();	
			inner.put(name, count);
			mapVal.put(product, inner);
		}
	}
	
	
	static String getAllProductInfo(String product){		
		
		if( mapVal.containsKey(product) ){
			TreeMap<String, Integer> name1 = mapVal.get(product);
			String cTmp="";
			while( !name1.isEmpty() ){
				Map.Entry<String, Integer> entry = name1.pollFirstEntry(); 
				cTmp+=" "+entry.getKey()+" "+entry.getValue()+", ";
			}
			return product+": "+cTmp;
		}else return "not existing product";
	}
	
	static void inputFromKeyboard(){
		Scanner scan = new Scanner(System.in);
		String line = "";
		while( !line.equalsIgnoreCase("0")){
			System.out.print("Въведете стойности:");
			
			line = scan.nextLine();
			String [] arr = line.split(" ");
			
			if( line.equalsIgnoreCase("0") ) break;
			
			if( arr.length==3){
				Integer count=0;
				try{
					count=Integer.parseInt(arr[1]);
					putInfo(arr[0], count, arr[2]);
				}				
				catch(NumberFormatException nfe){
					System.out.println("Аргумент 2 не  число: "+arr[1]);
				}				
			}else{
				System.out.println("Невалиден брой аргументи");
			}			
		}
		scan.close();
	}
		
}

/*
steve 8 apples
maria 3 bananas
kiro 3 bananas
kiro 9 apples
maria 2 apples
steve 4 apples
kiro 1 bananas
kiro 1 apples

apples : kiro 10, maria 2, steve 12
bananas: kiro 4, maria 3
 */
