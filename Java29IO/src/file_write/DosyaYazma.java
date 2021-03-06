package file_write;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class DosyaYazma {

	static File dosya;
	
	public static void main(String[] args) {
		
		dosya = new File("Bana Bir�eyler Yaz.txt");
		
		try {
			dosyaOlustur();
			dosyaYaz();
			dosyaOku();
		} catch (Exception e) {
			System.err.println("HATA : ");
			e.printStackTrace();
		}
	}

	private static void dosyaOku() throws Exception {
		char veriler[] = new char[(int) dosya.length()];
		
		FileReader oku = new FileReader(dosya);
		oku.read(veriler);
		String cikti = new String(veriler);
		System.out.println(cikti);
		oku.close();
	}

	private static void dosyaYaz() throws Exception {
		
		FileWriter yazdir = new FileWriter(dosya);				//�st�ne yazar eski veriler gider
		//FileWriter yazdir = new FileWriter(dosya,true);		// �st�ne ekleme yapar
		yazdir.write("Merhaba bu bir metin belgesi");
		yazdir.close();
		
	}

	private static void dosyaOlustur() throws Exception {
		if(!dosya.exists())
			dosya.createNewFile();
	}

}
