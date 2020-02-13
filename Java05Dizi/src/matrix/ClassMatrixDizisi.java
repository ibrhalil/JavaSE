package matrix;

class SinifMatrix {
	int sayi;

	public SinifMatrix(int sayi) {
		this.sayi = sayi;
	}

	public String toString() {
		return sayi + "";
	}

	public int getSayi() {
		return sayi;
	}

	public void setSayi(int sayi) {
		this.sayi = sayi;
	}

}

public class ClassMatrixDizisi {

	public static void main(String[] args) {

		SinifMatrix[][] sm = new SinifMatrix[3][3];

		sm[0][0] = new SinifMatrix(15);

		sm[1][2] = new SinifMatrix(16);
		yazdir(sm);

	}

	static void yazdir(Object[][] obj) {
		for (int i = 0; i < obj.length; i++) {
			for (int j = 0; j < obj[i].length; j++) {
				System.out.print(
						(obj[i][j] != null ? obj[i][j].toString() : "-1" )+ "   ");
			}
			System.out.println("");
		}
	}

}
