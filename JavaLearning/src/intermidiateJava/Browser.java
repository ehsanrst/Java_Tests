package intermidiateJava;

//make a Browser

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

import javax.swing.*;
import javax.swing.event.*;

public class Browser extends JFrame {

	private JTextField addressBar;
	private JEditorPane display;

	// constructor
	public Browser() {
		super("Ehsan Browser");

		addressBar = new JTextField("URL");
		addressBar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				load(e.getActionCommand());
			}
		});

		add(addressBar, BorderLayout.NORTH);
		display = new JEditorPane();
		display.setEditable(false);
		display.addHyperlinkListener(new HyperlinkListener() {
			// make display click able on links
			@Override
			public void hyperlinkUpdate(HyperlinkEvent e) {
				// if it is hyper link
				if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
					load(e.getURL().toString());
				}
			}
		});
		// add navigation bar
		add(new JScrollPane(display), BorderLayout.CENTER);
		setSize(800, 600);
		setVisible(true);
	}

	// load method
	protected void load(String userText) {
		try {
			// match page on hyperlink that user enter its url
			display.setPage(userText);
			// address bar keep text user enter
			addressBar.setText(userText);
		} catch (IOException e) {
			System.err.println(e);
		}
	}
}
