import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


@SuppressWarnings("serial")
public class swingPractice extends JFrame
{

	 swingPractice()
	 {
	    super("Title Goes Here");
	    super.setSize(1920, 1080);
	    	super.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
    		JFrame.setDefaultLookAndFeelDecorated(true);
    		
	    	JLabel background=new JLabel(new ImageIcon("/Users/abdulazizkodirov/Desktop/Computer Programing/Eclips Workplace/03 Swing Practice On My Own/src/DOIKqEv.jpg"));
	    super.add(background);
	   	background.setLayout(new FlowLayout());
	   	

	   	
	    GridBagConstraints gbc = new GridBagConstraints();
	    gbc.insets = new Insets(20, 40, 10, 30);
	    
	 
	    	JLabel l1=new JLabel("Here is a button");
	    	l1.setForeground(Color.WHITE);
	    	
	    	JButton b1=new JButton("I am a button");
	    	
	    	JTextArea txt = new JTextArea("Type here...", 5, 20);
	    	
	    	background.add(l1);
	    	background.add(b1);

	    	txt.setBounds(114, 952, 5, 20);
	    	background.add(txt);
	   

	        final JTextField text = new JTextField();;
	        background.add(text,BorderLayout.SOUTH);
	 
	        
	        background.addMouseListener(new MouseListener() 
	        {
	            public void mousePressed(MouseEvent me) { }
	            public void mouseReleased(MouseEvent me) { }
	            public void mouseEntered(MouseEvent me) { }
	            public void mouseExited(MouseEvent me) { }
	            public void mouseClicked(MouseEvent me) {  
	              int x = me.getX();
	              int y = me.getY();
	              text.setText("X:" + x + " Y:" + y); 
	              setVisible(true);
	            }
	        });
	        
	       	super.setVisible(true);
	 }
}
