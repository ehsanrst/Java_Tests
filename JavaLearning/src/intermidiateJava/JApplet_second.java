package intermidiateJava;

//Lesson 16:

import java.awt.Graphics;
import javax.swing.JApplet;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class JApplet_second extends JApplet {
	// variables
	private double sum;

	// constructor
	public JApplet_second() {
	}

	// doing process into init
	public void init() {
		// String inputs
		String fn = JOptionPane.showInputDialog("enter firt number: ");
		String sn = JOptionPane.showInputDialog("enter second number: ");
		// convert string to double
		double n1 = Double.parseDouble(fn);
		double n2 = Double.parseDouble(sn);

		sum = n1 + n2;
	}

	// output with paint
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.drawString("sum is:" + sum, 25, 35);
	}
}
