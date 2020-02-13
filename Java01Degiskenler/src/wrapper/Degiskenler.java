package wrapper;

public class Degiskenler {

	public static void main(String[] args) {
		
		String isim = "Halil";
		
		Integer sayi1 = new Integer(15);
		
		Double sayi2 = new Double(11);
		
		Float sayi3 = new Float(63);
		
		Long sayi4 = new Long(256);
		
		Character karakter = new Character('b');
		
		System.out.println(isim+" "+sayi1+" "+sayi2+" "+sayi3+" "+sayi4+" "+karakter);
		
		System.out.println(isim.charAt(4));
		
		System.out.println(isim.equals("test"));
		
		System.out.println(karakter.hashCode());
		
	}

}
