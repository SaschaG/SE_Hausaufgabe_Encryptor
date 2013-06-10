import javax.swing.JFrame;

public class Main {

	public static void main(String [] args){
		GUI frame = new GUI();
		frame.setVisible(true);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
