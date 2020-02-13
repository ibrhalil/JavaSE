package primitive;

public class Degiskenler {

	public static void main(String[] args) {

		// Say�sal De�er Ta��yan De�i�kenler

		// Tam Say�

		byte s1 = 50;

		short s2 = 1024;

		int s3 = 200;

		long s4 = 15;

		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		System.out.println("s3 : " + s3);
		System.out.println("s4 : " + s4+"\n");

		// Noktal� Say�

		float s5 = (float) 4.6;
		float s6 = 4.6f;

		double s7 = 9.01;

		System.out.println("s5 : " + s5);
		System.out.println("s6 : " + s6+"\n");
		System.out.println("s7 : " + s7);

		// Karakter De�er Ta��yan De�i�ken

		char k = 'k';
		char c = 65;

		System.out.println("k : " + k);
		System.out.println("c : " + c+"\n");

		// True veya False

		boolean d = false;
		d = true;

		System.out.println("d : " + d);

		// De�er Aral�klar�

		System.out.println("\nDe�i�kenlerin Aral�klar�");

		System.out.println("byte En K���k De�er : " + Byte.MIN_VALUE);
		System.out.println("byte En B�y�k De�er : " + Byte.MAX_VALUE + "\n");

		System.out.println("short En K���k De�er : " + Short.MIN_VALUE);
		System.out.println("short En B�y�k De�er : " + Short.MAX_VALUE + "\n");

		System.out.println("int En K���k De�er : " + Integer.MIN_VALUE);
		System.out.println("int En B�y�k De�er : " + Integer.MAX_VALUE + "\n");

		System.out.println("long En K���k De�er : " + Long.MIN_VALUE);
		System.out.println("long En B�y�k De�er : " + Long.MAX_VALUE + "\n");

		System.out.println("float En K���k De�er : " + Float.MIN_VALUE);
		System.out.println("float En B�y�k De�er : " + Float.MAX_VALUE + "\n");

		System.out.println("double En K���k De�er : " + Double.MIN_VALUE);
		System.out.println("double En B�y�k De�er : " + Double.MAX_VALUE);

	}

}
