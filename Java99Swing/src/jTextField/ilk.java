package jTextField;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ilk extends JPanel{
	
	JTextField jtf1;
	
	public ilk() {
		super();
		jtf1 = new JTextField(10);
		add(jtf1);
		
	}

	public static void main(String[] args) {
		
		JFrame pen = new JFrame("JTextField Kullaným");
		pen.add(new ilk());
		pen.setSize(700,400);
		pen.setVisible(true);
		pen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
