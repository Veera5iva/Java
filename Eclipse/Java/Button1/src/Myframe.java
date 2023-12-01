import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Myframe extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	JButton button;
	JLabel label;
	
	public Myframe() {
		label = new JLabel();
		label.setText("Hey there!");
		label.setBounds(200,250,100,100);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setVisible(false);
		
		button = new JButton();
		button.setText("Success");
		button.setBounds(200,200,100,50);
		button.addActionListener(this);
		button.setFocusable(false);
		button.setBackground(Color.red);
		//button.setEnabled(false);
		
		this.setTitle("Button Example");
		this.setSize(500,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.add(button);
		this.add(label);
		this.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			//System.out.println("Success");
			button.setEnabled(false);  // to use only one time
			label.setVisible(true);
		}
	}
}
