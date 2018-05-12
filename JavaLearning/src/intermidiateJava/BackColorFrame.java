package intermidiateJava;

//Choose Frame's background Color Class
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BackColorFrame extends JFrame {
	// class members (variables)
	private JButton b;
	private Color color = (Color.WHITE);
	private JPanel panel;

	// private JLabel label;

	// Constructor=================
	public BackColorFrame() {
		// FIRST write "title"
		super("The title");
		// setLayout(new FlowLayout());
		// label = new JLabel("Welcome");
		panel = new JPanel();// panel is an area of a frame
		panel.setBackground(color);

		b = new JButton("please choose a color");
		// add an action to this button
		b.addActionListener(new ActionListener() { // new from actionListener

			@Override
			public void actionPerformed(ActionEvent arg0) {
				color = JColorChooser.showDialog(null, "Choose", color);// (position,title,color)
				// if user CANCEL turn to WHITE
				if (color == null) {
					color = (Color.WHITE);
				}

				panel.setBackground(color);
			}
		});
		// ADD to frame with their positions
		// add(label, BorderLayout.NORTH);
		add(panel, BorderLayout.CENTER);
		add(b, BorderLayout.SOUTH);
		// setSize(450, 250);
		// OR:
		setBounds(750, 300, 450, 250);// Size with position
		setVisible(true);
		// setResizable(false);
		/*
		 * we write any build operation in constructor to when this class
		 * "Graphic_2 the frame from JFrame" called from anywhere this build
		 * operations Doing automatically
		 */
	}
}
