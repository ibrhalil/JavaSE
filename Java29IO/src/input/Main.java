package input;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) {
		
		//	File S�n�f�n� Kullanarak Dosya Olu�turma
		String dosyaAdi = "metin.txt";
		new File("File Kontrol").mkdir();
		FileSinifi dosya1 = new FileSinifi("File Kontrol\\"+dosyaAdi);
		
		try 
		{
			dosya1.dosyaOlustur();
			dosya1.dosyaOzellikleriListele();
		} 
		catch (Exception e) 
		{
			
			e.printStackTrace();
		}
		
		
		
		//	FileInputStream hem File t�r� dosya ile olu�tururuz hemde String t�r� ile olu�turabiliriz
		try 
		{
			FileInputStream dosya2 = new FileInputStream(dosya1.getFile());
			
			System.out.println("Okuma 1 :\n");
			
			System.out.println(dosya2.read());			//ASCII Kodu olarak G�r�n�r.
			System.out.println((char)dosya2.read());	//char ile karaktere cevirdik
			System.out.println((char)dosya2.read());	//her okumada okuma imleci bir sonraki karakterin ba��na ge�mektedir.
			
			dosya2.skip(5);								//5. indise atlad�k
			
			int secici;
			
			System.out.println("T�m� Listele\n");
			while ((secici=dosya2.read())!=-1) 			//dosyada okudugumuz veri kaybetmemek i�in bir de�i�kene atar�z,-1 okunacak deger yok anlam�na gelir
			{
				System.out.print((char)secici);
			}
			
			dosya2.close();								//tekrar baska y�ntemle kullan�lacak dosyay� ac�k birakmamal�y�z
			
			
			FileInputStream dosya3 = new FileInputStream("File Kontrol\\metin.txt");
			
			System.out.println("\nOkuma 2 :\n");
			
			int gezici=0;
			while(gezici!=-1)
			{
				gezici = dosya3.read();
				if(gezici==-1)
					break;
				System.out.print((char)gezici);
			}
			
			dosya3.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
