//JFrame lesson with Code

import java.awt.FlowLayout; //for Button
import javax.swing.JFrame; //for Frame
import javax.swing.JLabel; //for Label

//build child Class from JFrame
public class JFrame2 extends JFrame {

	// members
	private JLabel item1; // JLabel is a different Class from JFrame

	// Constructor
	public JFrame2() {
		super("My Windows"); /*
							 * always FIRST is for "title", we super it to
							 * parent class
							 */
		setLayout(new FlowLayout()); // flow buttons layout method we use
		// Label:
		item1 = new JLabel("Hi, I am a Label here"); // Build Label with it's
														// Object
		item1.setToolTipText("it is a Label");/*
											 * when move mouse pointer on label
											 * tool tip will show this message
											 */
		add(item1); // finally we must add Label on Frame
	}
}
