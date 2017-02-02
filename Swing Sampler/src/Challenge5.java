import java.awt.*;

import javax.swing.*;

public class Challenge5 extends Canvas 
	{
	private static final long	serialVersionUID	= 1L;
 
    	public static void main(String[] args) 
    		{
	        Challenge5 canvas = new Challenge5();
	        JFrame frame = new JFrame();
	        frame.setSize(500, 500);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.getContentPane().add(canvas).setBackground(Color.white);
	        frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
	        frame.setResizable(false);
	        frame.setVisible(true);
    		}
 
    	public void paint(Graphics graphics) 
    		{
    	
    			graphics.setColor(Color.black);
    	        graphics.drawOval(100, 100, 250, 250);
    	        
    	        graphics.setColor(Color.yellow);
    	        graphics.fillOval(101, 101, 249, 249);
    	        //eyes
    	        graphics.setColor(Color.black);
    	        graphics.drawRect(160, 169, 30, 30);
    	        
    	        graphics.setColor(Color.black);
    	        graphics.fillRect(160, 169, 30, 30);
    	        
    	        graphics.setColor(Color.black);
    	        graphics.drawRect(250, 169, 30, 30);
    	        
    	        graphics.setColor(Color.black);
    	        graphics.fillRect(250, 169, 30, 30);
    	        //
    	        graphics.setColor(Color.blue);
    	        graphics.drawOval(185, 250, 80, 30);
    	        
    	        graphics.setColor(Color.blue);
    	        graphics.fillOval(185, 250, 80, 30);
    	        
    	        
    	        
    	        

    		}
    	
    		
    	}