import java.io.FileNotFoundException;
import java.util.Scanner;

public class Game 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException 
	{
		Dictionary dictionaryClass = new Dictionary();
		String secretWord = dictionaryClass.findTheWord();
		
		System.out.println("***" + secretWord + "***" );		
		//WELCOME MESSAGE
		System.out.println("Weclome to Hang!");
		//LENGHT OF THE SECRET WORD
		int secretWordLength = secretWord.length();
		//TELL THE USER HOW MANY LETTER ARE THEY
		System.out.println("Secret Word has " + secretWordLength + " letters!");
		//TELL THE USR HOW MANY GUESSES THEY HAVE
		System.out.println("You have 6 guesses!");
		System.out.println("----------------------\n");
		//PRINT OUT ___
		char temp[] = new char[secretWordLength]; //Store a temp array which will be displayed to the user
	    for(int i = 0; i < temp.length; i++) //initialize the array
	    {
	        temp[i] = '_';
	    }
		//ASK THE USR TO ENTER THEIR GUESS
		System.out.println("Enter your letter: ");
		
		//VARIABLES
		boolean boo = true;
		int numberOfGuesses = 6;
		char minesPlus = '+';

		//GAME WILL CONTINUE UNTILL boo = false
		while(boo)
		{
			//SCANNER CLASS
			Scanner keybord = new Scanner(System.in);
			//USR'S STRING INPUT
		    String usrGuessStr = keybord.nextLine();
		    //USR'S CHAR INPUT
		    char usrGuessChar = usrGuessStr.charAt(0);
		    //CHECK IF USR'S GUESS MATCH WITH SECRET WORD
		    if(usrGuessStr.equals(secretWord))
		    {
		    		System.out.println("You Win √");
		    		boo = false;
		    }
		    else if(usrGuessStr.length() > secretWord.length())
		    {
		    		System.out.println("Wrong Guess! Try again");
		    		numberOfGuesses--;
		    		minesPlus = '+';
		    		System.out.println("Enter your letter: ");	
		    }
		    else
		    {
		    		//Find matches
		        int foundPos = -2;
		        int foundCount = 0; //How many matches did we find
		    		   
		    		//CHECK IF CHAR USR GUEESED IS IN SECRET WORD
			    if(secretWord.indexOf(usrGuessChar) != -1)
			    {
			    		System.out.println("Secret word has " + "'" + usrGuessChar + "' √");
			    		minesPlus = '+';
			    		
			    		while((foundPos = secretWord.indexOf(usrGuessChar, foundPos + 1)) != -1)
				        {
				            temp[foundPos] = usrGuessChar; //Update the temp array from * to the correct character
				            foundCount++;
				            secretWordLength--; //Decrease overall counter
				        }
			    		
			    		if(foundCount == 0)
			            {
			                System.out.println("Sorry, didn't find any matches for " + usrGuessStr);
			            }
			            else
			            {
			                System.out.println("Found " + foundCount + " matches for " + usrGuessStr);
			            }
			    		
			    		System.out.println("Enter another letter: ");
			    		//Print 
			            for(int i = 0; i < temp.length; i++)
			            {
			                System.out.print(temp[i]);
			            }
			            //System.out.println();

			            if(secretWordLength == 0)
			            {
			            		System.out.println("\n---------------------------");
					        System.out.println("Solved!");
			                break; //Solved!
			            }
			    } 
			    //IF NOT THEN PRINT THIS
			    else
			    {
			    		//IF USER ENTERS ANYTHING OTHERTHAN LETTERS
			    		if(usrGuessChar < 'a' || usrGuessChar > 'z')
			    		{
			    			//THEN PRINT THIS OUT EROOR
			    			System.out.println("That is an invalid character. Try again");
			    			System.out.println("Enter your letter: ");
			    			minesPlus = '+';
			    		}
			    		//IF USR ENTERS LETTER AND THAT LETTER IS NOT IN THE SECRET WORD
			    		else
			    		{
			    			//THEN PRINT THIS ERROR MESSAGE
			    	   		System.out.println("Secret word has no " + "'" + usrGuessChar + "'");
				    		numberOfGuesses--;
				    		minesPlus = '-';
				    		System.out.println("Enter your letter: ");
			    		}
			    }
			    
			    //NOTIFY THE USR HOW MANY GUESSES LEFT
			    if(minesPlus == '-')
			    {
			    		System.out.println(numberOfGuesses + " guesses left!");
			    } 
			  //IF USR RUNS OUT OF GUESSES THEN GAME WILL STOP
			    if(numberOfGuesses == 0)
			    {
			        System.out.println("\n---------------------------");
			        System.out.println("Sorry you didn't find the mystery word!");
			        System.out.println("It was \"" + secretWord + "\"");
			        boo = false;
			    }
		    }
		}	
	}
}
