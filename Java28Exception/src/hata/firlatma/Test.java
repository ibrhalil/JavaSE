package hata.firlatma;

public class Test {

	public static void main(String[] args) {

		try {
			System.out.println(new Test().bolme(10, 0));
			
		}
		catch (ArithmeticException e) {
			System.out.println("Say� S�f�ra b�l�nemez");
		}
	
	}
	
	double bolme(int a, int b)
	{
		return a/b;
	}

}
