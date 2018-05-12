package intermidiateJava;

//import library with (.*) to call hole library
import java.awt.*;
import javax.swing.*;

//create graphic class as child of JPanel class
public class Graphic_1 extends JPanel {
	// Override paint component method from JPanel
	// with parameter "g" as type of "Graphics"
	public void paintComponent(Graphics g) {
		// call parent method
		super.paintComponent(g);
		// now we override something to "this" method
		this.setBackground(Color.WHITE);
		// use method of Graphics class
		g.setColor(Color.BLUE);// setColor method
		// ".fill" for paint the shapes
		g.fillRect(25, 25, 100, 30);// (x,y,width,height)

		// another rectangular
		g.setColor(new Color(190, 81, 215)); // color with RGB values
		g.fillRect(25, 65, 100, 30);

		g.setColor(Color.RED);
		// "draw" will paint anything even integer num and string line
		g.drawString("Ehsan Java", 25, 120);// (toolTipText,width,height)
	}
}
