//Use JFrame2 in this Class

import javax.swing.JFrame;

public class JFrameTest2 {
	public static void main(String[] args) {

		JFrame2 frame = new JFrame2(); // Make Object

		// Don't worry i write all of this with auto complete :D
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); /*
															 * ATTENTION: after
															 * make object we
															 * must define CLOSE
															 * operation for
															 * Frame to when we
															 * click exit button
															 * program be end
															 */
		frame.setSize(380, 200); // set size of Frame (width, height)
		frame.setVisible(true); // set Frame visible

	}
}
