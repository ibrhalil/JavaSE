package jlabel;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ilk extends JFrame {
	
	JLabel label1 = new JLabel("ilk JLabel");
	public ilk() {
		super();
		add(label1);
		setSize(300, 300);
		setVisible(true);

	}

	public static void main(String[] args) {

		new ilk();

	}

}
