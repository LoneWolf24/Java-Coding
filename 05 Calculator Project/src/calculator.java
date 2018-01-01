import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class calculator 
{
	public static void main(String[] args) 
	{
		//FRAME CLASS
		Frame mainFrame = new Frame();
		//BUTTON LABEL PANELS CLASS
		buttonsLabelsPanels blp = new buttonsLabelsPanels();
		//
		mainFrame.add(blp);
		//VISIBILITIE 
		mainFrame.showIt();
	}
}

class Frame extends JFrame
{
	Frame()
	{
		super.setTitle("Calculator");
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		super.setSize(350, 300);
		super.getContentPane().setBackground(Color.BLACK);
	}
	public void showIt()
	{
		super.setVisible(true);
	}
}
class buttonsLabelsPanels extends JPanel
{
	private JPanel panel1, panel2;
	private JLabel label1;
	private JButton button1, button2, button3, button4, button5, button6, button7, button8, button9, button0, buttonMinus, buttonPlus, buttonMulitply, buttonDvide, buttonEquals, buttonClear;
	buttonsLabelsPanels()
	{
		//NORTH
		panel1 = new JPanel(new GridBagLayout());
		panel1.setBackground(Color.BLACK);
		super.add(panel1, BorderLayout.NORTH);
		//CENTER
		panel2 = new JPanel(new GridBagLayout());
		panel2.setBackground(Color.BLACK);
		super.add(panel2, BorderLayout.CENTER);
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(1, 1, 0, 0);
		//LABEL
		label1 = new JLabel("Calculator");
		label1.setPreferredSize(new Dimension(300, 50)); 
		label1.setForeground(Color.WHITE);
		gbc.gridx = 0;
		gbc.gridy = 0;
		panel1.add(label1, gbc);
		//BUTTON 1
		button1 = new JButton("1");
		gbc.gridx = 0;
		gbc.gridy = 0;
		panel2.add(button1, gbc);
		//BUTTON 2
		button2 = new JButton("2");
		gbc.gridx = 1;
		gbc.gridy = 0;
		panel2.add(button2, gbc);
		//BUTTON 3
		button3 = new JButton("3");
		gbc.gridx = 2;
		gbc.gridy = 0;
		panel2.add(button3, gbc); 
		//BUTTON 4
		button4 = new JButton("4");
		gbc.gridx = 0;
		gbc.gridy = 1;
		panel2.add(button4, gbc);
		//BUTTON 5
		button5 = new JButton("5");
		gbc.gridx = 1;
		gbc.gridy = 1;
		panel2.add(button5, gbc);
		//BUTTON 6
		button6 = new JButton("6");
		gbc.gridx = 2;
		gbc.gridy = 1;
		panel2.add(button6, gbc);
		//BUTTON 7
		button7 = new JButton("7");
		gbc.gridx = 0;
		gbc.gridy = 2;
		panel2.add(button7, gbc);
		//BUTTON 8
		button8 = new JButton("8");
		gbc.gridx = 1;
		gbc.gridy = 2;
		panel2.add(button8, gbc);
		//BUTTON 9
		button9 = new JButton("9");
		gbc.gridx = 2;
		gbc.gridy = 2;
		panel2.add(button9, gbc);
		//BUTTON 0
		button0 = new JButton("0");
		gbc.gridx = 1;
		gbc.gridy = 3;
		panel2.add(button0, gbc);
		//BUTTON Minus (-)
		buttonMinus = new JButton("-");
		gbc.gridx = 3;
		gbc.gridy = 0;
		panel2.add(buttonMinus, gbc);
		//BUTTON Plus (+)
		buttonPlus = new JButton("+");
		gbc.gridx = 3;
		gbc.gridy = 1;
		panel2.add(buttonPlus, gbc);
		//BUTTON Multiply (*)
		buttonMulitply = new JButton("*");
		gbc.gridx = 3;
		gbc.gridy = 2;
		panel2.add(buttonMulitply, gbc);
		//BUTTON DVIDE(/)
		buttonDvide = new JButton("/");
		gbc.gridx = 3;
		gbc.gridy = 3;
		panel2.add(buttonDvide, gbc);
		//BUTTON EQUALS(=)
		buttonEquals = new JButton("=");
		gbc.gridx = 3;
		gbc.gridy = 4;
		panel2.add(buttonEquals, gbc);
		//CLEAR BUTTON
		buttonClear = new JButton("Clear");
		gbc.gridx = 0;
		gbc.gridy = 3;
		panel2.add(buttonClear, gbc);
		
		button0.addActionListener(new button0Action());
		button1.addActionListener(new button1Action());
		button2.addActionListener(new button2Action());
		button3.addActionListener(new button3Action());
		button4.addActionListener(new button4Action());
		button5.addActionListener(new button5Action());
		button6.addActionListener(new button6Action());
		button7.addActionListener(new button7Action());
		button8.addActionListener(new button8Action());
		button9.addActionListener(new button9Action());
		buttonClear.addActionListener(new buttonClearAction());
	}
	//BUTTON 0 ACTION
	public class button0Action implements ActionListener
	{
		public void actionPerformed(ActionEvent evt)
		{
			label1.setText("0");
		}
	}
	//BUTTON 1 ACTION
	public class button1Action implements ActionListener
	{
		public void actionPerformed(ActionEvent evt)
		{
			label1.setText("1");
		}
	}
	//BUTTON 2 ACTION
	public class button2Action implements ActionListener
	{
		public void actionPerformed(ActionEvent evt)
		{
			label1.setText("2");
		}
	}
	//BUTTON 3 ACTION
	public class button3Action implements ActionListener
	{
		public void actionPerformed(ActionEvent evt)
		{
			label1.setText("3");
		}
	}
	//BUTTON 4 ACTION
	public class button4Action implements ActionListener
	{
		public void actionPerformed(ActionEvent evt)
		{
			label1.setText("4");
		}
	}
	//BUTTON 5 ACTION
	public class button5Action implements ActionListener
	{
		public void actionPerformed(ActionEvent evt)
		{
			label1.setText("5");
		}
	}
	//BUTTON 6 ACTION
	public class button6Action implements ActionListener
	{
		public void actionPerformed(ActionEvent evt)
		{
			label1.setText("6");
		}
	}
	//BUTTON 7 ACTION
	public class button7Action implements ActionListener
	{
		public void actionPerformed(ActionEvent evt)
		{
			label1.setText("7");
		}
	}
	//BUTTON 8 ACTION
	public class button8Action implements ActionListener
	{
		public void actionPerformed(ActionEvent evt)
		{
			label1.setText("8");
		}
	}
	//BUTTON 9 ACTION
	public class button9Action implements ActionListener
	{
		public void actionPerformed(ActionEvent evt)
		{
			label1.setText("9");
		}
	}
	//BUTTON CLEAR ACTION
	public class buttonClearAction implements ActionListener
	{
		public void actionPerformed(ActionEvent evt)
		{
			label1.setText("");
		}
	}
	
}

