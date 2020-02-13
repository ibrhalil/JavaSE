package object_serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class NesneSerilestirme {

	public static void main(String[] args) {
		
		Kisi k1 = new Kisi("Mehmet", 32);
		Kisi k2 = new Kisi("Murat", 13);
		Kisi k3 = new Kisi("Nuran", 23);
		Kisi k4 = new Kisi("�lknur", 70);
		
		
		
		File dosya = new File("bilgiler.txt");
		
		try {
			dosyalama(dosya);
			FileOutputStream fos = dosyaFOS(dosya);
			ObjectOutputStream oos = dosyaOOS(fos);
			
			oos.writeObject(k1);
			oos.writeObject(k2);
			oos.writeObject(k3);
			oos.writeObject(k4);
			
			oos.close();
			fos.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		System.out.println("Ba�ar�l�...");
		
		
		

	}
	
	private static FileOutputStream dosyaFOS(File dosya) throws Exception{
		return new FileOutputStream(dosya);
	}

	private static ObjectOutputStream dosyaOOS(FileOutputStream fos) throws Exception {
		return new ObjectOutputStream(fos);
	}
	
	static void dosyalama(File dosya) throws Exception
	{
		if(!dosya.exists())
			dosya.createNewFile();
		
		
	}

}
