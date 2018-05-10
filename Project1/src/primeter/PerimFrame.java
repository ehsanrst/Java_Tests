package primeter;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.Font;

import javax.swing.JButton;

import java.awt.Color;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PerimFrame extends JFrame {

	private JPanel lable;

	private final JLabel label = new JLabel("Primeter");
	private JTextField txtT;
	private JButton btnTriangular;
	private JButton btnSquare;
	private JButton btnRectangular;
	private JButton btnCircle;

	// Launch the application
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PerimFrame frame = new PerimFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// Create the frame
	public PerimFrame() {
		label.setLabelFor(label);
		label.setIcon(new ImageIcon(
				PerimFrame.class
						.getResource("/com/sun/java/swing/plaf/motif/icons/DesktopIcon.gif")));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(550, 200, 750, 500);
		lable = new JPanel();
		lable.setToolTipText("Perimeter of Triangular");
		lable.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(lable);

		txtT = new JTextField();
		txtT.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtT.setEditable(false);
		txtT.setText("what's yor shape for calculate Perimeter?");
		txtT.setColumns(25);

		btnTriangular = new JButton("Triangular");
		btnTriangular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String fr = JOptionPane
						.showInputDialog("Enter first side's length: ");
				String sc = JOptionPane
						.showInputDialog("Enter the second side's length: ");
				String th = JOptionPane
						.showInputDialog("Enter the third side's length: ");
				double aT = Double.parseDouble(fr);
				double bT = Double.parseDouble(sc);
				double cT = Double.parseDouble(th);
				Perimeter pT = new Triangular(aT, bT, cT);

				JOptionPane.showMessageDialog(null,
						"Perimeter for Triangular is: " + pT.primeter());
			}
		});
		btnTriangular.setForeground(Color.BLACK);
		btnTriangular.setBackground(Color.LIGHT_GRAY);
		btnTriangular.setFont(new Font("Tahoma", Font.PLAIN, 22));

		btnSquare = new JButton("Square");
		btnSquare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String fr = JOptionPane.showInputDialog("Enter side length: ");
				double aS = Double.parseDouble(fr);
				Perimeter pS = new Square(aS);
				JOptionPane.showMessageDialog(null, "Perimeter for Square is: "
						+ pS.primeter());
			}
		});
		btnSquare.setForeground(Color.BLACK);
		btnSquare.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnSquare.setBackground(Color.LIGHT_GRAY);

		btnRectangular = new JButton("Rectangular");
		btnRectangular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String fr = JOptionPane
						.showInputDialog("Enter first side's length: ");
				String sc = JOptionPane
						.showInputDialog("Enter the second side's length: ");
				double aR = Double.parseDouble(fr);
				double bR = Double.parseDouble(sc);
				Perimeter pR = new Rectangular(aR, bR);
				JOptionPane.showMessageDialog(null,
						"Perimeter for Rectangular is: " + pR.primeter());

			}
		});
		btnRectangular.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnRectangular.setBackground(Color.LIGHT_GRAY);
		btnRectangular.setForeground(Color.BLACK);

		btnCircle = new JButton("Circle");
		btnCircle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String fr = JOptionPane
						.showInputDialog("Enter Radius length: ");
				double r = Double.parseDouble(fr);
				Perimeter pC = new Circle(r);
				JOptionPane.showMessageDialog(null,
						"Perimeter for Rectangular is: " + pC.primeter());
			}
		});
		btnCircle.setForeground(Color.BLACK);
		btnCircle.setBackground(Color.LIGHT_GRAY);
		btnCircle.setFont(new Font("Tahoma", Font.PLAIN, 22));
		GroupLayout gl_lable = new GroupLayout(lable);
		gl_lable.setHorizontalGroup(gl_lable
				.createParallelGroup(Alignment.LEADING)
				.addGroup(
						gl_lable.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										gl_lable.createParallelGroup(
												Alignment.LEADING)
												.addGroup(
														gl_lable.createSequentialGroup()
																.addGroup(
																		gl_lable.createParallelGroup(
																				Alignment.LEADING)
																				.addGroup(
																						gl_lable.createSequentialGroup()
																								.addComponent(
																										btnRectangular,
																										GroupLayout.DEFAULT_SIZE,
																										244,
																										Short.MAX_VALUE)
																								.addGap(18)
																								.addComponent(
																										btnCircle,
																										GroupLayout.PREFERRED_SIZE,
																										240,
																										GroupLayout.PREFERRED_SIZE))
																				.addComponent(
																						btnTriangular,
																						GroupLayout.DEFAULT_SIZE,
																						502,
																						Short.MAX_VALUE))
																.addPreferredGap(
																		ComponentPlacement.UNRELATED)
																.addComponent(
																		btnSquare,
																		GroupLayout.PREFERRED_SIZE,
																		206,
																		GroupLayout.PREFERRED_SIZE)
																.addContainerGap())
												.addGroup(
														Alignment.TRAILING,
														gl_lable.createSequentialGroup()
																.addComponent(
																		txtT,
																		GroupLayout.PREFERRED_SIZE,
																		GroupLayout.DEFAULT_SIZE,
																		GroupLayout.PREFERRED_SIZE)
																.addGap(62)))));
		gl_lable.setVerticalGroup(gl_lable
				.createParallelGroup(Alignment.LEADING)
				.addGroup(
						gl_lable.createSequentialGroup()
								.addContainerGap()
								.addComponent(txtT, GroupLayout.PREFERRED_SIZE,
										55, GroupLayout.PREFERRED_SIZE)
								.addGap(170)
								.addGroup(
										gl_lable.createParallelGroup(
												Alignment.TRAILING)
												.addGroup(
														gl_lable.createSequentialGroup()
																.addComponent(
																		btnTriangular,
																		GroupLayout.PREFERRED_SIZE,
																		71,
																		GroupLayout.PREFERRED_SIZE)
																.addGap(18)
																.addGroup(
																		gl_lable.createParallelGroup(
																				Alignment.TRAILING)
																				.addComponent(
																						btnCircle,
																						GroupLayout.DEFAULT_SIZE,
																						125,
																						Short.MAX_VALUE)
																				.addComponent(
																						btnRectangular,
																						Alignment.LEADING,
																						GroupLayout.DEFAULT_SIZE,
																						125,
																						Short.MAX_VALUE)))
												.addComponent(
														btnSquare,
														GroupLayout.DEFAULT_SIZE,
														214, Short.MAX_VALUE))
								.addContainerGap()));
		lable.setLayout(gl_lable);
	}

}
