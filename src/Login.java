import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame{
	public Login() {
	JPanel panel = new JPanel();
	JLabel labelId = new JLabel("ID : ");
	JLabel labelPw = new JLabel("PassWord : ");
	JTextField txtID = new JTextField(10);
	JPasswordField txtPw = new JPasswordField(10);
	JButton logBtn = new JButton("Login");
	
	
	panel.add(labelId);
	panel.add(txtID);
	panel.add(labelPw);
	panel.add(txtPw);
	panel.add(logBtn);
	
	logBtn.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			String id = "Jun";
			String pass = "1234";
			
			if(id.equals(txtID.getText()) && pass.equals(txtPw.getText())){
				JOptionPane.showMessageDialog(null, "correct!");
			}else {
				JOptionPane.showMessageDialog(null, "not Correct! try Again");
			}
			
		}
	});
	add(panel);
	
	
	setVisible(true);
	setSize(600, 400);
	setResizable(false);
	setLocationRelativeTo(null);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Login();
	}
}
