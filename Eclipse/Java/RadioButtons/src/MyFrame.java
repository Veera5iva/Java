import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MyFrame extends JFrame implements ActionListener{
	
	JRadioButton pizza;
	JRadioButton hamburger;
	JRadioButton hotdog;
	
	public MyFrame() {
		
		pizza = new JRadioButton("pizza");
		hamburger = new JRadioButton("hamburger");
		hotdog = new JRadioButton("hotdog");
		
		ButtonGroup group = new ButtonGroup();
		group.add(pizza);
		group.add(hamburger);
		group.add(hotdog);
		
		this.add(pizza);
		this.add(hamburger);
		this.add(hotdog);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.pack();
		this.setVisible(true);
		
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==pizza) {
			System.out.println("Pizza it is");
		}
		
	}
}
