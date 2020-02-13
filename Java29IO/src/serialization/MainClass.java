package serialization;

import java.io.File;

public class MainClass {

	public static void main(String[] args) {
		
		try 
		{
			new File("serilestirme").mkdir();
			File dosya = new File("serilestirme\\veri.bin");
			
			if(!dosya.exists())
			{
				dosya.createNewFile();
			}
			
			new Yazma(dosya);
			
			System.gc();
			
			new Okuma(dosya);
			
			
			System.out.println("Program Sonlandý.");
		} 
		catch (Exception e) 
		{
			System.err.println("Hata VAr !!");
			e.printStackTrace();
		}

	}

}
