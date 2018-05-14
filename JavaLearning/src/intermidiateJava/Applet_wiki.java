package intermidiateJava;

//Wikipedia:
//Java Applet: have "init", "start", "stop", "destroy"
import java.applet.Applet;
import java.awt.*;

public class Applet_wiki extends Applet {
	// the methods that necessary======
	public void init() {
	}

	public void stop() {
	}

	// graphic method==================
	public void paint(Graphics g) {
		g.setColor(Color.red);
		g.setFont(new Font("TimesRoman", Font.PLAIN, 20));
		g.drawString("Hello, world!", 20, 20);
	}
}