import java.awt.*;

import javax.swing.*;

public class Challenge2 extends Canvas 
	{
	private static final long	serialVersionUID	= 1L;
 
    	public static void main(String[] args) 
    		{
	        Challenge2 canvas = new Challenge2();
	        JFrame frame = new JFrame();
	        frame.setSize(1000, 300);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.getContentPane().add(canvas).setBackground(Color.black);
	        frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
	        frame.setResizable(false);
	        frame.setVisible(true);
    		}
 
    	public void paint(Graphics graphics) 
    		{
    	
    			graphics.setColor(Color.pink);
    	        graphics.fillRect(20, 10, 800, 100);
	     
    		}
    	
    		
    	}
	