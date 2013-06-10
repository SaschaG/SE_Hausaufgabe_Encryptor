import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.*;
import javax.swing.border.TitledBorder;

public class GUI extends JFrame {

	private Encryptor encryptor;
	private JTextArea textAreaOriginal;
	private JTextArea textAreaEncrypted;
	private Map<String, EncryptionStrategy>encryptionMap;
	private JComboBox comboBox;
	
	public GUI() {
		super("Super mega Encryptor.");
		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		setBackground(Color.white);
		
		JPanel boxPanel = new JPanel();
		boxPanel.setLayout(new BoxLayout(boxPanel, BoxLayout.PAGE_AXIS));
		add(boxPanel);
		
		
		Box box = Box.createVerticalBox();
		box.setSize(400, 200);
		boxPanel.add(box);
		

		
		Box box2 = Box.createVerticalBox();
		box2.setSize(400, 200);
		boxPanel.add(box2);
		
		textAreaOriginal = new JTextArea(15,60);
		box.add(textAreaOriginal);
		textAreaEncrypted = new JTextArea(15,60);
		box.add(textAreaEncrypted);
		
		textAreaOriginal.setBorder(new TitledBorder("Original"));
		textAreaEncrypted.setBorder(new TitledBorder("Encrypted"));
		
		//Fixes the Layout
		JPanel buttonPanel = new JPanel();
		buttonPanel .setLayout(new BoxLayout(buttonPanel , BoxLayout.LINE_AXIS));
		buttonPanel .setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));
		add(buttonPanel);
		
		JButton encryptButton = new JButton("Encrypt");
		buttonPanel.add(encryptButton);
		EncryptPressed encryptPressed = new EncryptPressed();
		encryptButton.addActionListener(encryptPressed);
		
		JButton decryptButton = new JButton("Decrypt");
		buttonPanel.add(decryptButton);
		DecryptPressed decryptPressed = new DecryptPressed();
		decryptButton.addActionListener(decryptPressed);
		
		//creates and init the super duper Encryptor!
		initEncryptor();
		
		comboBox = new JComboBox(encryptionMap.keySet().toArray());
		buttonPanel.add(comboBox);
		comboBox.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Object selectedStrategy = comboBox.getSelectedItem();
				EncryptionStrategy strategy = encryptionMap.get(selectedStrategy);
				encryptor.setEncryptionStrategy(strategy);
			}
		});
		
	}
	
	public class EncryptPressed implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			String startText = new String(textAreaOriginal.getText());
			textAreaEncrypted.setText(encryptor.encrypt(startText));
		} 
	}
	
	public class DecryptPressed implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			String endText = new String(textAreaEncrypted.getText());
			textAreaOriginal.setText(encryptor.decrypt(endText));
		} 
	}
	
	public void initEncryptor(){
		encryptor = new Encryptor();
		encryptor.setEncryptionStrategy(new ReverseEncryptor());
		
		
		encryptor = new Encryptor();
		encryptionMap = new HashMap<String, EncryptionStrategy>();
		encryptionMap.put("Copy", new CopyEncryptor());
		encryptionMap.put("Reverse", new ReverseEncryptor());
		
	}
}
