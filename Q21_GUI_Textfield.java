package hello;
import java.util.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Q21 {
	public static void main(String[] args)
	{
		final JFrame f = new JFrame();
		final JTextField j1 = new JTextField();
		j1.setBounds(30, 20, 100, 40);
		final JTextField j2 = new JTextField();
		j2.setBounds(30, 50, 100, 40);
		final JButton btn = new JButton("Click here");
		btn.setBounds(40, 90, 100, 50);
		final JLabel l = new JLabel();
		l.setBounds(40, 200, 100, 40);
		btn.addActionListener(new ActionListener(){
			

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				j2.setText(j1.getText());
				l.setText(j1.getText());
			}
			
		});
		f.add(j1);
		f.add(j2);
		f.add(btn);
		f.add(l);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}

}
