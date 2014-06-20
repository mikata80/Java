import java.util.Scanner;

public class _01_CountBeers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cntBeers = 0;
		int cntStacks = 0;
		
		while (true) {
			String qtyBeers = sc.nextLine();
			
			if (qtyBeers.equals("End")) {
				break;
			}
			String[] beers = qtyBeers.split(" ");
			
			
			if(beers[1].equals("stacks")){
				cntStacks = cntStacks + Integer.parseInt(beers[0]);
				
			} else{	
					cntBeers = cntBeers + Integer.parseInt(beers[0]);
			}
			
			if (cntBeers >= 20) {
				cntStacks+=(cntBeers-cntBeers%20)/20;
				cntBeers =cntBeers%20;;
			}
			
		}
		sc.close();
		System.out.println(cntStacks+ " stacks + " + cntBeers + " beers");
	}
}
