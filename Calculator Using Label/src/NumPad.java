import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class NumPad extends JPanel
{
	
	//*************************PRIVATE VARIABLES**********************************************
	private String [] keyLabels = {"7", "8", "9", "4", "5", "6", "1", "2", "3", "0", ".", "C"};
	private Screen theDisplay;
	//*****************************************************************************************
	
	
	public NumPad(Screen display)
	{
		super(new GridBagLayout());
		GridBagConstraints grid = new GridBagConstraints();	
		NumPadKeyPressListener listener = new NumPadKeyPressListener();
		int labelIndex = 0;
		//a loop to increment Y
		for(int y=0; y<4; y++)
		{
			//a loop to increment X
			for(int x=0; x<3; x++)
			{
				//Create a button at X,Y
				JButton button = new JButton(keyLabels[labelIndex]);
				button.addActionListener(listener);
				//number of the buttons
				labelIndex++;
				
				//location of the button(s)
				grid.gridx = x;
				grid.gridy = y;
				super.add(button, grid);
			}
		}
		
		theDisplay = display;
	}
	
	class NumPadKeyPressListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			JButton keyPressed = (JButton) event.getSource();
			System.out.println("The button " + keyPressed.getText() + " was pressed");
				//Show the digit on the display
				theDisplay.postDigit(keyPressed.getText());
		}
	}
}
