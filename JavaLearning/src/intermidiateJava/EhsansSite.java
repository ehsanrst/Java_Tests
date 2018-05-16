package intermidiateJava;

//index.html

import javax.swing.*;
import javax.swing.event.*;

import java.net.*;
import java.util.*;
import java.awt.*;
import java.applet.*;

public class EhsansSite extends JApplet {
	// turn URLs to HashMap
	private HashMap<String, URL> websiteInfo;
	private ArrayList<String> titles;
	private JList mainList;

	// constructor
	public EhsansSite() {
	}

	public void init() {
		websiteInfo = new HashMap<String, URL>();
		titles = new ArrayList<String>();

		getHTMLInfo(); // we will build this method

		// add Label to Applet
		add(new JLabel("Which website would you like to choose?"),
				BorderLayout.NORTH);
		mainList = new JList(titles.toArray());
		// make an event with Listener or List
		mainList.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				// List is not as type of anything; it is an Object
				/* event of selection */
				Object object = mainList.getSelectedValue();
				/* put selected event in url */
				URL newDocument = websiteInfo.get(object);
				/* browser reach us to url and what we have in applet */
				AppletContext browser = getAppletContext();
				/* browser shows url document */
				browser.showDocument(newDocument);
			}
		});
		add(new JScrollPane(mainList), BorderLayout.CENTER);
	}

	private void getHTMLInfo() {
		String title;
		String address;
		URL url;
		int counter = 0;

		title = getParameter("title" + counter);

		while (title != null) {
			address = getParameter("address" + counter);
			try {
				url = new URL(address);
				websiteInfo.put(title, url);
				titles.add(title);
			} catch (MalformedURLException urlException) {
				urlException.printStackTrace();
			}
			++counter;
			title = getParameter("title" + counter);
		}
	}
}
