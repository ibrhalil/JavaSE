package updateFile;

import java.io.File;

public class DosyaYenidenAdlandirma {
	public static void main(String[] args) {
		File dv = new File("notlar2.txt");		//var olan dosya
		File vd = new File("patlican");		//istelinen ad
		dv.renameTo(vd);
	}
}
