package lab4;


/** 
*The purpose of this class is to model a television
*Your name and today’s date
*/

public class Television {

	
	private final  String MANUFACTURER; // The manufacturer attribute will hold the brand name. This cannot change once the television is created, so will be a named constant
	private final  int SCREEN_SIZE; // will hold the size of the television screen.
	
	private boolean power_On; //hold the value true if the power is on, and false if the power is off.
	private int channel;  // hold the value of the station that the television is showing.
	private int volume;  //hold a number value representing the loudness (0 being no sound).
	
	
	public Television (String brand,int size) { //constructor that  will pass values to _MANUFACTURER and _SCREEN_SIZE from its constants 
	MANUFACTURER = brand; // assign MANUFACTURE to brand
	SCREEN_SIZE = size; // assign SCREEN_SIZE to size
		
		power_On = !power_On; // makes it false 
		volume = 20; // sets volume to 20
		channel = 2; // sets channel to 2
		
		
	}
	
	/**
	 * @param returns int variable volume 
	 */
	public int getVolume() {
		
		return volume;
		
	}
	
	/**
	 * @param returns int variable channel with the channel the tv is on
	 */
	public int getChannel() {
		
		return channel;
	}
	/**
	 * @param returns string variable  with manufacturer brand
	 */
	
	public String getManufacturer() {
		return MANUFACTURER;
		
	}
	/**
	 * @param returns int variable SCREEN_SIZE with size of the TV
	 */
	public int getScreenSize() {
		return SCREEN_SIZE;
	}
	/**
	 * @param sets channel to be equal to channel
	 */
	public void setChannel(int channel) {
		 this.channel = channel;
		
	}
	/**
	 * @param if power_On is true then sets power_on to true if its off then sets power_On to be false.
	 */
	public void power() {
		
		if (power_On) {
			power_On = true;
		}else if(!power_On) {
			power_On = !power_On;
		}
			
	}
	
	/**
	 * @param increases volume by 1
	 */
	public void increaseVolume() {
		
		this.volume++;
	}
	
	/**
	 * @param decreases volume by 1
	 */
	public void decreaseVolume() {
		
		this.volume--;
	}
	
	
	
	
	
	
	
	
	
	
	
}
