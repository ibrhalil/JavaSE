package jbutton;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ilk extends JPanel{
	
	JButton btn1;
	public ilk() {
		btn1=new JButton("hesapla");
		add(btn1);
		
	}

	public static void main(String[] args) {
		JFrame pencere = new JFrame("Buton Kullanýmý");
		pencere.add(new ilk());
		pencere.setSize(650, 400);
		pencere.setVisible(true);
		pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
