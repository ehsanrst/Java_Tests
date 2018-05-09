// GUI : graphical user interface

import javax.swing.JOptionPane;

public class ExpGui {
	public static void main(String[] args) {

		// JOptionPane: method of input
		String fr = JOptionPane.showInputDialog("Please enter a number: ");
		String sc = JOptionPane
				.showInputDialog("Please enter the second number: ");

		// to convert String to Integer use "parseInt()" method of Integer class
		int first = Integer.parseInt(fr);
		int second = Integer.parseInt(sc);

		int total = first + second;

		// JOptionPane: method of Message
		JOptionPane.showMessageDialog(null, total, "The result",
				JOptionPane.INFORMATION_MESSAGE);

		/*
		 * inside (...) means: ("null", "integer value to show output", "String
		 * message on header", "Icon")
		 * 
		 * Hint:in any part of this if you don't want to change anything just
		 * leave it empty for example the simplest is: ".showMessageDialog(null,
		 * total);"
		 */
	}
}
