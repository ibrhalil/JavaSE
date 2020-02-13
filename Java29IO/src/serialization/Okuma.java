package serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Okuma {
	
	private File dosya;

	public Okuma(File dosya) throws FileNotFoundException, IOException, ClassNotFoundException {
		this.dosya = dosya;
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(dosya));
		
		Kisi k1 = (Kisi) ois.readObject();
		Kisi k2 = (Kisi) ois.readObject();
		
		Kisi k3 = (Kisi) ois.readObject();
		//Kisi k4 = (Kisi) ois.readObject();	//hata verir
		
		System.out.println(k1.toString());
		System.out.println(k2.toString());
		
		System.out.println(k3.toString());
	}
	
	

}
