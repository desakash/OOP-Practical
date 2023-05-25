package hello;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.*;
public class Q28 {
	public static void main(String[] args)
	{
		JFrame f = new JFrame();
		final JFrame f1= new JFrame();
		final JFrame f2 = new JFrame();
		final JButton b1 = new JButton("RedGreen");
		final JButton b2 = new JButton("Blackwhite");
		final JToggleButton red = new JToggleButton("press");
		final JButton black = new JButton("Black");
		final JButton white = new JButton("White");
		 int ctr=0;
		black.setBounds(20, 100, 100, 100);
		white.setBounds(100, 100, 100, 100);
		f2.add(black);
		f2.add(white);
		red.setBounds(30, 100, 100, 100);
		f1.add(red);
		b2.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				f2.show();
				
			}
			
		});
		black.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				f2.getContentPane().setBackground(Color.BLACK);
				
					
			}
			
		});
		white.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				f2.getContentPane().setBackground(Color.WHITE);
				
					
			}
			
		});
		red.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(red.isSelected())
				f1.getContentPane().setBackground(Color.RED);
				else
					f1.getContentPane().setBackground(Color.GREEN);
			}
			
		});
	
		b1.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				f1.show();
				
			}
			
		});
		b1.setBounds(20, 100, 100, 100);
		b2.setBounds(150, 100, 100, 100);
		f.add(b1);
		f.add(b2);
		f.getContentPane().setBackground(Color.green);
		f.setLayout(null);
		f1.setLayout(null);
		f2.setLayout(null);
		
		f.setVisible(true);
	}
	

}
