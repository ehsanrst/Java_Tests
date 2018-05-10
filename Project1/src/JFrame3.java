/* in this Lesson we make frame with Design part without using 
 * code and see the change in code that happen automatically */

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;

//create child class from JFrame
public class JFrame3 extends JFrame {

	private JPanel contentPane;

	// main method: Launch the application.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame3 frame = new JFrame3();
					frame.setVisible(true); // Run and Visible
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// Constructor: Create the frame
	public JFrame3() {
		setResizable(false); // set for change size of window with mouse
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // set Exit on Close
		setBounds(650, 230, 600, 450); // position an width and height
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 200));
		// make objects flow with position

		JButton btnClick = new JButton("Click!"); // make button object

		// set Action perform:
		btnClick.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// write action by click on button
				JOptionPane.showMessageDialog(null, "Clicked!");
			}
		});
		contentPane.add(btnClick); // add button object
	}
}
