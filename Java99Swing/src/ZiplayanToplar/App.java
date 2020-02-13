package ZiplayanToplar;

import javax.swing.JFrame;

public class App {

	public static void main(String[] args) {
		
		JFrame pencere = new JFrame("Zýplayan Toplar");
		Ekran panel = new Ekran();
		
		pencere.add(panel);
		pencere.setSize(650,450);
		pencere.setVisible(true);
		pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
