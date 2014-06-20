import java.util.Scanner;

/*
 * Write a program to check whether a point is inside or outside of the figure below. 
 * The point is given as a pair of floating-point numbers, separated by a space. 
 * Your program should print "Inside" or "Outside". 
 */
public class PointsInsideAFigure {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
				
		String[] arr = n.split(" ");
		double x = Double.parseDouble(arr[0]);
		double y = Double.parseDouble(arr[1]);
		
		String result = "";
		if (x >= 12.5 && x <= 22.5 && y >= 6.0 && y <= 8.5) {
			// rect I
			result = "Inside";
		} else if (x >= 12.5 && x <= 17.5 && y >= 8.5 && y <= 13.5) {
			// rect II
			result = "Inside";
		} else if (x >= 20.0 && x <= 22.5 && y >= 8.5 && y <= 13.5) {
			// rect III
			result = "Inside";
		} else {
			result = "Outside";
		}			
		
		System.out.println(result);	
		sc.close();
	}

}
