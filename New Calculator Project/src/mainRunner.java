import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class mainRunner 
{
	public static void main(String[] args) 
	{
			
		Frame mainFrame = new Frame();
		mainFrame.showIt();
	}
}

class Frame extends JFrame
{
	Frame()
	{
		super.setTitle("Calculator");
		super.setSize(300, 350);
		super.getContentPane().setBackground(Color.BLACK);
		super.setResizable(false);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void showIt()
	{
		super.setVisible(true);
	}
}

class buttonsLabelsTxtbox extends JPanel implements ActionListener
{
	
}
