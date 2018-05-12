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

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.SwingConstants;

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
		setResizable(false);
		setIconImage(Toolkit
				.getDefaultToolkit()
				.getImage(
						PerimFrame.class
								.getResource("/com/sun/java/swing/plaf/windows/icons/Question.gif")));
		label.setLabelFor(label);
		label.setIcon(new ImageIcon(
				PerimFrame.class
						.getResource("/com/sun/java/swing/plaf/motif/icons/DesktopIcon.gif")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(550, 200, 750, 500);
		lable = new JPanel();
		lable.setToolTipText("Perimeter of Triangular");
		lable.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(lable);

		txtT = new JTextField();
		txtT.setHorizontalAlignment(SwingConstants.CENTER);
		txtT.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtT.setEditable(false);
		txtT.setText("what's yor shape for calculate Perimeter?");
		txtT.setColumns(23);

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
		btnTriangular.setBackground(Color.MAGENTA);
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
		btnSquare.setBackground(Color.GREEN);

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
		btnRectangular.setBackground(Color.YELLOW);
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
		btnCircle.setBackground(Color.CYAN);
		btnCircle.setFont(new Font("Tahoma", Font.PLAIN, 22));

		JLabel lblNewLabel = new JLabel("Designed by EhsanRst");
		GroupLayout gl_lable = new GroupLayout(lable);
		gl_lable.setHorizontalGroup(gl_lable
				.createParallelGroup(Alignment.LEADING)
				.addGroup(
						Alignment.TRAILING,
						gl_lable.createSequentialGroup()
								.addContainerGap(676, Short.MAX_VALUE)
								.addComponent(lblNewLabel).addContainerGap())
				.addGroup(
						gl_lable.createSequentialGroup()
								.addGap(77)
								.addGroup(
										gl_lable.createParallelGroup(
												Alignment.LEADING, false)
												.addComponent(
														btnRectangular,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE)
												.addComponent(
														btnTriangular,
														GroupLayout.DEFAULT_SIZE,
														188, Short.MAX_VALUE))
								.addGap(188)
								.addGroup(
										gl_lable.createParallelGroup(
												Alignment.LEADING, false)
												.addComponent(
														btnCircle,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE)
												.addComponent(
														btnSquare,
														GroupLayout.DEFAULT_SIZE,
														187, Short.MAX_VALUE))
								.addGap(104))
				.addGroup(
						Alignment.TRAILING,
						gl_lable.createSequentialGroup()
								.addContainerGap(151, Short.MAX_VALUE)
								.addComponent(txtT, GroupLayout.PREFERRED_SIZE,
										464, GroupLayout.PREFERRED_SIZE)
								.addGap(129)));
		gl_lable.setVerticalGroup(gl_lable
				.createParallelGroup(Alignment.LEADING)
				.addGroup(
						gl_lable.createSequentialGroup()
								.addContainerGap()
								.addComponent(txtT, GroupLayout.PREFERRED_SIZE,
										55, GroupLayout.PREFERRED_SIZE)
								.addGap(84)
								.addGroup(
										gl_lable.createParallelGroup(
												Alignment.BASELINE)
												.addComponent(
														btnRectangular,
														GroupLayout.PREFERRED_SIZE,
														112,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														btnSquare,
														GroupLayout.PREFERRED_SIZE,
														113,
														GroupLayout.PREFERRED_SIZE))
								.addGap(47)
								.addGroup(
										gl_lable.createParallelGroup(
												Alignment.LEADING)
												.addComponent(
														btnCircle,
														GroupLayout.PREFERRED_SIZE,
														112,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														btnTriangular,
														GroupLayout.PREFERRED_SIZE,
														116,
														GroupLayout.PREFERRED_SIZE))
								.addGap(8).addComponent(lblNewLabel)
								.addContainerGap()));
		lable.setLayout(gl_lable);
	}
}
