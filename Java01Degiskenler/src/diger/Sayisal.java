package diger;

public class Sayisal {

	public static void main(String[] args) {

		long telefon = 542_555_55_55l;		//java otomatik cast yapt�g� i�in say�sal k�m� sonuna 'l' (long tipi) getirmesek int kabul eder ve s�n�r� a�t��� i�in hata verecektir
		int intMax = 2_147_483_647;			//2^31-1
		//System.out.println(telefon);
		char a = 0x0061;
		System.out.println(a);
		
		int b = 0x0061;
		System.out.println(b);
		
		short c = 0x0061;
		System.out.println(c);
		
		char d = 0x0061;
		System.out.println(d);
	}

}
