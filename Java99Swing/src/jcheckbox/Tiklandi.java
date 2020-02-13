package jcheckbox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Tiklandi {
	
	class CheckBoxPaneli extends JPanel implements ActionListener
	{
		JCheckBox c1,c2,c3;
		
		public CheckBoxPaneli() {
			c1 = new JCheckBox("Beni Seç");
			c2 = new JCheckBox("Benide Seç");
			c3 = new JCheckBox("Beni Benide Seç");
			add(c1);
			add(c2);
			add(c3);
			/*
			 * checkbox kontrolu için buton ekliyecez
			 */
			JButton btn = new JButton("Hesapla");
			add(btn);
			btn.addActionListener(this);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if (c1.isSelected()) {
				System.out.println("Tiklandi 1");
			}
			else 
			{
				System.out.println("Not Found 1");
			}
			
			if (c2.isSelected()) {
				System.out.println("Tiklandi 2");
			}
			else
			{
				System.out.println("Not Found 2");
			}
			
			if (c3.isSelected()) {
				System.out.println("Tiklandi 3");
			}
			else
			{
				System.out.println("Not Found 3");
			}
			
		}
	}

	public static void main(String[] args) {
		
		JFrame pencere = new JFrame();
		pencere.add(new Tiklandi().new CheckBoxPaneli()); 
		pencere.setBounds(250, 100, 300, 200);
		pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pencere.setVisible(true);
	}

}
