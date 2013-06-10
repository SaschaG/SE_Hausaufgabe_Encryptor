import java.awt.Color;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class GUI extends JFrame {

	public GUI() {
		super("Super mega Encryptor.");
		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		setBackground(Color.white);
		Box box = Box.createVerticalBox();
		box.setSize(400, 200);
		add(box);
		
		Box box2 = Box.createVerticalBox();
		box2.setSize(400, 200);
		add(box2);
		
		JTextArea textAreaOriginal = new JTextArea(15,60);
		box.add(textAreaOriginal);
		JTextArea textAreaEncrypted = new JTextArea(15,60);
		box.add(textAreaEncrypted);
		
		textAreaOriginal.setBorder(new TitledBorder("Original"));
		textAreaOriginal.setBorder(new TitledBorder("Encrypted"));
		
		Encryptor encryptor = new Encryptor();
	}
}
