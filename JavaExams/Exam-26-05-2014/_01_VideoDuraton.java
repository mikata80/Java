import java.util.Scanner;


public class _01_VideoDuraton {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int totalMinutes=0;
		
		
		while (true) {
			String videoDuration = sc.nextLine();
			if (videoDuration.equals("End")) {
				break;
			}
			String[] tokens = videoDuration.split(":");
			int hours = Integer.parseInt(tokens[0]);
			int minutes = Integer.parseInt(tokens[1]);
			totalMinutes = totalMinutes + hours * 60 + minutes;
		}
		sc.close();
		System.out.printf("%d:%02d",totalMinutes/60,totalMinutes%60);
	}
	
	
}
