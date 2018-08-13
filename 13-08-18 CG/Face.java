import java.awt.*;

import javax.swing.JFrame;

import java.awt.Color.*;
public class Face extends JFrame {
	public Face()
	{
		setTitle("Face");
		setSize(620,680);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.YELLOW);
		g.fillOval(200,300,220,220);
		g.setColor(Color.BLACK);
		g.drawOval(200,300,220,220);
		g.setColor(Color.BLACK);
		g.fillRect(250,370,50,5);
		g.setColor(Color.BLACK);
		g.fillRect(330,370,50,5);
		//g.drawLine(250,370,300,370);
		g.setColor(Color.BLACK);
		//g.drawLine(320,370,370,370);
		g.setColor(Color.BLACK);
		//g.drawLine(280,440,350,440);
		g.fillRect(290,460,50,5);
	}

	public static void main(String[] args) {
		
		Face f = new Face();
	}

}
