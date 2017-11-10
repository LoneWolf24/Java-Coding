import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class MathPad extends JPanel
{
	private String [] keyLabels = {"/", "*", "-", "+"};
	Screen theScreen;
	double accumReg = 0;
	private String accumOp = "+";
	
	public MathPad(Screen display)
	{
		super(new GridBagLayout());
		GridBagConstraints grid = new GridBagConstraints();
		MathPadKeyPressed listener = new MathPadKeyPressed();
		
		for(int y=0; y<4; y++)
		{
			JButton button = new JButton(keyLabels[y]);
			button.addActionListener(listener);
			grid.gridx = 0;
			grid.gridy = y;
			super.add(button, grid);
		}	
		theScreen = display;
	}
	
	private void processMathOp(String mathOpPressed)
	{
		if(accumOp != "")
		{
			
			switch(accumOp)
			{
			case "+":
				System.out.println("+");
				accumReg = accumReg + theScreen.getValue();
				break;
				
			case "-":		
				System.out.println("-");
				accumReg = accumReg - theScreen.getValue();
				break;
				
			case "*":
				System.out.println("*");
				accumReg = accumReg * theScreen.getValue();
				break;
				
			case "/":
				System.out.println("/");
				accumReg = accumReg / theScreen.getValue();			
				break;
				
			default:
				System.out.println("Invalid key pressed");
				break;
			}
			theScreen.postValue(accumReg);
			accumOp = mathOpPressed;
		}
		
		else 
		{
			accumReg = theScreen.getValue();
			accumOp = mathOpPressed;
			theScreen.startFresh();
		}
			
	}
	
	class MathPadKeyPressed implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			JButton keyPressed = (JButton)event.getSource();	
			
			processMathOp(keyPressed.getText());
		}
	};
	
}
