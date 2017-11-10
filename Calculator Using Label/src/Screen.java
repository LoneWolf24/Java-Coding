import javax.swing.*;

@SuppressWarnings("serial")
public class Screen extends JPanel
{
	private JLabel display;
	private boolean showDecimalPoint = true;
	
	public Screen()
	{
		System.out.println("Create Screen");
		display = new JLabel("0");
		super.add(display);
	}
	
	
	public void postDigit(String digit)
	{
		String displayLine = display.getText();
		System.out.println(digit + " was pressed " + showDecimalPoint);

		//what happens if the clear key is pressed
		if(digit.equals("C"))
		{
			//display a 0 upon clear
			displayLine = "0";
			showDecimalPoint = true;
		}
		else
		{
			if(digit.equals("."))
			{
				if(showDecimalPoint)
				{
					displayLine = displayLine + ".";
					showDecimalPoint = false;
				}	
			}

			else 
			{
				if(displayLine == "0")
				{
					displayLine = digit;
				}
				else
				{
					displayLine = displayLine + digit;
				}
			}
		}
		display.setText(displayLine);
	}
	
	
	public void postValue(double value)
	{
		display.setText(Double.toString(value));
	}
	
	public double getValue()
	{
		String displayLine = display.getText();
		double screenValue = Double.parseDouble(displayLine);
		
		return(screenValue );
	}
}
