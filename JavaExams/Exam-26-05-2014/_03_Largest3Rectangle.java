import java.util.Scanner;

public class _03_Largest3Rectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();
		String[] rect = input.split("[ \\[\\]x]+");
		String strS = ""; 
		
		int j = 0;
		int s = 1;
		
		for (int i = 1; i < rect.length; i++) {
			if (j == 1) {
				s = Integer.parseInt(rect[i]) * Integer.parseInt(rect[i - 1]);
				//System.out.println(" sum = " + s);
				strS = strS + s + " ";
			}
			j++;
			if (j == 2) {
				j = 0;
				s=1;
			}
		}
		String[] arrs = strS.split(" ");
		int maxArea = Integer.MIN_VALUE;
		for (int i = 0; i < arrs.length; i++) {
			
			for (int k = i+1; k < arrs.length; k++) {

				for (int m = k+1; m < arrs.length; m++) {
					if(m>k+1){
						k++;
						continue;
					}
					int are1 = Integer.parseInt(arrs[i]);
					int are2 = Integer.parseInt(arrs[k]);
					int are3 = Integer.parseInt(arrs[m]);
					
					int allArea = are1 + are2 + are3;
					//System.out.println(are1 +" + " + are2 +" + " + are3 + " = "+allArea);
					if (allArea > maxArea) {
						maxArea = allArea;
					}
				}
			}
		}
		sc.close();
		System.out.println(maxArea);
	}
}


