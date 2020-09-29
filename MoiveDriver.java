package Moive;
import java.util.Scanner;

public class MoiveDriver {

	public static void main(String[]args) {
		String answer;
		Scanner keyboard = new Scanner(System.in);
		do {
			
		Moive firstMoive = new Moive();
		
		
		
		System.out.println("What is the name of the moive");
		String moiveName = keyboard.nextLine();
		
		firstMoive.setTitle(moiveName);
		//System.out.println(firstMoive.getTitle());
		
		System.out.println("Enter the rating of the moive");
		
		String moiveRating = keyboard.nextLine();
		firstMoive.setRating(moiveRating);
		
		System.out.println("Enter the number of tickets sold for this movie");
		int moiveTickets = keyboard.nextInt();
		 
		firstMoive.setSoldTickets(moiveTickets);
		
		System.out.println(firstMoive.toString());
		
		System.out.println("Enter another movie (y or n)");
		keyboard.nextLine();
		answer = keyboard.nextLine();
		      // keyboard.nextLine();
		        
		
		
		}while(answer.equals("y"));
	System.out.println("Goodbye");
		keyboard.close();
	
	}
	
}
