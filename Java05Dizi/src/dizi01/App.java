package dizi01;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		
		int[] dizi1 = new int[5];
		
		dizi1[0]=5;
		
		//veya
		
		int dizi2[] = new int[5];
		
		//veya
		
		int[] dizi3 = {5,6,8,8,2};
		
		//veya
		
		int dizi4[] = {5,6,8,8,2};
		
		int[] dizi6 = dizi4;
		
		String[] dizi5 = new String[3];
		
		for (int i = 0; i < dizi3.length; i++) {
			System.out.print(dizi3[i]+" ");
		}
		System.out.println("");
		if (dizi3==dizi4)	//b�yle kullan�m dizi referanslar� kontrol eder
		{
			System.out.println("dizi i�erikleri e�it 1");
		}
		
		if (dizi3.equals(dizi4)) {	//dizi referans kontrol eder
			System.out.println("Diziler e�itler 2");
		}
		
		if (Arrays.equals(dizi3, dizi4)) {
			System.out.println("dizi i�erikleri e�it 3");
		}
		
		if (dizi6==dizi4) {
			System.out.println("bellekte ayn� yeri referans g�stermektedir.");
		}

	}

}
