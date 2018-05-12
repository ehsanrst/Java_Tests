package intermidiateJava;

//Lesson1: make panel inside frame

//here we use any panel we built into a frame
//import library
import javax.swing.*;

public class Graphic_1_Test {
	public static void main(String[] args) {
		JFrame frame1 = new JFrame();// object from JFrame
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);/*
															 * set close
															 * operation FIRST
															 */

		Graphic_1 panel = new Graphic_1();// object from panel we built
		frame1.add(panel);// add panel into frame
		frame1.setSize(400, 250); // build frame
		frame1.setVisible(true);
	}
}
