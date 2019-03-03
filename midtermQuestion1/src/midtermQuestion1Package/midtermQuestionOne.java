package midtermQuestion1Package;
import java.util.Scanner; // Imports Scanner in order to read user inputs.

class midtermQuestionOne { // Sets Class
	
	public static void main(String[] args) { // Sets main class's visibility, return type, and method signature.
		Scanner scan = new Scanner(System.in); // Opens scanner.
		
		System.out.print("How many numbers will you input into your array? : "); // Prints prompt.
		int numOfList = Integer.parseInt(scan.nextLine()); // Reads user input.
		
		String arrayOfNumbers[] = new String[numOfList]; // Length of array is determined by user input.
		
		// "for" statement prompts user to enter a new number an amount of times equal to the length of the array.
		for (int i = 0; i < arrayOfNumbers.length; i++) {
			System.out.print("Enter number : ");
			arrayOfNumbers[i] = scan.nextLine();
		}
		
		// for statement prints all numbers in finished array.
		for (int i = 0; i < arrayOfNumbers.length; i++) {
			System.out.print(arrayOfNumbers[i] + "\n");
		}
		scan.close(); // Closes scanner.
	}
}
// Finished