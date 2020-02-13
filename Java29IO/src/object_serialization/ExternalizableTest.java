package object_serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ExternalizableTest {

	public static void main(String[] args) {
		
		//Serialization
		
		Externalizable kisi1 = new Externalizable("Ahmet", 23, 10000);
		
		File dosya = new File("Exter.bin");
		try
		{
			
		if(!dosya.exists())
			dosya.createNewFile();
		
		FileOutputStream fos = new FileOutputStream(dosya);
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(kisi1);
		
		oos.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
	
		
		
		
		
		System.out.println("Ba�ar�l�.");
	}

}
