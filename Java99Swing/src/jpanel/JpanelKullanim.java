package jpanel;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class JpanelKullanim extends JPanel
{

	public JpanelKullanim() 
	{
		super();
		JFrame pencere = new JFrame("JFrame Jpanel Ekleme");
		pencere.add(this);
		pencere.setSize(600, 500);
		pencere.setVisible(true);
		
	}
	public static void main(String[] args) 
	{
		new JpanelKullanim();
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
	}

}
