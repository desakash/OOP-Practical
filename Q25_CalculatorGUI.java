package hello;
import java.util.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Q25 {
	public static void main(String[] args)
	{
		JFrame f = new JFrame();
		final JTextField calc = new JTextField();
		JButton one = new JButton("1");
		JButton two = new JButton("2");
		JButton plus = new JButton("+");
		JButton equals = new JButton("=");
		JButton prod = new JButton("*");
		calc.setBounds(20, 20, 100, 60);
		one.setBounds(10, 40, 50, 20);
		two.setBounds(10, 60, 50, 20);
		plus.setBounds(10, 80, 50, 20);
		equals.setBounds(10, 100, 50, 20);
		one.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				calc.setText((calc.getText())+"1");
				
			}
			
		});
		two.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				calc.setText((calc.getText())+"2");
				
			}
		});
			plus.addActionListener(new ActionListener(){

				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					calc.setText((calc.getText())+"+");
					
				}
			});
			prod.addActionListener(new ActionListener(){

				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					calc.setText((calc.getText())+"*");
					
				}
			});
			equals.addActionListener(new ActionListener(){

				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
					String str = calc.getText();
					String[] s1 = str.split("=");
					String[] s = s1[0].split("\\+");
					String[] s2 = s1[0].split("*");
					int arr[] = new int[s.length];
					for(int i=0;i<arr.length;i++)
						arr[i] = Integer.parseInt(s[i]);
					int sum = arr[0]+arr[1];
					calc.setText((calc.getText())+"=");
					calc.setText((calc.getText())+sum);
					
				}
			});
			f.add(one);
			f.add(two);
			f.add(plus);
			f.add(equals);
			f.add(calc);
			f.setVisible(true);
			






}
}