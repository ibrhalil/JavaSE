package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetListesi {

	public static void main(String[] args) {
		Set<Integer> liste = new HashSet<>();
		ArrayList<Integer> liste2 = new ArrayList<>();
		for (int i = 10; i < 90; i++) {
			int sayi = (new Random()).nextInt(i)+10;
			boolean a = liste.add(sayi);
			if(a)
			{
				liste2.add(sayi);
			}
		}
		System.out.println("ArrayList Listesi");
		for (Integer sayi : liste2) {
			System.out.print(sayi+" ");
		}
		System.out.println("\nHashSet Listesi");
		for (Integer sayi : liste) {
			System.out.print(sayi+" ");
		}
		
	}

}
