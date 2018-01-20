import java.util.Scanner;
public class ConvertToSeconds 
{
	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		//****************CALLING CLASSES******************************
		hoursMinutesToSeconds hms = new hoursMinutesToSeconds();
		//*************************************************************
	}
}

class hoursMinutesToSeconds
{
	//**************PRIVATE VARIABLES*********
	final int SEC_PER_DAY = 60 * 60 * 24;
	final int SEC_PER_HOUR = 60 * 60;
	final int SEC_PER_MIN = 60;
	
	private int hours;
	private int minutes;
	private int seconds;
	private int totalSeconds;
	//****************************************
	
	hoursMinutesToSeconds()
	{
		//***CALLING METHODS***
		DaysOrHoursOrMinutes();
		//*********************
	}
	
	//this class shows how many Days or hours or minutes in total seconds
	@SuppressWarnings("resource")
	public void DaysOrHoursOrMinutes()
	{
		do
		{
		//********SCANNER AND USER'S INPUT********
		Scanner kyb = new Scanner(System.in);
		System.out.println("Enter # of seconds: ");
		totalSeconds = kyb.nextInt();
		//****************************************
		
		
		//***********HOW MANY DAYS IN TOTAL SECONDS*****
		int day = (totalSeconds / SEC_PER_DAY) ;
		System.out.println("Days: " + day);
		//**********************************************
		
		
		//********HOW MANY HOURS IN TOTAL SECONDS*******
		hours = totalSeconds / SEC_PER_HOUR;
		System.out.println("Hours: " + hours);
		//**********************************************
		
		
		//********HOW MANY MINUTES IN TOTAL SECONDS*****
		minutes = totalSeconds / SEC_PER_MIN;
		System.out.println("Minutes: " + minutes);
		//**********************************************
		
		
		//********HOW MANY SECONDS IN TOTAL SECONDS*****
		seconds = totalSeconds;
		System.out.println("Seconds: " + seconds);
		//**********************************************
		}while(true);
	}
	
	//this class shows how many Days and hours and minutes in x # of seconds
	@SuppressWarnings("resource")
	public void DaysAndHoursAndMinutes()
	{
		do
		{
		//********SCANNER AND USER'S INPUT********
		Scanner kyb = new Scanner(System.in);
		System.out.println("Enter # of seconds: ");
		totalSeconds = kyb.nextInt();
		//****************************************
		
		
		//********HOW MANY DAYS IN TOTAL SECONDS********
		int day = totalSeconds / SEC_PER_DAY;
		System.out.println("Days: " + day);
		//**********************************************
		
		
		//********HOW MANY HOURS IN TOTAL SECONDS*******
		hours = (totalSeconds / SEC_PER_HOUR)  ;
		System.out.println("Hours: " + hours);
		//**********************************************
		
		//********HOW MANY MINUTES IN TOTAL SECONDS*****
		minutes = (totalSeconds % SEC_PER_HOUR) / SEC_PER_MIN;
		System.out.println("Minutes: " + minutes);
		//**********************************************
		
		//********HOW MANY SECONDS IN TOTAL SECONDS*****
		seconds = (totalSeconds % SEC_PER_HOUR) % SEC_PER_MIN;
		System.out.println("Seconds: " + seconds);
		//**********************************************
		}while(true);
	}
}
