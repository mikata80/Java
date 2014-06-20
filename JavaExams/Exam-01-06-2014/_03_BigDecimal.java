import java.math.BigDecimal;
import java.util.Scanner;


public class _03_BigDecimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] numbers = input.split("[ +-]+");
		String[] signs =  input.split("[ [0-9].]+");
		
		BigDecimal sum = new BigDecimal(0);
		
		System.out.println(signs.length);
		for (int i = 0; i < signs.length; i++) {
			System.out.printf("sign[%s] = %s ",i, signs[i]);
		}
		System.out.println('\n');
		for (int i = 0; i < numbers.length; i++) {
			System.out.printf("numbers[%s] = %s ",i,numbers[i]);
			if (numbers[i].equals("")) {
				continue;
			}
			Double num = Double.parseDouble(numbers[i]);
			
			//System.out.println(big);
			 
			
			for (int j = i; j < i+1; j++) {
				String sign1 = signs[j];
				System.out.printf("sign[%s] = %s ",j,sign1);
				if (sign1.equals("")) {
					sign1="+";
				}
				if (sign1.equals("+")) {
					sum = sum.add(new BigDecimal(num));	
				}
				if (sign1.equals("-")) {
					sum = sum.subtract(new BigDecimal(num));
				}
			}
			
		//	System.out.print(" "+ sum + "\n");
		//	System.out.println("-----------------");
		}
		int decimalPlaces = 7;
		sum = sum.setScale(decimalPlaces, BigDecimal.ROUND_UP);
		System.out.println(sum);
	}

}
