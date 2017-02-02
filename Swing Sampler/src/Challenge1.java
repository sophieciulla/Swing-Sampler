import java.awt.*;

import javax.swing.*;

public class Challenge1 extends Canvas 
	{
	private static final long	serialVersionUID	= 1L;
 
    	public static void main(String[] args) 
    		{
	        Challenge1 canvas = new Challenge1();
	        JFrame frame = new JFrame();
	        frame.setSize(500, 400);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.getContentPane().add(canvas).setBackground(Color.black);
	        frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
	        frame.setResizable(true);
	        frame.setVisible(true);
    		}
 
    	public void paint(Graphics graphics) 
    		{
    	
	        graphics.setColor(Color.green);
	        graphics.drawLine(0, 370, 500, 0);
	        
	        graphics.setColor(Color.orange);
	        graphics.drawLine(0, 0, 500, 370);
	        
	        
	 
    		}
    	
    		
    	}
	