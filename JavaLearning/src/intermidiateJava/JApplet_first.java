package intermidiateJava;

//Lesson15: JApplet
/*
 * 'Applet' made from ".applet" library but 'JApplet' made from ".swing" that 
 * means JApplet give you graphical workSpace but Applet does not.
 */
//applets are 64 bit
import java.awt.Graphics;

import javax.swing.JApplet;

@SuppressWarnings("serial")
public class JApplet_first extends JApplet {
	// Constructor
	public JApplet_first() {
	}

	/*
	 * Initialization method that will be called after the applet is loaded into
	 * the browser.
	 */
	public void init() {
		// start asynchronus download of heavy resources
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.drawString("Ehsan Applet Test", 25, 25); // (title,x,y)
	}

	// we can overwrite start(), stop(), destroy() methods

}
