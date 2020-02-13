package object_serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ExternalizableTest2 {

	public static void main(String[] args) {
		
		
		//Deserialization
		
		
		Externalizable kisi2;
		File dosya = new File("Exter.bin");

		try {
			FileInputStream fis = new FileInputStream(dosya);

			ObjectInputStream okuu = new ObjectInputStream(fis);

			kisi2 = (object_serialization.Externalizable) okuu.readObject();

			okuu.close();
			System.out.println(kisi2.toString());
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
