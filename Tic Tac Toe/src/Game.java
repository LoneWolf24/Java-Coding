import java.util.Scanner;
public class Game
{

	public static void main(String[] args) 
	{
		//If the gameState = true then game will continue
		//If the gameState = false then game will end!
		 boolean gameState = true;
		
		 //Board class
		Board gameBoard = new Board();
		//Game Messages
		System.out.println("Welcome to Tic Tac Toe");
		System.out.println(" ");
		//Prints the board
		gameBoard.display();
		System.out.println(" ");
		//A class for player 1
		Player player1Class = new Player();
		//A class for player 2
		Player player2Class = new Player();
		
		// Loop while the game is not over
		while(gameState == true)
		{
		
			
			// Ask player X for a row letter
			System.out.println("PLayer X, please enter a row letter: ");
			char playerOneRow = player1Class.player1Char();
			//Check if the letter is CAPITAL
			if(playerOneRow == 'a' || playerOneRow == 'b' || playerOneRow == 'c')
			{
				while(playerOneRow == 'a' || playerOneRow == 'b' || playerOneRow == 'c')
				{
					System.out.println("Player X please enter CAPITAL letter: ");
					playerOneRow = player1Class.player1Char();
				}
				
			}
			//Ask player X for column number
			System.out.println("Player X, please enter a column number: ");
			int playerOneColumn = player1Class.player1Int();
			//Check if the number is valid
			if(playerOneColumn <= -1 || playerOneColumn >= 3)
			{
				while(playerOneColumn <= -1 || playerOneColumn >= 3)
				{
					System.out.println("This is an invalid number, try again: ");
					playerOneColumn = player1Class.player1Int();
				}
				
			}
			
			// Place the proper token on board in the proper place
			if(playerOneRow == 'A')
			{
				gameBoard.theBoard[0][playerOneColumn] = 'X';
			}
			else if(playerOneRow == 'B')
			{
				gameBoard.theBoard[1][playerOneColumn] = 'X';
			}
			else if(playerOneRow == 'C')
			{
				gameBoard.theBoard[2][playerOneColumn] = 'X';
			}
			// Print the board
			gameBoard.display();
			
			if(gameBoard.theBoard[0][0] == 'X' && gameBoard.theBoard[0][1] == 'X' && gameBoard.theBoard[0][2] == 'X')
			{
				System.out.println("Player X wins!");
				gameState = false;
			}
			//Row B
			else if(gameBoard.theBoard[1][0] == 'X' && gameBoard.theBoard[1][1] == 'X' && gameBoard.theBoard[1][2] == 'X')
			{
				System.out.println("Player X wins!");
				gameState = false;
			}
			//Row C
			 else if(gameBoard.theBoard[2][0] == 'X' && gameBoard.theBoard[2][1] == 'X' && gameBoard.theBoard[2][2] == 'X')
			{
				System.out.println("Player X wins!");
				gameState = false;
			}
			//Column 0
			 else if(gameBoard.theBoard[0][0] == 'X' && gameBoard.theBoard[1][0] == 'X' && gameBoard.theBoard[2][0] == 'X')
			{
				System.out.println("Player X wins!");
				gameState = false;
			}
			//Column 1
			 else if(gameBoard.theBoard[0][1] == 'X' && gameBoard.theBoard[1][1] == 'X' && gameBoard.theBoard[2][1] == 'X')
			{
				System.out.println("Player X wins!");
				gameState = false;
			}
			//Column 2
			 else if(gameBoard.theBoard[0][2] == 'X' && gameBoard.theBoard[1][2] == 'X' && gameBoard.theBoard[2][2] == 'X')
			{
				System.out.println("Player X wins!");
				gameState = false;
			}
			//Cross 0-C
			//X
			//  X
			//    X
			 else if(gameBoard.theBoard[0][0] == 'X' && gameBoard.theBoard[1][1] == 'X' && gameBoard.theBoard[2][2] == 'X')
			{
				System.out.println("Player X wins!");
				gameState = false;
			}
			//Cross C-0
			//      X
			//    X
			//  X
			 else if(gameBoard.theBoard[2][0] == 'X' && gameBoard.theBoard[1][1] == 'X' && gameBoard.theBoard[0][2] == 'X')
			{
				System.out.println("Player X wins!");
				gameState = false;
			}
		
			
			if(gameState != false)
			{
				//Ask player O for a row letter
				System.out.println("Player O, please enter a row letter: ");
				char playerTwoRow = player2Class.player2Char();
				
				if(playerTwoRow == 'a' || playerTwoRow == 'b' || playerTwoRow == 'c')
				{
					while(playerTwoRow == 'a' || playerTwoRow == 'b' || playerTwoRow == 'c')
						{
							System.out.println("Player O please enter CAPITAL letter: ");
							playerTwoRow = player2Class.player2Char();
						}
				}
				
				//Ask player O for a column number
				System.out.println("PLayer O, please enter a column number: ");
				int playerTwoColumn = player2Class.player2Int();
				if(playerTwoColumn <= -1 || playerTwoColumn >= 3)
				{
					while(playerTwoColumn <= -1 || playerTwoColumn >= 3) 
						{
							System.out.println("This is an invalid number, try again: ");
							playerTwoColumn = player2Class.player2Int();
						}
				}
				//Place the proper token on board in the proper place
				if(playerTwoRow == 'A')
				{
					gameBoard.theBoard[0][playerTwoColumn] = 'O';
				}
				else if(playerTwoRow == 'B')
				{
					gameBoard.theBoard[1][playerTwoColumn] = 'O';
				}
				else if(playerTwoRow == 'C')
				{
					gameBoard.theBoard[2][playerTwoColumn] = 'O';
				}
				//Print the board
				gameBoard.display();
			}
		
			
			// Print a victory message or a tie message
			//Row A for player O
			if(gameBoard.theBoard[0][0] == 'O' && gameBoard.theBoard[0][1] == 'O' && gameBoard.theBoard[0][2] == 'O')
			{
				System.out.println("Player O wins!");
				gameState = false;
			}
		 	//Row B for player O
		 	else if(gameBoard.theBoard[1][0] == 'O' && gameBoard.theBoard[1][1] == 'O' && gameBoard.theBoard[1][2] == 'O')
		 	{
		 		System.out.println("Player O wins!");
		 		gameState = false;
		 	}
		 	//Row C for player O
		 	else if(gameBoard.theBoard[2][0] == 'O' && gameBoard.theBoard[2][1] == 'O' && gameBoard.theBoard[2][2] == 'O')
		 	{
		 		System.out.println("Player O wins!");
		 		gameState = false;
			}
		 	//Column 0 for player O
		 	else if(gameBoard.theBoard[0][0] == 'O' && gameBoard.theBoard[1][0] == 'O' && gameBoard.theBoard[2][0] == 'O')
		 	{
		 		System.out.println("Player O wins!");
				gameState = false;
			}
		 	//Column 1 for player O
		 	else if(gameBoard.theBoard[0][1] == 'O' && gameBoard.theBoard[1][1] == 'O' && gameBoard.theBoard[2][1] == 'O')
		 	{
		 		System.out.println("Player O wins!");
				gameState = false;
			}
		 	//Column 2 for player O
		 	else if(gameBoard.theBoard[0][2] == 'O' && gameBoard.theBoard[1][2] == 'O' && gameBoard.theBoard[2][2] == 'O')
		 	{
		 		System.out.println("Player O wins!");
				gameState = false;
			}
		 	//Cross 0-C
		 	//O
	 		//  O
		 	//    O
		 	else if(gameBoard.theBoard[0][0] == 'O' && gameBoard.theBoard[1][1] == 'O' && gameBoard.theBoard[2][2] == 'O')
		 	{
		 		System.out.println("Player O wins!");
				gameState = false;
			}
		 	//Cross C-0
		 	//      O
		 	//    O
		 	//  O
		 	else if(gameBoard.theBoard[2][0] == 'O' && gameBoard.theBoard[1][1] == 'O' && gameBoard.theBoard[0][2] == 'O')
			{
				System.out.println("Player O wins!");
				gameState = false;
			}
		
		
		
		 //Game State Display
		 	if(gameState == false)
		 	{
			 System.out.println("Game is over!");
		 	}
		 	else
		 	{
			 System.out.println("Game is in progress!");
		 	}
		 
			 
		}
		
	}
}

class Player
{
	//Scanner for player 1
	public Scanner player1Scanner;
	//Scanner for player 2
	public Scanner player2Scanner;
	
	Player() 
	{
		//Do nothing for now.
	}
	
	//PLayer 1 integer method
	public Integer player1Int()
	{
		//A scanner for player 1
		player1Scanner = new Scanner(System.in);
		//Player one's integer input
		int playerOneInputInt = player1Scanner.nextInt();
		
		//returns a integer 
		return(playerOneInputInt);
	}
	
	//PLayer 1 character method
	public Character player1Char()
	{
		//A scanner for player 1
		player1Scanner = new Scanner(System.in);
		//PLayer one's character input
		char playerOneInputChar = player1Scanner.next().charAt(0);
		//NOW WORKING CURRENTLY
		Character.toUpperCase(playerOneInputChar);
		return(playerOneInputChar);
	}
	
	
	
	//PLayer 2 method
	public Integer player2Int()
	{
		//A scanner for player 2
		player2Scanner = new Scanner(System.in);
		//PLayer two's integer input
		int playerTwoInputInt = player2Scanner.nextInt();
		//Returns an int
		return(playerTwoInputInt);
	}
	
	public Character player2Char()
	{
		//A scanner for player 2
		player2Scanner = new Scanner(System.in);
		//Player two's character input
		char playerTwoInputChar = player2Scanner.next().charAt(0);
		//NOT WORKING CURRENTLY
		Character.toUpperCase(playerTwoInputChar);
		//returns
		return(playerTwoInputChar);
	}
}

class Board
{
	public char [][] theBoard = 
		{
			{' ', ' ', ' '},
			{' ', ' ', ' '},
			{' ', ' ', ' '}
		
		};
	
	Board() 
	{
		// Do nothing for now.
	}
	
	// This method needs to display the current board.
	void display()
	{
		System.out.println("    0   1   2 ");
		System.out.println(" A  " + theBoard[0][0] + " | " + theBoard[0][1] + " | " + theBoard[0][2]);
		System.out.println("    ----------");
		System.out.println(" B  " + theBoard[1][0] + " | " + theBoard[1][1] + " | " + theBoard[1][2]);
		System.out.println("    ----------");
		System.out.println(" C  " + theBoard[2][0] + " | " + theBoard[2][1] + " | " + theBoard[2][2]);
	
		// Challenge: Try to put the above output statements into a loop -- or two.
		
		
	}	
}