package full;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class YazmaOkuma {

	public static void main(String[] args) {
		File dosya = new File("Pazar Listesi.txt");
		
		try {
			kontrol(dosya);
			islem(dosya);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		System.err.println("program sonland�r�ld�");
	}
	
	static void kontrol(File dosya) throws Exception
	{
		if (!dosya.exists()) {
			dosya.createNewFile();
		}
		
		if (yazOku(dosya)) {
			System.out.println("Dosya Ad�    : "+dosya.getName());
			System.out.println("Dosya Yolu   : "+dosya.getAbsolutePath());
			System.out.println("Dosya Boyutu : "+dosya.getTotalSpace());
			System.out.println("******************************");
			System.out.println("Dosya length : "+dosya.length());
		}
		else
		{
			System.out.println(dosya.getName()+ " bu dosya yaz�lamaz veya okunamaz.");
		}
	}
	static boolean yazOku(File dosya)
	{
		return (dosya.canRead()&&dosya.canWrite());
	}
	static void islem(File dosya) throws Exception
	{
		System.out.println(" 1 - Dosya Oku");
		System.out.println(" 2 - Dosya Yaz");
		System.out.println(" 3 - Dosya Sil");
		System.out.println(" 4 - Dosya G�ncelle");
		System.out.println(" q - ��k\n");
		
		Scanner oku = new Scanner(System.in);
		while (true) {
			System.out.print("Seciminiz : ");
			String sec = oku.next();
			if (sec.equals("q")) {
				break;
			}
			else if(sec.equals("1"))
			{
				islem1(dosya);
			}
			else if(sec.equals("2"))
			{
				
			}
			else if(sec.equals("3"))
			{
				
			}
			else if(sec.equals("3"))
			{
				
			}
			break;
		}
	}
	
	static void islem1(File dosya) throws Exception{
		FileReader oku = new FileReader(dosya);
		char[] karakterDizi = new char[(int) dosya.length()];
		
		
		if (oku.read()!=-1) {
			System.out.println("******************************");
			oku.read(karakterDizi);
			String yazi = new String(karakterDizi);
			System.out.println(yazi);
			System.out.println("******************************");
		}
		else
		{
			System.out.println("dosyan�n i�i bo�");
		}
		
	}
	
	static void islem2(File dosya) throws Exception
	{
		
	}

}
