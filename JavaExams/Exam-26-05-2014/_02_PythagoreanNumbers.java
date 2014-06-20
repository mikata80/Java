import java.util.Arrays;
import java.util.Scanner;

public class _02_PythagoreanNumbers {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int[] numbers = new int[n];//{41,5,9,12,4,13,40,3};
			boolean isTrue = true;
			for (int i = 0; i < n; i++) {
				numbers[i] = Integer.parseInt(sc.next());
			}
			Arrays.sort(numbers);
			
			for (int i = 0; i < numbers.length; i++) {
				for (int j = i; j < numbers.length; j++) {
					for (int k = j; k < numbers.length; k++) {
						int a = numbers[i];
						int b = numbers[j];
						int c = numbers[k];
						if (a < b  && isPythagorean(a,b,c)|| a ==0 && b == 0 && c ==0 ) {
							System.out.println(a+"*"+a+ " + " +b+"*"+b + " = " +c+"*"+c);
							isTrue = false;
						}
					}
				}
			}
			
			sc.close();
			if(isTrue){
				System.out.println("No");
			}
			
	}
	private static boolean isPythagorean (int a, int b, int c) {
		boolean isValid = false;
		if (a == 0 && b == 0 && c == 0) {
			isValid = true;
		}
		if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
			isValid = true;
		}
		return isValid;
	}

}
