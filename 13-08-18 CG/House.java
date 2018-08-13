import java.awt.*;

import javax.swing.JFrame;

import java.awt.Color.*;

public class House extends JFrame {
	public House()
	{
		setTitle("Face");
		setSize(720,620);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void paint(Graphics g)
	{
		g.setColor(Color.BLACK);
		g.drawLine(10, 300, 60,270);
		g.setColor(Color.BLACK);
		g.drawLine(60, 270, 120,320);
		g.setColor(Color.BLACK);
		g.drawLine(100, 250, 400, 250);
		g.setColor(Color.BLACK);
		g.drawLine(100, 250, 250, 180);
		g.setColor(Color.BLACK);
		g.drawLine(250, 180, 400, 250);
		
		
		g.setColor(Color.BLACK);
		g.drawLine(120, 250, 120, 500);
		
		g.setColor(Color.BLACK);
		g.drawLine(120, 500, 370, 500);
		
		g.setColor(Color.BLACK);
		g.drawLine(370, 500,370, 250);
		
		
	    g.setColor(Color.BLACK);
	    g.drawRect(220,350,60,150);
	
	    g.setColor(Color.BLACK);
	    g.drawRect(150,300,50,50);
	    
	    g.setColor(Color.BLACK);
	    g.drawRect(300,300,50,50);
	    
		g.setColor(Color.BLACK);
		g.drawLine(370,390,450,350);
		g.setColor(Color.BLACK);
		g.drawLine(450,350, 580,370);
		
		g.setColor(Color.BLACK);
		g.drawOval(500,40,180,120);
		
		g.setColor(Color.BLACK);
		g.drawLine(580,160,580,450);
		g.setColor(Color.BLACK);
		g.drawLine(580,450,600,450);
		g.setColor(Color.BLACK);
		g.drawLine(600,450,600,160);
		g.setColor(Color.BLACK);
		g.drawLine(600,380,700,300);
	}
	
	public static void main(String[] args) {
		
		House h = new House();
	}

}
