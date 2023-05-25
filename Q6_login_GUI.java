package hello;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Q6 {
	public static void main(String[] Args)
	{
		JFrame f = new JFrame("User Login");
		JLabel j1 = new JLabel("Username");
		j1.setBounds(20, 20, 100, 14);
		JLabel j2 = new JLabel("Password");
		j2.setBounds(20, 60, 100, 14);
		final JTextField userfield = new JTextField("");
		final JPasswordField passfield = new JPasswordField("");
		userfield.setBounds(40,20,100, 10);
		passfield.setBounds(40, 60, 100, 10);
		JButton loginbtn = new JButton("Login");
		loginbtn.setBounds(40,60,100,20);
		final JLabel j3 = new JLabel();
		j3.setBounds(10, 80, 100, 20);
		loginbtn.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
		
			j3.setText("Username = "+userfield.getText()+" Password = "+passfield.getText());
		}
		
	});
		f.add(j1);
		f.add(j2);
		f.add(userfield);
		f.add(passfield);
		f.add(loginbtn);
		f.add(j3);
		f.setSize(300,400);
		f.setLayout(null);
		f.getContentPane().setBackground(Color.cyan);
		f.setVisible(true);

}
}
