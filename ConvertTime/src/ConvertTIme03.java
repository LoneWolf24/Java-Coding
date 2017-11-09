import java.util.Scanner;
public class ConvertTIme03
{

	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		
		//Prompt the user
		System.out.print("Enter Number of Seconds: ");
		
		//Save user input in seconds 
		 Scanner keyboard = new Scanner(System.in);
		int seconds = keyboard.nextInt();
		
		//Calculate # of hours 
		int hours = (seconds / 3600);
		
		//Update the seconds variable 
		int secondsMinusHours = seconds - (hours * 3600);
		
		//Calculate # of minutes 
		int minutes = (secondsMinusHours / 60);
		
		//Update the seconds variable
		seconds = secondsMinusHours - (minutes * 60);
		
		//Print it all
		System.out.println("Total Seconds: " + (hours*3600 + minutes*60 + seconds));
		System.out.println("Hours: " + hours);
		System.out.println("Minutes: " + minutes);
		System.out.println("Seconds: " + seconds);
	}

}
