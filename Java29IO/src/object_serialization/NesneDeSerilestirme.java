package object_serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class NesneDeSerilestirme {

	public static void main(String[] args) {
		
		File dosya = new File("bilgiler.txt");
		if(dosya.exists())
		{
			
			try {
				
				FileInputStream fis = new FileInputStream(dosya);
				ObjectInputStream ois = new ObjectInputStream(fis);
				
				/*System.out.println(ois.readObject());
				System.out.println(ois.readObject());
				System.out.println(ois.readObject());
				System.out.println(ois.readObject());*/
				
				Kisi k1 = (Kisi) ois.readObject();
				Kisi k2 = (Kisi) ois.readObject();
				Kisi k3 = (Kisi) ois.readObject();
				Kisi k4 = (Kisi) ois.readObject();
				
				System.out.println(k1.toString()+"\n"+k2.toString()+"\n"+k3.toString()+"\n"+k4.toString()+"\n");
				
				ois.close();
				fis.close();
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("dosya bulunamadý.");
		}

	}

}
