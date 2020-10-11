package NumberGuesser;
/** 
 * This program will narrow down the choices according to your previous guesses, and continue to prompt you to enter a guess until you guess correctly.  
 * @author Jamaine Kwachara
 */
import java.util.Scanner;
public class RandomNumberGuesser {
	
	public static void main(String[]args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		RNG rng = new RNG();
		String answer;
		int nextGuess,randNum;
		int lowGuess = 0; 
		int highGuess = 100;
		int wrongCounter=0;
		
	
			//rng.resetCount();
		
		System.out.println("=========================================");
		
	do {	
		randNum = rng.rand();
		lowGuess = 0; 
	     highGuess = 100;
        wrongCounter=0;
		
		
		System.out.println("Enter your first guess");
		
		nextGuess = keyboard.nextInt();
		rng.resetCount();
		
		while(!rng.inputValidation(nextGuess, lowGuess, highGuess)) { // make sure input is with accepted range
			nextGuess= keyboard.nextInt();
			rng.resetCount();
			}
		
		do {
		System.out.println("Number of guesses is " + ((rng.getCount())-wrongCounter));
		
		if(nextGuess<randNum) // assign new limit on range depending on a high or low guess 
		{
			
			System.out.println("Your guess is too low");
			lowGuess = nextGuess;
			System.out.println("Enter your next guess between "+ lowGuess + " and "+ highGuess);
			
			nextGuess= keyboard.nextInt();
			while(!rng.inputValidation(nextGuess, lowGuess, highGuess)) { // make sure input is with accepted range
				nextGuess= keyboard.nextInt();
				wrongCounter++;
			}
			
			
		}else if( nextGuess>randNum) { 
			System.out.println("Your guess is too high");
			highGuess = nextGuess;
			System.out.println("Enter your next guess between "+ lowGuess + " and "+ highGuess);
			
		    nextGuess= keyboard.nextInt();
			while(!rng.inputValidation(nextGuess, lowGuess, highGuess)) { // make sure input is with accepted range
				nextGuess= keyboard.nextInt();
				wrongCounter++;
			}
			
			
		
			}//end of if
	
		}while(nextGuess != randNum);
		
		System.out.println("Congratulations, you guessed correctly");
		System.out.println("Try again? (yes or no)");
		keyboard.nextLine();
		answer = keyboard.nextLine();
	}while(answer.equals("yes"));
	System.out.println("Thanks for playing...");
	System.out.println("Jamaine Kwachara");
			keyboard.close();
	}//main

}
