import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewWIndow {
	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	public NewWIndow(){
		
		label.setText("Hello world");
		label.setBounds(0,0,150,75);
		label.setFont(new Font(null,Font.PLAIN,50));
		
		frame.add(label);
		frame.setSize(420,420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}

}
