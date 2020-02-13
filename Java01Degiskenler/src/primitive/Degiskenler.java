package primitive;

public class Degiskenler {

	public static void main(String[] args) {

		// Sayýsal Deðer Taþýyan Deðiþkenler

		// Tam Sayý

		byte s1 = 50;

		short s2 = 1024;

		int s3 = 200;

		long s4 = 15;

		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		System.out.println("s3 : " + s3);
		System.out.println("s4 : " + s4+"\n");

		// Noktalý Sayý

		float s5 = (float) 4.6;
		float s6 = 4.6f;

		double s7 = 9.01;

		System.out.println("s5 : " + s5);
		System.out.println("s6 : " + s6+"\n");
		System.out.println("s7 : " + s7);

		// Karakter Deðer Taþýyan Deðiþken

		char k = 'k';
		char c = 65;

		System.out.println("k : " + k);
		System.out.println("c : " + c+"\n");

		// True veya False

		boolean d = false;
		d = true;

		System.out.println("d : " + d);

		// Deðer Aralýklarý

		System.out.println("\nDeðiþkenlerin Aralýklarý");

		System.out.println("byte En Küçük Deðer : " + Byte.MIN_VALUE);
		System.out.println("byte En Büyük Deðer : " + Byte.MAX_VALUE + "\n");

		System.out.println("short En Küçük Deðer : " + Short.MIN_VALUE);
		System.out.println("short En Büyük Deðer : " + Short.MAX_VALUE + "\n");

		System.out.println("int En Küçük Deðer : " + Integer.MIN_VALUE);
		System.out.println("int En Büyük Deðer : " + Integer.MAX_VALUE + "\n");

		System.out.println("long En Küçük Deðer : " + Long.MIN_VALUE);
		System.out.println("long En Büyük Deðer : " + Long.MAX_VALUE + "\n");

		System.out.println("float En Küçük Deðer : " + Float.MIN_VALUE);
		System.out.println("float En Büyük Deðer : " + Float.MAX_VALUE + "\n");

		System.out.println("double En Küçük Deðer : " + Double.MIN_VALUE);
		System.out.println("double En Büyük Deðer : " + Double.MAX_VALUE);

	}

}
