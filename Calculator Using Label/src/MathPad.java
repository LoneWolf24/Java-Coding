import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class MathPad extends JPanel
{
	private String [] keyLabels = {"/", "*", "-", "+"};
	Screen theScreen;
	double accumReg = 0;
	
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
		accumReg = theScreen.getValue();
		
		switch(mathOpPressed)
		{
		case "+":
			double answer = accumReg + accumReg;
			System.out.println(answer);
			break;
		case "-":
			System.out.println("-");
			break;
		case "*":
			System.out.println("*");
			break;
		case "/":
			System.out.println("/");
			break;
		default:
			System.out.println("Invalid key pressed");
			break;
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
