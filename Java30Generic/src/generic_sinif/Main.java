package generic_sinif;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> liste1 = new ArrayList<>();
		ArrayList<Integer> liste2 = new ArrayList<>();
		ArrayList<Character> liste3 = new ArrayList<>();
		
		liste1.add("Ahmet");
		liste1.add("Melih");
		liste1.add("Efe");
		liste1.add("Kaan");
		
		liste2.add(33);
		liste2.add(23);
		liste2.add(10);
		liste2.add(89);
		
		liste3.add('e');
		liste3.add('f');
		liste3.add('r');
		liste3.add('z');
		
		Listele<String> strListe = new Listele<>();
		strListe.listele(liste1);
		System.out.println("***************");
		
		Listele<Integer> intListe = new Listele<>();
		intListe.listele(liste2);
		System.out.println("***************");
		
		Listele intListe2 = new Listele();
		intListe2.listele(liste2);
		System.out.println("***************");
		
		Listele<Character> chrListe = new Listele<>();
		chrListe.listele(liste3);
		System.out.println("***************");
	}

}
