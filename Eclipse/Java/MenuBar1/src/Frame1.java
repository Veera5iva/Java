import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Frame1 extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Frame1() {
		
		JMenuBar mb = new JMenuBar();
		
		JMenu file = new JMenu("File");
		JMenu edit = new JMenu("Edit");
		JMenu save = new JMenu("Save");
		
		JMenuItem open = new JMenuItem("open");
		JMenuItem close = new JMenuItem("close");
		JMenuItem load = new JMenuItem("load");
		
		file.add(open);
		file.add(load);
		edit.add(close);
		
		mb.add(file);
		mb.add(edit);
		mb.add(save);
		
		this.add(mb);
	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(new FlowLayout());
		this.setVisible(true);
		
	}
}
