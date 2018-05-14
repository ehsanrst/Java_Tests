package intermidiateJava;

import javax.swing.JFrame;

//Lesson17
//here we run Program

public class DrawOval_Test {
	public static void main(String[] args) {
		// make object of Frame
		DrawOval_TheWindow w = new DrawOval_TheWindow();
		// set Exit operation
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// set Size
		w.setSize(380, 300);
		// set visible
		w.setVisible(true);
	}
}
