import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JFrame;

public class GUI extends JFrame {

	public GUI() {
		super("Super mega Encryptor.");
		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		setBackground(Color.white);
	}
}
