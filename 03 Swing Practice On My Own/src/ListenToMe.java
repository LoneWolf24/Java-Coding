import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ListenToMe 
{
	public static void main(String[] args)
	{
		//FRAME CLASS IS BEING CALLED
		Frame mainFrame = new Frame();
		
		//PushCounterPanel CLASS IS BEING CALLED
		PushCounterPanel pushPanel = new PushCounterPanel();
		//mainFrame IS DISPLAYING pushPanel ON THE SCREEN
		mainFrame.add(pushPanel, BorderLayout.NORTH);
		
		//Punch CLASS IS BEING CALLED
		Punch punch = new Punch();
		//mainFrame IS DISPLAYING Punch CLASS ON THE SCREEN
		mainFrame.add(punch);
		
		//SHOW VISIBILITIE ON THE FRAME CLASS
		mainFrame.showIt();
	}
}

//FRAME CLASS
class Frame extends JFrame
{
	public Frame()
	{
		//TITLE
		super.setTitle("Anothing Swing Practice");
		//(don't know what this is) I think it means stop running
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//BACKGROUND COLOR
		//THIS ONE DOES NOT WORK
		//super.setBackground(Color.GREEN);
		//THIS ONE WORKS
		super.getContentPane().setBackground(Color.GREEN);
		//SIZE OF THE WINDOW
		super.setSize(200, 200);	
	}
	
	//SHOW METHOD
	public void showIt()
	{
		//VISIBILITY 
		super.setVisible(true);
	}
}

//PUSH COUNTER PANEL CLASS 
class PushCounterPanel extends JPanel
{
	//PRIVATE VARIABLES
	private int count = 0; 
	private JLabel label;
	private JButton button;
	
	//CONSTRUCTOR 
	PushCounterPanel()
	{
		//FIRST BUTTON 
		button = new JButton("Push Me");
		//
		button.addActionListener(new ButtonListener());
		//FIRST LABEL
		label = new JLabel("Pushes: " + count);
		//STUFF THAT SHOWS UP ON THE SCREEN
		super.add(label);
		super.add(button);	
	}
	
	//BUTTON ACTION STUFF
	private class ButtonListener implements ActionListener 
	{
		@Override
		public void actionPerformed(ActionEvent evt)
		{
			System.out.println("Pushes " + count);
			 count = count + 1;
			 label.setText("Pushes: " + count);
			
		}
	}
}

class Punch extends JPanel
{
	//VARIABLES
	private JButton rightButton;
	private JButton leftButton;
	private JLabel label;
	private JPanel panel, panel2, panel3, panel4;
	
	Punch()
	{
		//BUTTONS
		rightButton = new JButton("Right");
		leftButton = new JButton("Left");
		//LABELS
		label = new JLabel("Update me");
		//PANELS
		panel = new JPanel(new GridBagLayout());
		super.add(panel, BorderLayout.NORTH);	
		
		panel2 = new JPanel(new GridBagLayout());
		super.add(panel2, BorderLayout.WEST);	
		
		panel3 = new JPanel(new GridBagLayout());
		super.add(panel3, BorderLayout.EAST);	
		
		super.setPreferredSize(new Dimension(150, 70));
			
		//ADDING THE BUTTONS
		panel2.add(rightButton);
		panel3.add(leftButton);
		
		//ACTION FOR RIGHT BUTTON IS BEING CALLED
		rightButton.addActionListener(new ButtonListenerRight());
		//ACTION FOR LEFT BUTTON IS BEING CALLED
		leftButton.addActionListener(new ButtonListenerLeft());
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(20, 40, 10, 30);
		gbc.gridx = 1;
		gbc.gridy = 0;
		panel.add(label, gbc);
	}
	
	//ACTION FOR RIGHT BUTTON
	private class ButtonListenerRight implements ActionListener
	{
		public void actionPerformed(ActionEvent evnt)
		{
			label.setText("Update: Right");
			System.out.println("Update: Right");
		}
	}
	//ACTION FOR RIGHT BUTTON
	private class ButtonListenerLeft implements ActionListener
	{
		public void actionPerformed(ActionEvent evnt2)
		{
			label.setText("Update: Left");
			System.out.println("Update: Left");
		}
	}
}