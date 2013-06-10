import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class GUI extends JFrame {

	Encryptor encryptor;
	
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
		textAreaEncrypted.setBorder(new TitledBorder("Encrypted"));
		
		JButton encryptButton = new JButton("Encrypt");
		add(encryptButton);
		EncryptPressed encryptPressed = new EncryptPressed();
		encryptButton.addActionListener(encryptPressed);
		
		JButton decryptButton = new JButton("Decrypt");
		add(decryptButton);
		
		manageEncryptor();
	}
	
	public class EncryptPressed implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			System.out.println(encryptor.encrypt("test test test"));
		} 
	}
	
	public class DecryptPressed implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			System.out.println(encryptor.decrypt("test test test"));
		} 
	}
	
	public void manageEncryptor(){
		encryptor = new Encryptor();
		encryptor.setEncryptionStrategy(new CopyEncryptor());
	}
}
