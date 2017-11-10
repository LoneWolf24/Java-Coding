import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class mainRunner
{	
	public static void main(String[] args) 
	{
		//*******CONSTRUCTORS************************	
		mainRunner calculator = new mainRunner();
		//******************************************
	}
	
	public mainRunner() 
	{
		//******SCREEN CLASS IS BEING CALLED********
		Screen screen = new Screen();
		NumPad NumPad = new NumPad(screen);
		MathPad mathPad = new MathPad(screen);
		//******************************************
		
		//******FRAME*******************************
		Frame frame = new JFrame();
		frame.add(screen, BorderLayout.NORTH);
		frame.add(NumPad, BorderLayout.WEST);
		frame.add(mathPad, BorderLayout.CENTER);
		//.pack() gives just enough space to fit the buttons in the frame
		frame.pack();
		frame.setVisible(true);
	}
}