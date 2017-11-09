
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class mainRunner 
{
	public static void main(String[] args) 
	{
			
		Frame mainFrame = new Frame();
		
		buttonsLabelsTxtbox blt = new buttonsLabelsTxtbox();
		
		mainFrame.add(blt);
		
		mainFrame.showIt();
	}
}

@SuppressWarnings("serial")
class Frame extends JFrame
{
	Frame()
	{
		super.setTitle("Calculator");
		super.setSize(900, 800);
		super.getContentPane().setBackground(Color.BLACK);
		super.setResizable(false);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void showIt()
	{
		super.setVisible(true);
	}
}

@SuppressWarnings("serial")
class buttonsLabelsTxtbox extends JPanel implements ActionListener
{
	private JTextField txtBox;
	private JButton button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonAdd, buttonMinus, buttonMulti, buttonDvide, buttonDec, buttonEqual, buttonClear, buttonDelete, buttonExit;
	private JPanel panel1, panel2;
	static double a=0, b=0, result=0;
	static int operator=0;
	
	buttonsLabelsTxtbox()
	{
		mainClass();
	}
	
	public void mainClass()
	{
		//******************PANEL 1 or NORTH*****************************
		panel1 = new JPanel(new GridBagLayout());
		panel1.setBackground(Color.WHITE);
		super.add(panel1, BorderLayout.NORTH);
		//***************************************************************
		
		//*********************PANEL 2 or CENTER*************************
		panel2 = new JPanel(new GridBagLayout());
		panel2.setPreferredSize(new Dimension(500, 800));
		panel2.setBackground(Color.WHITE);
		super.add(panel2, BorderLayout.CENTER);
		//****************************************************************
		
		//*********************GRID***************************************
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(10, 10, 10, 10);
		//****************************************************************
		
		//***********************TEXT FIELD*******************************
		//Actual Text Field is being Created
		txtBox = new JTextField();
		txtBox.setPreferredSize(new Dimension(300, 50));
		//Font color
		txtBox.setForeground(Color.BLACK);
		//Text Field color
		txtBox.setBackground(Color.WHITE);
		//Text Field Location
		gbc.gridx = 0;
		gbc.gridy = 0;
		panel1.add(txtBox, gbc);
		//****************************************************************
		
		//***********************BUTTON #1********************************
		button1 = new JButton("1");
		gbc.gridx = 0;
		gbc.gridy = 0;
		panel2.add(button1, gbc);
		//****************************************************************
		
		//***********************BUTTON #2********************************
		button2 = new JButton("2");
		gbc.gridx = 1;
		gbc.gridy = 0;
		panel2.add(button2, gbc);
		//****************************************************************
		
		//***********************BUTTON #3********************************
		button3 = new JButton("3");
		gbc.gridx = 2;
		gbc.gridy = 0;
		panel2.add(button3, gbc);
		//****************************************************************
		
		//***********************BUTTON ADD*******************************
		buttonAdd = new JButton("+");
		gbc.gridx = 4;
		gbc.gridy = 0;
		panel2.add(buttonAdd, gbc);
		//****************************************************************
		
		//***********************BUTTON #4********************************
		button4 = new JButton("4");
		gbc.gridx = 0;
		gbc.gridy = 1;
		panel2.add(button4, gbc);
		//****************************************************************
		
		//***********************BUTTON #5********************************
		button5 = new JButton("5");
		gbc.gridx = 1;
		gbc.gridy = 1;
		panel2.add(button5, gbc);
		//****************************************************************
		
		//***********************BUTTON #6********************************
		button6 = new JButton("6");
		gbc.gridx = 2;
		gbc.gridy = 1;
		panel2.add(button6, gbc);
		//****************************************************************
		
		//***********************BUTTON MINUS*****************************
		buttonMinus = new JButton("-");
		gbc.gridx = 4;
		gbc.gridy = 1;
		panel2.add(buttonMinus, gbc);
		//****************************************************************
		
		//***********************BUTTON #7********************************
		button7 = new JButton("7");
		gbc.gridx = 0;
		gbc.gridy = 2;
		panel2.add(button7, gbc);
		//****************************************************************

		//***********************BUTTON #8********************************
		button8 = new JButton("8");
		gbc.gridx = 1;
		gbc.gridy = 2;
		panel2.add(button8, gbc);
		//****************************************************************
		
		//***********************BUTTON #9********************************
		button9 = new JButton("9");
		gbc.gridx = 2;
		gbc.gridy = 2;
		panel2.add(button9, gbc);
		//****************************************************************
		
		//***********************BUTTON MULTIPLY**************************
		buttonMulti = new JButton("*");
		gbc.gridx = 4;
		gbc.gridy = 2;
		panel2.add(buttonMulti, gbc);
		//****************************************************************
		
		//***********************BUTTON DECIMAL********************************
		buttonDec = new JButton(".");
		gbc.gridx = 0;
		gbc.gridy = 3;
		panel2.add(buttonDec, gbc);
		//****************************************************************
		
		//***********************BUTTON #0********************************
		button0 = new JButton("0");
		gbc.gridx = 1;
		gbc.gridy = 3;
		panel2.add(button0, gbc);
		//****************************************************************
		
		//***********************BUTTON DIVIDE****************************
		buttonDvide = new JButton("÷");
		gbc.gridx = 4;
		gbc.gridy = 3;
		panel2.add(buttonDvide, gbc);
		//****************************************************************
		
		//***********************BUTTON CLEAR*****************************
		buttonClear = new JButton("Clear");
		gbc.gridx = 0;
		gbc.gridy = 4;
		panel2.add(buttonClear, gbc);
		//****************************************************************
		
		//***********************BUTTON DELETE****************************
		buttonDelete = new JButton("Delete");
		gbc.gridx = 1;
		gbc.gridy = 4;
		panel2.add(buttonDelete, gbc);
		//****************************************************************
		
		//***********************BUTTON EXIT******************************
		buttonExit = new JButton("Exit");
		gbc.gridx = 2;
		gbc.gridy = 4;
		panel2.add(buttonExit, gbc);
		//****************************************************************
		
		//***********************BUTTON EQUAL*****************************
		buttonEqual = new JButton("=");
		gbc.gridx = 2;
		gbc.gridy = 3;
		panel2.add(buttonEqual, gbc);
		//****************************************************************
		
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
		buttonDec.addActionListener(this);
		buttonAdd.addActionListener(this);
		buttonMinus.addActionListener(this);
		buttonMulti.addActionListener(this);
		buttonDvide.addActionListener(this);
		buttonEqual.addActionListener(this);
		buttonClear.addActionListener(this);
		buttonExit.addActionListener(this);
		buttonDelete.addActionListener(this);
		
	}
	
		public void actionPerformed(ActionEvent evt)
		{
			
			
			if(evt.getSource() == button0)
			{
				txtBox.setText(txtBox.getText().concat("0"));
			}
			if(evt.getSource() == button1)
			{
				txtBox.setText(txtBox.getText().concat("1"));
			}
			if(evt.getSource() == button2)
			{
				txtBox.setText(txtBox.getText().concat("2"));
			}
			if(evt.getSource() == button3)
			{
				txtBox.setText(txtBox.getText().concat("3"));
			}
			if(evt.getSource() == button4)
			{
				txtBox.setText(txtBox.getText().concat("4"));
			}
			if(evt.getSource() == button5)
			{
				txtBox.setText(txtBox.getText().concat("5"));
			}
			if(evt.getSource() == button6)
			{
				txtBox.setText(txtBox.getText().concat("6"));
			}
			if(evt.getSource() == button7)
			{
				txtBox.setText(txtBox.getText().concat("7"));
			}
			if(evt.getSource() == button8)
			{
				txtBox.setText(txtBox.getText().concat("8"));
			}
			if(evt.getSource() == button9)
			{
				txtBox.setText(txtBox.getText().concat("9"));
			}
			if(evt.getSource() == buttonDec)
			{
				txtBox.setText(txtBox.getText().concat("."));
			}
			//MATH OPERATIONS
			if(evt.getSource() == buttonAdd)
			{
				a = Double.parseDouble(txtBox.getText());
				operator = 1;
				txtBox.setText("");
			}
			if(evt.getSource() == buttonMinus)
			{
				a = Double.parseDouble(txtBox.getText());
				operator = 2;
				txtBox.setText("");
			}
			if(evt.getSource() == buttonMulti)
			{
				a = Double.parseDouble(txtBox.getText());
				operator = 3;
				txtBox.setText("");
			}
			if(evt.getSource() == buttonDvide)
			{
				a = Double.parseDouble(txtBox.getText());
				operator = 4;
				txtBox.setText("");
			}
			if(evt.getSource() == buttonEqual)
			{
				b = Double.parseDouble(txtBox.getText());
				
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
				
				default: result = 00;
				}
				txtBox.setText(" "+result);
			}
			if(evt.getSource() == buttonClear)
			{
				txtBox.setText("");
			}
			if(evt.getSource() == buttonDelete)
			{
				String s = txtBox.getText();
				txtBox.setText("");
				for(int i=0; i<s.length()-1; i++)
				{
					txtBox.setText(txtBox.getText() + s.charAt(i));
				}
			}
			if(evt.getSource() == buttonExit)
			{
				System.exit(0);
			}
		}
	
}