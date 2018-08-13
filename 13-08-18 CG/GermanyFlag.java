import java.awt.*;
import java.awt.Graphics;
import javax.swing.JFrame;
import java.awt.color.*;
public class GermanyFlag extends JFrame{
	public GermanyFlag(){
		setTitle("Flag");
		setSize(700,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.BLACK);
		g.fillRect(205,82,250,60);
		g.setColor(Color.RED);
		g.fillRect(205,142,250,60);
		g.setColor(Color.YELLOW);
		g.fillRect(205,202,250,60);
		
		
		
		
	}
	public static void main(String[] args) {
		GermanyFlag g = new GermanyFlag();

	}

}
