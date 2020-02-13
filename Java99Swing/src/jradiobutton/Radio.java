package jradiobutton;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Radio {
	
	public static void main(String[] args) {

		JFrame pencere = new JFrame("JRadio Button");
		pencere.add(new RadioPencere());
		pencere.setBounds(250, 50, 400, 300);
		pencere.setDefaultCloseOperation(pencere.EXIT_ON_CLOSE);
		pencere.setVisible(true);
	}

}

class RadioPencere extends JPanel
{
	public RadioPencere() {
		JRadioButton rb1 = new JRadioButton("radio btn 1");
		JRadioButton rb2 = new JRadioButton("radio btn 2");
		JRadioButton rb3 = new JRadioButton("radio btn 2");
		
		JRadioButton rb4 = new JRadioButton("radio btn 2");
		
		//radio conponentini gruplamak laz�m
		
		ButtonGroup grup1 = new ButtonGroup();
		
		grup1.add(rb1);
		grup1.add(rb2);
		grup1.add(rb3);
		
		add(rb1);
		add(rb2);
		add(rb3);
		add(rb4);
		
	}
}
