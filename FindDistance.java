import java.util.Scanner; // For user input

public class FindDistance {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int x1, y1, x2, y2; // Initializes variables
		double distance;
		
		
		System.out.println("The program will calculate the distance between two points "
				+ "\nPlease enter the x and y values for the first point");
		
		
		// Getting the values of the points from the user (First point)
		System.out.println("x:");
		x1 = scanner.nextInt(); // Takes the x value from the user for the first point
		System.out.println("y: ");
		y1 = scanner.nextInt();// Takes the y value from the user for the first point
		
		// Getting the values of the points from the user (Second point)
		System.out.println("Please enter the x and y values for the second point ");
		System.out.println("x:");
		x2 = scanner.nextInt(); // Takes the x value from the user for the second point
		System.out.println("y: ");
		y2 = scanner.nextInt(); // Takes the y value from the user for the second point
		
		distance = getDistance(x1, y1, x2, y2); // Rounds the distance to the correct decimal place
		// Printing out the distance and the classification
		System.out.println("The distance between these two points is " + distance);
		System.out.println("Classification: " + classifyDistance(distance));
		
		scanner.close(); // Closes the scanner
		
	}
	
	public static double getDistance(int x1, int y1, int x2, int y2) { // Method to get the distance between two points
		return Math.round(Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2-y1), 2))) * 100) / 100.0; // Uses the pythagorens thrm to calculate the distance between the two points, multiplied by 100 for rounding
	}
	
	public static String classifyDistance(double distance) { // Method to classify the distance
		if (distance < 5) { 
			return "Short"; // Short case
		}
		else if (distance <= 15) {
			return "Medium"; // Medium case 
		}
		else if (distance > 15) {
			return "Long"; // Long case
		}
		return "Wrong"; // Wrong case
	}
	
}
