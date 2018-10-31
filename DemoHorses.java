import java.util.*;

public class DemoHorses {
	
	public static void main(String[] args){
		
		Scanner inputDevice=new Scanner(System.in); 
		Horse horse = new Horse();
		RaceHorse raceHorse = new RaceHorse();
		
		System.out.println("\nHello, enter the data about your horse:");
		System.out.println("\nWhat's the horse's name?");
		horse.setName (inputDevice.nextLine()); 
		System.out.println("\nWhat's the horse's color?");
		horse.setColor(inputDevice.nextLine()); 
		System.out.println("\nWhat's the date of birth of the horse?");
		horse.setDob(inputDevice.nextLine()); 
		
		System.out.println();
		System.out.println("Your "+ horse.getColor() + " horse "+ horse.getName() + " is of "+ horse.getDob());
		
		System.out.println("\nHello, enter the data about your race horse:");
		System.out.println("\nWhat's the race horse's name?");
		raceHorse.setName (inputDevice.nextLine()); 
		System.out.println("\nWhat's the race horse's color?");
		raceHorse.setColor(inputDevice.nextLine()); 
		System.out.println("\nWhat's the date of birth of the race horse?");
		raceHorse.setDob(inputDevice.nextLine()); 
		System.out.println("\nWhat's the race horse's number of races?");
		raceHorse.setNumber(inputDevice.nextInt()); 
		inputDevice.nextLine();
		
		System.out.println("Your "+ raceHorse.getColor() + " race horse "+ raceHorse.getName() + " is of "+ raceHorse.getDob()+ " and has participated in " + raceHorse.getNumber()+ " races");
	
	
	
	}
		
		
	
}