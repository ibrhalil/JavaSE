package hataTipim;

public class HataOlusturma {

	public static void main(String[] args) {

		
		try {
			sifiraBol(9,6);
			sifiraBol(3,0);
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("\n"+e);
		}
		finally {
			System.out.println("Program sonlandýrýldý.");
		}
	}
	
	static void sifiraBol(int a,int b) 
	{
		if (b==0) {
			throw new ArithmeticException(a+" sayýsý sýfýra bölünemez.");
		}
		else
		{
			System.out.println(a/b);
		}
	}

}
