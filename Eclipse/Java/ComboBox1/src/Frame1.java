import javax.swing.*;
import java.awt.event.*;


public class Frame1 extends JFrame implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JComboBox<?> cb;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Frame1() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		String[] options = {"2-Wheeler","4-Wheeler"}; 
		
		cb = new JComboBox(options);
		cb.setBounds(220,100,100,30);
		cb.addActionListener(this);
		//cb.setAlignmentX(LEFT_ALIGNMENT);
		
		this.add(cb);
		
		this.setSize(500,500);
		this.setLayout(null);
		this.setVisible(true);
		
	
		
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==cb) {
			System.out.println(cb.getSelectedItem());
		}
		
	}
	
}
