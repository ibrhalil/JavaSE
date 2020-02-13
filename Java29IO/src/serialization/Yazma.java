package serialization;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Yazma 
{
	private File dosya;

	public Yazma(File dosya) throws FileNotFoundException, IOException {
		this.dosya = dosya;
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(dosya));
		
		Kisi k1 = new Kisi("Hakan", "Yýlmaz", 33);
		Kisi k2 = new Kisi("Murat", "Çoþkun", 29);
		Kisi k3 = new Kisi("Naz", "Elmas", 44);
		
		oos.writeObject(k1);
		oos.writeObject(k2);
		oos.writeObject(k3);
		
	}
}
