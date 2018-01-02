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
		//VISIBILITY
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
		super.setResizable(false);
	}
	public void showIt()
	{
		super.setVisible(true);
	}
}
class buttonsLabelsPanels extends JPanel implements ActionListener
{
	private JPanel panel1, panel2;
	private JTextField textField;
	private JButton button1, button2, button3, button4, button5, button6, button7, button8, button9, button0, buttonMinus, buttonPlus, buttonMulitply, buttonDvide, buttonEquals, buttonClear, buttonDel;
    static double a=0,b=0,result=0;
    static int operator=0;
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
		textField = new JTextField();
		textField.setPreferredSize(new Dimension(300, 50)); 
		textField.setForeground(Color.BLACK);
		gbc.gridx = 0;
		gbc.gridy = 0;
		panel1.add(textField, gbc);
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
		//DELETE BUTTON
		buttonDel = new JButton("Delete");
		gbc.gridx = 2;
		gbc.gridy = 3;
		panel2.add(buttonDel, gbc);
		
		button0.addActionListener(this);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
		button9.addActionListener(this);
		buttonPlus.addActionListener(this);
		buttonMinus.addActionListener(this);
		buttonMulitply.addActionListener(this);
		buttonDvide.addActionListener(this);
		buttonEquals.addActionListener(this);
		buttonClear.addActionListener(this);
		buttonDel.addActionListener(this);
	}


		public void actionPerformed(ActionEvent evt)
		{
			//Button 0
			if(evt.getSource() == button0)
			{
				textField.setText(textField.getText().concat("0"));
			}
			//button 1
			if(evt.getSource() == button1)
			{
				textField.setText(textField.getText().concat("1"));
			}
			//button 2
			if(evt.getSource() == button2)
			{
				textField.setText(textField.getText().concat("2"));
			}
			//button 3 
			if(evt.getSource() == button3)
			{
				textField.setText(textField.getText().concat("3"));
			}
			//button 4
			if(evt.getSource() == button4)
			{
				textField.setText(textField.getText().concat("4"));
			}
			//button 5
			if(evt.getSource() == button5)
			{
				textField.setText(textField.getText().concat("5"));
			}
			//button 6
			if(evt.getSource() == button6)
			{
				textField.setText(textField.getText().concat("6"));
			}
			//button 7
			if(evt.getSource() == button7)
			{
				textField.setText(textField.getText().concat("7"));
			}
			//button 8
			if(evt.getSource() == button8)
			{
				textField.setText(textField.getText().concat("8"));
			}
			//button 9
			if(evt.getSource() == button9)
			{
				textField.setText(textField.getText().concat("9"));
			}
			//button add
			if(evt.getSource() == buttonPlus)
			{
				a = Double.parseDouble(textField.getText());
				operator = 1;
				textField.setText("");
			}
			//button minus
			if(evt.getSource() == buttonMinus)
			{
				a = Double.parseDouble(textField.getText());
				operator = 2;
				textField.setText("");
			}
			//button divide
			if(evt.getSource() == buttonMulitply)
			{
				a = Double.parseDouble(textField.getText());
				operator = 3;
				textField.setText("");
			}
			//button multiply 
			if(evt.getSource() == buttonDvide)
			{
				a = Double.parseDouble(textField.getText());
				operator = 4;
				textField.setText("");
			}
			//Equals button
			if(evt.getSource() == buttonEquals)
			{
				b = Double.parseDouble(textField.getText());
		
					switch(operator)
					{
						case 1: result = a+b;
						break;
						
						case 2: result = a-b;
						break;
						
						case 3: result = a*b;
						break;
						
						case 4: result = a/b;
						break;
						
						default: result=0;
					}
					textField.setText(""+result);		
			}
			//clear button
			if(evt.getSource() == buttonClear)
			{
			textField.setText("");
			}
			//Delete button
			if(evt.getSource() == buttonDel)
			{
				String s = textField.getText();
				textField.setText("");
				for(int i=0; i<s.length()-1; i++)
				{
					textField.setText(textField.getText() + s.charAt(i));
				}
			}
	}
}	

