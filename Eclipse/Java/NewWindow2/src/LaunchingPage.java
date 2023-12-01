import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class LaunchingPage implements ActionListener{
	JFrame frame = new JFrame();
	JButton button = new JButton();
	public LaunchingPage() {
		
		button.setText("Here");
		button.setFocusable(false);
		button.setBounds(200,50,75,75);
		button.addActionListener(this);
		
		frame.add(button);
		frame.setSize(420,420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			frame.dispose();
			NewWIndow window = new NewWIndow();
			
		}	
	}
}
