package generic_metot;

public class Main {

	public static void main(String[] args) {
		String[] liste1 = {"Ali","Veli","49","50"};
		Integer[] liste2 = {66,85,120,0};
		Character[] liste3 = {'k','l','m','n'};
		Object[] liste4 = {1,'f',"z","kalan",0.5};
		
		
		Yazdir.yazdir(liste1);
		System.out.println("-------------");
		Yazdir.yazdir(liste2);
		System.out.println("-------------");
		Yazdir.yazdir(liste3);
		System.out.println("-------------");
		Yazdir.yazdir(liste4);

	}

}