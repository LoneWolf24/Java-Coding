import java.awt.*;
import java.awt.event.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

@SuppressWarnings("unused")
public class watchClockWithOutClass
{
	public static void main(String[] args) 
	{
		main mainClass = new main();
	}
	
}
	
@SuppressWarnings("serial")
class main extends JFrame  
{
	//********************VARIABLES****************
	private JButton buttonClr, buttonExit, buttonStart, buttonStop;
	public static JTextArea texBox1, texBox2, texBox3;
	public JLabel startLabel, stopLabel, ammountOFtime;
	private JPanel panelCenter;
	//*********************************************
	main()
	{
		//***********************FRAME****************
		super.setTitle("Watch Clock");
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setSize(800, 900);
		//*********************************************
		
		
		//***********************PANEL*****************
		//Center Panel
		panelCenter = new JPanel(new GridBagLayout());
		panelCenter.setBackground(Color.GRAY);
		super.add(panelCenter, BorderLayout.CENTER);
		//*********************************************
		
		
		//***********************GRID*****************
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(20, 40, 10, 30);
		//********************************************
		
		
		//***********************START THE TIME**********************
		//Start Button
		buttonStart = new JButton("Start");
		gbc.gridx = 0;
		gbc.gridy = 0;
		panelCenter.add(buttonStart, gbc);
		//Label Starting Time
		startLabel = new JLabel("Starting Time: ");
		gbc.gridx = 1;
		gbc.gridy = 0;
		panelCenter.add(startLabel, gbc);
		//Starting Time Text Box 
		texBox1 = new JTextArea("", 2, 20);
		gbc.gridx = 2;
		gbc.gridy = 0;
		panelCenter.add(texBox1, gbc);
		//************************************************************
		
		
		//***********************STOP THE TIME************************
		//Stop Button
		buttonStop = new JButton("Stop");
		gbc.gridx = 0;
		gbc.gridy = 1;
		panelCenter.add(buttonStop, gbc);
		//Label Stopped Time
		stopLabel = new JLabel("Stopped Time: ");
		gbc.gridx = 1;
		gbc.gridy = 1;
		panelCenter.add(stopLabel, gbc);
		//Stopped Time Text Box 
		texBox2 = new JTextArea("", 2, 20);
		gbc.gridx = 2;
		gbc.gridy = 1;
		panelCenter.add(texBox2, gbc);
		//************************************************************
		
		
		//***********************AMMOUNT OF TIME**********************
		//Label
		ammountOFtime = new JLabel("Amount of Time: ");
		gbc.gridx = 1;
		gbc.gridy = 3;
		panelCenter.add(ammountOFtime, gbc);
		
		//Time Text Box
		texBox3 = new JTextArea("", 2, 20);
		gbc.gridx = 2;
		gbc.gridy = 3;
		panelCenter.add(texBox3, gbc);	
		//************************************************************
		
		
		//**********************EXTRA BUTTONS******************
		//Button Clear
		buttonClr = new JButton("Clear");
		gbc.gridx = 1;
		gbc.gridy = 4;
		panelCenter.add(buttonClr, gbc);
		//Button Exit
		buttonExit = new JButton("Exit");
		gbc.gridx = 2;
		gbc.gridy = 4;
		panelCenter.add(buttonExit, gbc);
		//*****************************************************
		
		
		//**********************FUNCTIONS**********************
		buttonStart.addActionListener(new buttonStart());
		buttonStop.addActionListener(new buttonStop());
		buttonClr.addActionListener(new buttonClr());
		buttonExit.addActionListener(new buttonExit());
		//*****************************************************
		
		
		//**********************VISIBILITY*********************
		super.setVisible(true);
		//*****************************************************
	}

	public Date startTime, stopTime;
	class buttonStart implements ActionListener
	{
		public void actionPerformed(ActionEvent evnt)
		{
			//This format ----> 01/14/2018 14:28:56
			DateFormat dateFormat = new SimpleDateFormat("mm/dd/yyyy || HH:mm:ss");
			//This format ---> Sun Jan 14 14:48:55 MST 2018
			Calendar cal = Calendar.getInstance();
			//This format ---> Sun Jan 14 14:48:55 MST 2018
			startTime = cal.getTime();
			//This format ----> 01/14/2018 14:28:56
			System.out.println(dateFormat.format(cal.getTime()));
			//This format ---> Sun Jan 14 14:48:55 MST 2018
			main.texBox1.setText(startTime.toString());
		}
	}

	class buttonStop implements ActionListener
	{
		public void actionPerformed(ActionEvent evt1)
		{
			//This format ----> 01/14/2018 14:28:56
			DateFormat dateFormat = new SimpleDateFormat("mm/dd/yyyy || HH:mm:ss");
			//This format ---> Sun Jan 14 14:48:55 MST 2018
			Calendar cal = Calendar.getInstance();
			
			//This format ----> 01/14/2018 14:28:56
			System.out.println(dateFormat.format(cal.getTime()));
			
			//This format ---> Sun Jan 14 14:48:55 MST 2018
			stopTime = cal.getTime();
			main.texBox2.setText(stopTime.toString());
			
			//Find the difference
			long diff = stopTime.getTime() - startTime.getTime();
			
			//Seconds
			long diffSeconds = diff / 1000 % 60;
			//Minutes 
			long diffMinutes = diff / (60 * 1000) % 60;
			//Hours 
			long diffHours = diff / (60 * 60 * 1000) % 24;
			//Days
			long diffDays = diff / (24 * 60 * 60 * 1000);
			main.texBox3.setText("Day: " + diffDays + " Hours: " + diffHours + " Minutes: " + diffMinutes + " Seconds: " + diffSeconds);
			System.out.println("Day: " + diffDays + " Hours: " + diffHours + " Minutes: " + diffMinutes + " Seconds: " + diffSeconds);
		}
	}

	class buttonClr implements ActionListener
	{
		public void actionPerformed(ActionEvent evt2)
		{
			main.texBox1.setText("");
			main.texBox2.setText("");
			main.texBox3.setText("");
		}
	}
	
	class buttonExit implements ActionListener
	{
		public void actionPerformed(ActionEvent evt3)
		{
			System.exit(0);
		}
	}
}