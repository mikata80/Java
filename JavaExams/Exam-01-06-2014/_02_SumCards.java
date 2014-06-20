import java.util.Scanner;


public class _02_SumCards {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] numbers = input.split("[SHDC ]+");
		int sum = 0;
		int prevValue = -1;
		int count = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			
			String num = numbers[i];
			
			int value = numValue(num);
			//System.out.println("NUM + " + num + " -> value = " + value + " prevValue = " + prevValue + " count = " + count);
			
			if (value == prevValue) {
				count++;
			} else {
				count = 1;
			}
			sum = sum + value;
			if (count == 2){
				sum = sum + 2 * value;
			}
			if (count > 2) {
				sum = sum + value;
			}
			prevValue = value;
			
			System.out.println("NUM + " + num + " -> value = " + value + " prevValue = " + prevValue + " count = " + count + " sum = " + sum);
			System.out.println("-----------------------------------");
		}
		
		System.out.println(sum);
		
		/*
			 String num = numbers[i];
			String numNext = numbers[i+1];
			
			
			if (num.equals(numNext) ) {
				cnt++;
				if (cnt == 2) {
					sum +=numValue(num);
					sum *=2;
				} else {
					sum +=numValue(num)+ numValue(numNext);
				}
			
			} else {
				sum+= numValue(numNext);
				cnt=0;
			}
			 System.out.println("num = " + numValue(num)  + " numNext = " + numValue(numNext)  + " sum = " + sum + " cnt = "+ cnt);
			 System.out.println("-----------------");
		}
		
		System.out.println(sum);
		*/
	}
	
	private static int numValue(String numStr) {
		int value = 0;
		
		
		
		switch (numStr) {
			case "2":value = 2;
				break;
			case "3":value = 3;
				break;
			case "4":value = 4;
				break;
			case "5":value = 5;
				break;
			case "6":value = 6;
				break;
			case "7":value = 7;
				break;
			case "8":value = 8;
				break;
			case "9":value = 9;
				break;	
			case "10":value = 10;
				break;
			case "J":value = 12;
				break;	
			case "Q":value = 13;
				break;
			case "K":value = 14;
				break;
			case "A":value = 15;
				break;
			}
		return value;
	}

}
