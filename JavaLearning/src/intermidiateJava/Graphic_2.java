package intermidiateJava;

// Lesson3: build 2D and 3D shape
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Graphic_2 extends JPanel {

	// use paintComponent method
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.setBackground(Color.WHITE);

		// Draw a Line(x1,y1,x2,y2)
		g.setColor(Color.BLUE);
		g.drawLine(10, 25, 200, 45);

		// Draw an empty_Rectangular(x,y,width,height)
		g.setColor(Color.RED);
		g.drawRect(10, 55, 100, 30);

		// Draw a fill_Rectangular
		g.setColor(Color.CYAN);
		g.fillRect(10, 95, 100, 30);

		// Draw an empty_Oval(x,y,width,height)
		g.setColor(Color.ORANGE);
		g.drawOval(10, 135, 100, 30);

		// Draw an fill_3D_Rectangular(x,y,width,height,true(be 3D))
		g.setColor(Color.GREEN);
		g.fill3DRect(10, 175, 100, 50, true);

	}
}
