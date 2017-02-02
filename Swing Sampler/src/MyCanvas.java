import java.awt.*;

import javax.swing.*;
//COMMENT CMOMENT COMMENT CMOMENT

public class MyCanvas extends Canvas 
	{
	private static final long	serialVersionUID	= 1L;
 
    	public static void main(String[] args) 
    		{
	        MyCanvas canvas = new MyCanvas();
	        JFrame frame = new JFrame();
	        frame.setSize(1000, 1000);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.getContentPane().add(canvas).setBackground(Color.black);
	        frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
	        frame.setResizable(false);
	        frame.setVisible(true);
    		}
 
    	public void paint(Graphics graphics) 
    		{
    		//draw rect creates border, fill rect fills it
	        graphics.setColor(Color.red);
	        graphics.fillOval(140, 130, 100, 100);
	        
	        graphics.setColor(Color.pink);
	        graphics.fillRect(20, 10, 800, 100);
	        
	        graphics.setColor(Color.green);
	        graphics.drawLine(0, 370, 500, 0);
	        
	        graphics.setColor(Color.orange);
	        graphics.drawLine(0, 0, 500, 370);
	        
	        graphics.setColor(Color.blue);
	        graphics.drawLine(10, 10, 10, 10);
	 
    		}
    	
    		public void delay()
    			{
    	        try
    					{
    					Thread.sleep(3);
    					} catch (InterruptedException e)
    					{
    					e.printStackTrace();
    					}
    			}
    	}
	