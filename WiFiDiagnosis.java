import java.util.Scanner;


import javax.swing.JOptionPane;



/**
 * Program will to help the user with their Wifi connectivity issues.
 * @author Jamaine Kwachara
 *
 */
public class WiFiDiagnosis {

	
	public static void main(String[] args) {
		
		
		
		Scanner keyboard = new Scanner(System.in); // get input form keyboard
		
		String response; // store user input
		
		
		System.out.println("Wifi Diagnosis test to help with internet connectivity!\n");
		
		
		System.out.println("Reboot the computer and try to connect.\n");
		
		
		System.out.println("Did it fix the problem?(Yes or No)\n");
	response =keyboard.nextLine();	
	//	response = keyboard.nextLine();
		
		if (response.equalsIgnoreCase("Yes")) {
			System.out.println("Done");
			
			
		 	}else if( response.equalsIgnoreCase("No")) { //step 2 
				System.out.println("Reboot the router and try to connect\n");
					
				System.out.println("Did it fix the problem?(Yes or No)\n");
				
				response = keyboard.nextLine();
				 
				 
				
				if (response.equalsIgnoreCase("Yes")) {
					
					System.out.println("Done");
					
				}else if ( response.equalsIgnoreCase("No")) { // step 3
					System.out.println("Make sure the cables connecting the router are firmly plugged in and the power is getting to the router\n");
					
					System.out.println("Did it fix the problem?(Yes or No)\n");
					
					response = keyboard.nextLine();
					
					if (response.equalsIgnoreCase("Yes")) {
						
						System.out.println("Done\n");
						
					}else if (response.equalsIgnoreCase("No")) { //step 4
						System.out.println("Move the computer closer to the router and try to connect\n");
						
						System.out.println("Did it fix the problem?(Yes or No)\n");
						
						response = keyboard.nextLine();
						if (response.equalsIgnoreCase("Yes")) {
							
							System.out.println("Done\n");
						} else if (response.equalsIgnoreCase("No")) { //step 5
							
							System.out.println("Contact your ISP\n");
							
							System.out.println("Done\n");
							
						}
				
				}
				
			
					/*else if (response.equals("Yes")) {
					
					System.out.println("Done\n");
					
				}else if (response.equals("No")) { //step 4
					System.out.println("Move the computer closer to the router and try to connect\n");
					
					System.out.println("Did it fix the problem?(Yes or No)\n");
					
					response = keyboard.nextLine();
					
				} else if (response.equals("Yes")) {
					
					System.out.println("Done\n");
				} else if (response.equals("No")) { //step 5
					
					System.out.println("Contact your ISP\n");
					
					System.out.println("Done\n");
				}*/
			}
		 	}
	/*	    else if (response.equals("Yes")) {
				
				System.out.println("Done");
				
			}else if ( response.equals("No")) { // step 3
				System.out.println("Make sure the cables connecting the router are firmly plugged in and the power is getting to the router\n");
				
				System.out.println("Did it fix the problem?(Yes or No)\n");
				
				response = keyboard.nextLine();
			} else if (response.equals("Yes")) {
				
				System.out.println("Done\n");
				
			}else if (response.equals("No")) { //step 4
				System.out.println("Move the computer closer to the router and try to connect\n");
				
				System.out.println("Did it fix the problem?(Yes or No)\n");
				
				response = keyboard.nextLine();
				
			} else if (response.equals("Yes")) {
				
				System.out.println("Done\n");
			} else if (response.equals("No")) { //step 5
				
				System.out.println("Contact your ISP\n");
				
				System.out.println("Done\n");
			}
		*/
		System.out.println("Jamaine Kwachara");	
		
		keyboard.close();
		}// main
		
		 }  // class
		
		
	
		
		
	
	

