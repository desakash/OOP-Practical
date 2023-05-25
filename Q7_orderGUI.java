package hello;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Q7 {
	public static void main(String[] args)
	{
		final JFrame f = new JFrame("Orders");
		JLabel j1 = new JLabel("Food Ordering System");
		j1.setBounds(30, 30,100, 40);
		final JCheckBox c1 = new JCheckBox("Pizza@100",false);
		c1.setBounds(60, 60, 100, 60);
		final JCheckBox c2 = new JCheckBox("Burer@30",false);
		c2.setBounds(60, 120, 100, 60);
		final JLabel j2 = new JLabel();
		final JButton order = new JButton("Order");
		order.setBounds(80, 180, 100, 80);
		order.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int amount = 0;
				String message="";
				if(c1.isSelected())
				{
					amount+=100;
					message="Pizza = 100\n";
					
				}
				if(c2.isSelected())
				{
					amount+=30;
					message+= "Burger = 30\n";
				}
				JOptionPane.showMessageDialog(f,message+"Total"+amount);
				
			}
			
			
		});
		f.add(j1);
		f.add(j2);
		f.add(c1);
		f.add(c2);
		f.add(order);
		
		f.setLayout(null);
		f.setVisible(true);

		
	}

}