import java.util.Scanner;


public class _03_LongestOddEvenSequence {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String input = sc.nextLine();
			String[] seq = input.split("[ () -]+");
			
			for (int i = 0; i < seq.length; i++) {
				System.out.println("seq[" + i+ "] = " + seq[i]);
			}
			System.out.println();
			int cnt=0;
			int j=0;
			boolean isEven = true;
			
//			if (Integer.parseInt(seq[1])%2==0) {
//				cnt++;
//			}else{
//				cnt++;
//				isEven = !isEven;
//			}
			
				
			//System.out.println("len = " + seq.length);
			for (int i = 1; i < seq.length; i++) {
				//j=i+1;
				//System.out.println("i = "  +i + " j = " + j );
//				if (j> seq.length-1) {
//					break;
//				}
//				if (i ==0 ) {
//					continue;
//				}
				if (Integer.parseInt(seq[i])!=0) {
					
					if (Integer.parseInt(seq[i])%2==0) {
						if (!isEven) {
							isEven = !isEven;
						}
						cnt++;
					}else{
						if (isEven) {
							isEven = !isEven;
						}
						cnt++;
						
					}
					System.out.println("seq1[" + i+ "] = " + seq[i] + " " + isEven );
				// cnt++;	
				}
					
					
				
				
				/*if ( (Integer.parseInt(seq[i])%2==0 || Integer.parseInt(seq[j])%2!=0) ||
					 (Integer.parseInt(seq[i])%2!=0 || Integer.parseInt(seq[j])%2==0) &&
					 (Integer.parseInt(seq[i])!=0 && Integer.parseInt(seq[j])!=0)
					) {
					System.out.println("seq1[" + i+ "] = " + seq[i] + " seq1[" + j+ "] = " + seq[j] );
					cnt++;
				}/*else if (Integer.parseInt(seq[i])%2!=0 && Integer.parseInt(seq[j])%2==0) {
					System.out.println("seq2[" + i+ "] = " + seq[i] + " seq2[" + j+ "] = " + seq[j] );
					cnt++;
				}*/
				
			}
			//System.out.println(isEven);
			System.out.println("cnt = " + cnt);
	}
	
	
}
