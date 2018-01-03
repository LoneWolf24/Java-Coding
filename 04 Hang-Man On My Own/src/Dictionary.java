import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Dictionary 
{
	Dictionary() 
	{
		
	}
	
	String fileName = "/Users/abdulazizkodirov/Desktop/HangMan.txt";
	int maxWords = 300;
	int index = 0;
	private String[] dictionary = new String[maxWords];
	@SuppressWarnings("resource")
	public String findTheWord() throws FileNotFoundException
	{
		File words = new File(fileName);
		Scanner wordScan = new Scanner(words);
		while(wordScan.hasNextLine())
		{
			dictionary[index] = wordScan.nextLine();
			index++;
		}
		
		Random rand = new Random();
		return(dictionary[rand.nextInt(5)]);	
	}
	
}
