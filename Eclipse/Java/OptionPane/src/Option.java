import javax.swing.JOptionPane;
public class Option {

	public static void main(String[] args) {
		//JOptionPane.showMessageDialog(null,"Confidential Info","Note",JOptionPane.PLAIN_MESSAGE);
		//JOptionPane.showMessageDialog(null,"Confidential Info","Note",JOptionPane.INFORMATION_MESSAGE);
		//JOptionPane.showMessageDialog(null,"Confidential Info","Note",JOptionPane.QUESTION_MESSAGE);
		//JOptionPane.showMessageDialog(null,"Confidential Info","Note",JOptionPane.WARNING_MESSAGE);
		//JOptionPane.showMessageDialog(null,"Confidential Info","Note",JOptionPane.ERROR_MESSAGE);
		
		//System.out.println(JOptionPane.showConfirmDialog(null,"Are you studying?","Choose one",JOptionPane.YES_NO_CANCEL_OPTION));
		
		int answer = JOptionPane.showConfirmDialog(null,"Are you studying?","Choose one",JOptionPane.YES_NO_CANCEL_OPTION);
		if(answer==1){
			System.out.println("No");
		}
		
		String name = JOptionPane.showInputDialog("What is your name?");
		System.out.println(name);
		
		String[] option = {"Hey there","Welcome","Thank you"};
		//JOptionPane.showMessageDialog(null, option, name, answer);
		JOptionPane.showOptionDialog(null,"You're awesome","Secret message",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,null,option,0);
	}	
}
