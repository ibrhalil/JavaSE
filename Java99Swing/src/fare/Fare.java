package fare;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class Fare extends JFrame implements MouseListener
{

	public Fare() {
		setSize(600,600);
		setVisible(true);
		
		addMouseListener(this);
	}
	
	public static void main(String[] args) 
	{
		new Fare();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("mouseClicked");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("mousePressed");
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("mouseReleased");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("mouseEntered");
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("mouseExited");
		
	}

}
