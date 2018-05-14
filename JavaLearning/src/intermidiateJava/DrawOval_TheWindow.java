package intermidiateJava;

//Lesson17
//here we build Frame with slider and Panel inside
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

//make Frame
public class DrawOval_TheWindow extends JFrame {

	private JSlider slider; // make a slider
	private DrawOval myPanel; // make panel from DrawOval

	// constructor
	public DrawOval_TheWindow() {
		super("Test for draw oval"); // make title

		myPanel = new DrawOval(); // build Panel with DrawPanle constructor
		myPanel.setBackground(Color.LIGHT_GRAY); // customize panel

		/*
		 * build slider with JSlider constructor and customize it with
		 * "SwingConstants"
		 */
		slider = new JSlider(SwingConstants.HORIZONTAL, 0, 200, 10); // (from,to,initial)
		slider.setMajorTickSpacing(10);// set tickSpace (ruler) on slider
		slider.setPaintTicks(true); // to draw ticks on slider

		// make event for slider with "add Change Listener"
		slider.addChangeListener(
		// constructor
		new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				// get value of slider and set it to dimension of panel
				myPanel.setD(slider.getValue());
			}
		});

		// add to "Frame" with position
		add(slider, BorderLayout.SOUTH);
		add(myPanel, BorderLayout.CENTER);
	}
}
