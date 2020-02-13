package dosya_okuma_byte;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DosyaOkumaYazma {

	public static void main(String[] args) {

		//byte bazl� okuma yazma
		new File("D:\\Deneme").mkdir();							//	Deneme adl� klas�r� olu�turma
		
		File dosya = new File("D:\\Deneme\\Beni Oku.txt");		//	Deneme klas�r�n�n i�ine Beni Oku.txt dosyas�n� i�aterliyoruz
																//	Deneme klas�r� Yoksa Hataya Sebep olacakt�r.
		
			try 
			{
				if(!dosya.exists())
					dosya.createNewFile();
				
				
				//	Yazma
				
				FileOutputStream yaz = new FileOutputStream(dosya);
				
				String icerik = "Bu yaz� FileOutputStream ile dosyaya byte seklinde yaz�lm��t�r.";
				
				byte[] veri = icerik.getBytes();	//string t�r�n�y� byte dizisine �eviriyor
				yaz.write(veri);
				
				yaz.close();
				
							
				
				
				
				
				//	Okuma	
				
				FileInputStream oku = new FileInputStream(dosya);
				
				byte[] dizi = new byte[(int) dosya.length()];
				
				oku.read(dizi);
				
				String yazilan = new String(dizi);
				
				System.out.println(yazilan);
				
				
				
				
				
			}
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		

	}

}
