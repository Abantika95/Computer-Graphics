import java.awt.*;

import javax.swing.JFrame;

import java.awt.Color.*;
public class Face2 extends JFrame {
	public Face2()
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
		g.fillOval(340,370,20,35);
		g.setColor(Color.BLACK);
		g.fillOval(270,370,20,35);
		g.setColor(Color.BLACK);
		//g.drawLine(280,440,350,440);
		g.fillRect(290,460,50,5);
	}
	public static void main(String[] args) {
		Face2 f = new Face2();

	}

}
