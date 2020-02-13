package jbutton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CalistirBtn extends JPanel implements ActionListener {

	JButton btn1;
	JButton btn2;
	JLabel lbl1;

	public CalistirBtn() {
		super();
		btn1 = new JButton("Arttýr");
		btn2 = new JButton("Azalt");
		lbl1 = new JLabel("0");
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		add(btn1);
		add(btn2);
		add(lbl1);
	}

	public static void main(String[] args) {
		JFrame pencere = new JFrame("Buton Action");
		pencere.add(new CalistirBtn());
		pencere.setSize(700, 400);
		pencere.setVisible(true);
		pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());
		if (e.getActionCommand().equals("Arttýr")) {
			lbl1.setText("" + (Integer.parseInt(lbl1.getText()) + 1));
		} else if (e.getActionCommand().equals("Azalt")) {
			lbl1.setText("" + (Integer.parseInt(lbl1.getText()) - 1));
		}

	}

}
