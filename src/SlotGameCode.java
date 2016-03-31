import java.util.Scanner;

public class SlotGameCode {

	// I created a method up here so I can re-use this block of code
	// later on.

	// Variables are up here so they can be used everywhere
	public static int placeBet;
	public static int points = 10;
	public static int endGame;

	// Method to run the random numbers and check if user wins
	public static void slotFunction() {

		System.out.println("...Spinning...");
		for (int i = 1; i == 1; i++) {

			// Create random number 1
			double randomNum1 = Math.floor( Math.random() * 3 ) + 1;
			System.out.println("First Number: " + randomNum1);
			//Create random number 2
			double randomNum2 = Math.floor( Math.random() * 3 ) + 1;
			System.out.println("Second Number: " + randomNum2);
			//Create random number 3
			double randomNum3 = Math.floor( Math.random() * 3 ) + 1;
			System.out.println("Third Number: " + randomNum3);

			// Check if users win
			if (randomNum1 == randomNum2 && randomNum1 == randomNum3) {
				points = placeBet + points;
				System.out.println("Congratulations, You Won");
			} 

			// If user gets two out of three right then they lose half of their bet
			else if (randomNum1 == randomNum2 || randomNum2 == randomNum3 || randomNum1 == randomNum3) {
				System.out.println("Almost! You got 2 out of three right");
				points = points - (placeBet / 2);
			} 

			// If use gets no matches then they lose total bet
			else {
				System.out.println("Sorry, you didn't get any right. Maybe next time");
				points = points - placeBet;
			}

			// If the use loses all of their points then the code stops running
			if (points <= 1) {
				System.out.println("GAME OVER, you lost all of your points. Better luck next time");

				// Exits the program
				System.exit(0);
			}

		}

	}

	// This is where the code actually starts <--------- <------- <------- <-------
	public static void main(String[] args) {

		/* This is a program that will let you play a slot machine game 
		 * It will start out by asking if you want to play, if
		 * you type yes then, it will prompt you to enter amount you
		 * want to bet.
		 * Then the game will run 
		 * 
		 * Then it will show you if you win or not.
		 * After that it will ask if you want to play again
		 */

		/* Outline------
		 * write if/else statement to see if user wants to play
		 * 
		 *  if user wants to play then run code that that simulates a slot machine
		 *  
		 *  print out if user wins
		 *  
		 *  ask if user wants to play again
		 *  
		 *  if user wants to play again re-run code
		 */

		// import scanner
		Scanner input = new Scanner(System.in);

		// Tell user about the game
		System.out.println("This is a game where you bet to see if you can get"
				+ " all three numbers in a row, if you do then you win!");

		// ask if user wants to play
		System.out.println("Would you like to play?");
		String answer1 = input.nextLine();

		// if user entered yes then...
		if (answer1.equalsIgnoreCase("Yes")) {

			//...run this code.
			// you will start out with 10 points
			System.out.println("Here are ten points. Use them wisely");

			System.out.println("Place your bet");
			placeBet = input.nextInt();

			// Checks to see if users bet is to high
			if (placeBet > 10) {
				// If it is then warn them and make them choose again
				System.out.println("You don't have enough points for that bet");

				System.out.println("Place your bet");
				placeBet = input.nextInt();
			}

			// Then the user will press Y to run the game
			if (placeBet >= 1) {

				// This will run the slotFunction() method from the top
				while (placeBet >= 1) {
					slotFunction();

					// Tell user how many points they have
					System.out.println("You have " + points + " points!");

					//Then it will ask user if they want to play again
					System.out.println("Place your next bet");
					placeBet = input.nextInt();
				}

				// If you don't want to play then this will appear
				System.out.println("You ended the game with " + points + " points!");
			}




		} else {

			// This will appear if you didn't event want to play in the first place
			System.out.println("Goodbye");
		}

		//http://stackoverflow.com/questions/7937029/how-to-break-out-or-exit-a-method-in-java
		// This is where I learned how to use the System.exit(0);

		//http://stackoverflow.com/questions/9351955/how-to-use-a-variable-of-one-method-in-another-method
		// This is where I learned how to make the variables usable in both methods

		//http://www.tutorialspoint.com/java/java_methods.htm
		// This is where I learned about methods

	}

}