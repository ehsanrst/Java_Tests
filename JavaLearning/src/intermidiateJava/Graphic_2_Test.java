package intermidiateJava;

import java.awt.*;
import javax.swing.*;

public class Graphic_2_Test {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Shapes"); // can add title at the sameTime
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Graphic_2 panel = new Graphic_2();
		// panel.setBackground(Color.WHITE);
		frame.add(panel);
		frame.setSize(500, 300);
		frame.setVisible(true);
	}
}
