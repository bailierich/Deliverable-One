import java.util.Scanner;

public class ChoosingAVacation {

	public static void main(String[] args) {
		String vacationType;
		int groupSize;
		String result;
		String destination = null;
		String travelSuggestion = null;
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("What kind of trip would you like to go on, musical,\r\n" + 
				"tropical, or adventurous?");
		vacationType = scnr.next();
		
		System.out.println("How many are in your group?");
		groupSize = scnr.nextInt();
		
		if (vacationType.equals("tropical")) {
			destination = "beach vacation in Mexico.";
		}
		else if (vacationType.equals("musical")) {
			destination = "New Orleans.";
		}
		else if (vacationType.equals("adventurous")) {
			destination = "whitewater rafting the Grand Canyon.";
		}
		else {
			System.out.println("Wrong Input!");
		}
		
		if (groupSize <= 2 ) {
			travelSuggestion = "first class";
		}
		else if (groupSize <= 5) {
			travelSuggestion = "helicopter";
		}
		else if (groupSize >= 6) {
			travelSuggestion = "charter flight";
		}
		else {
			System.out.println("Wrong Input");
		}
				
		result = "Since you're a group of "	+ groupSize + " going on a " + vacationType +
				" vacation, you should take a " + travelSuggestion + " to " + destination;
		
		System.out.println(result);

	}

}
