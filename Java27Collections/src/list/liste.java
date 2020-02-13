package list;

import java.util.List;
import java.util.ArrayList;

public class liste {

	public static void main(String[] args) {
		
		List<Integer> liste = new ArrayList<Integer>();
		
		liste.add(23);
		liste.add(52);
		liste.add(95);
		liste.add(21);
		liste.add(12);
		liste.add(84);
		liste.add(37);
		liste.add(55);
		
		for (Integer sayi : liste) {
			System.out.print(sayi+" ");
		}
		
		liste.remove(5);
		System.out.println("");
		
		for (Integer sayi : liste) {
			System.out.print(sayi+" ");
		} 
	}

}
