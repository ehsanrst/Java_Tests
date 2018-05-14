package intermidiateJava;

//Lesson17: Draw a resizeble Oval
//here we define methods of drawing
import java.awt.*;
import javax.swing.JPanel;

//make Panel
public class DrawOval extends JPanel {

	private int d = 10; // dimension

	// method of drawing oval
	public void paintComponent(Graphics g) {
		super.paintComponent(g); // will ready to paint
		g.setColor(Color.RED);
		g.fillOval(10, 10, d, d); // (x,y,height,width)

	}

	// method for resize dimension of oval
	public void setD(int newD) {
		d = (newD >= 0) ? newD : 10;
		// need to use method of drawing again but we use
		repaint();
		// that use paint component automatically
	}

	// Optional:
	public Dimension getPrefferedSize() {
		return new Dimension(200, 200); // (height,width)
	}

	public Dimension getMinimumSize() {
		// to set minimum bound
		return getPreferredSize();
	}
}
