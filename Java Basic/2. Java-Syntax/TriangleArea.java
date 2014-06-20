import java.util.Scanner;
//import java.util.function.ToDoubleFunction;

	/*Write a program that enters 3 points in the plane 
	 * (as integer x and y coordinates), 
	 * calculates and prints the area of the triangle composed by these 3 points. 
	 * Round the result to a whole number. 
	 * In case the three points do not form a triangle, print "0" as result
	 * */
public class TriangleArea {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		String[] a = sc.nextLine().split(" ");
		String[] b = sc.nextLine().split(" ");
		String[] c = sc.nextLine().split(" ");
		
		double ax = Double.parseDouble(a[0]); 
		double ay = Double.parseDouble(a[1]);
		double bx = Double.parseDouble(b[0]); 
		double by = Double.parseDouble(b[1]);
		double cx = Double.parseDouble(c[0]); 
		double cy = Double.parseDouble(c[1]);
		
		double area = Math.abs(( ax*(by-cy) + bx*(cy-ay) + cx*(ay - by) )/2);
		
		System.out.println((int)area);
		sc.close();
	}

}
