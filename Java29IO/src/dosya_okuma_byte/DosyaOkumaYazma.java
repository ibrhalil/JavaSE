package dosya_okuma_byte;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DosyaOkumaYazma {

	public static void main(String[] args) {

		//byte bazlý okuma yazma
		new File("D:\\Deneme").mkdir();							//	Deneme adlý klasörü oluþturma
		
		File dosya = new File("D:\\Deneme\\Beni Oku.txt");		//	Deneme klasörünün içine Beni Oku.txt dosyasýný iþaterliyoruz
																//	Deneme klasörü Yoksa Hataya Sebep olacaktýr.
		
			try 
			{
				if(!dosya.exists())
					dosya.createNewFile();
				
				
				//	Yazma
				
				FileOutputStream yaz = new FileOutputStream(dosya);
				
				String icerik = "Bu yazý FileOutputStream ile dosyaya byte seklinde yazýlmýþtýr.";
				
				byte[] veri = icerik.getBytes();	//string türünüyü byte dizisine çeviriyor
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
