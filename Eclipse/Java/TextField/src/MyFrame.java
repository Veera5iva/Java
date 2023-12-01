import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class MyFrame extends JFrame implements ActionListener{
	
	
	JButton b;
	JTextField tf;
	
	public MyFrame() {
		b = new JButton("Finish");
		b.addActionListener(this);
		
		
		tf = new JTextField();
		tf.setPreferredSize(new Dimension(250,40));
		tf.setFont(new Font("Consolas",Font.PLAIN,20));
		
		this.add(b);
		this.add(tf);
		this.setLayout(new FlowLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b) {
			System.out.println(tf.getText());
			b.setEnabled(false);
			tf.setEditable(false);
			
		}
	}
	
}