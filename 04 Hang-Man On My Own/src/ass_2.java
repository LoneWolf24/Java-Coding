import java.util.Scanner;

public class ass_2 {

/**
 * @param args
 */
public static void main(String[] args) {
    // TODO Auto-generated method stub

    //  public static final Comparator<secretWord> CASE_INSENSITIVE_ORDER;

    int attempts = 10;
    Scanner userInput = new Scanner(System.in);


    System.out.println("OK Guessing Player ... turn around, while your friend enters the word to guess!\n");
    System.out.println("Other Player ‐ Enter your word (letters only, no repeated letters and not case sensitive):");

    String secretWord = userInput.next();
    
    int len = secretWord.length(); //Store the length which will be used to see if puzzle was solved.
    char[] temp = new char[len]; //Store a temp array which will be displayed to the user
    for(int i = 0; i < temp.length; i++) //initialize the array
    {
        temp[i] = '*';
    }
    System.out.print("\n");
    System.out.print("Word to date: ");
    while (attempts <= 10 && attempts > 0)
    {
        System.out.println("\nAttempts left: " + attempts);
        System.out.print("Enter letter: ");
        String test = userInput.next();

        if(test.length() != 1) 
        {
            System.out.println("Please enter 1 character");
            continue;
        }

        char testChar = test.charAt(0);

        //Find matches
        int foundPos = -2;
        int foundCount = 0; //How many matches did we find
        while((foundPos = secretWord.indexOf(testChar, foundPos + 1)) != -1)
        {
            temp[foundPos] = testChar; //Update the temp array from * to the correct character
            foundCount++;
            len--; //Decrease overall counter
        }

        if(foundCount == 0)
        {
            System.out.println("Sorry, didn't find any matches for " + test);
        }
        else
        {
            System.out.println("Found " + foundCount + " matches for " + test);
        }

        //Print 
        for(int i = 0; i < temp.length; i++)
        {
            System.out.print(temp[i]);
        }
        System.out.println();

        if(len == 0)
        {
            break; //Solved!
        }

        attempts--;
    }

    if(len == 0)
    {
        System.out.println("\n---------------------------");
        System.out.println("Solved!");
    }
    else
    {
        System.out.println("\n---------------------------");
        System.out.println("Sorry you didn't find the mystery word!");
        System.out.println("It was \"" + secretWord + "\"");
    }
	}
}