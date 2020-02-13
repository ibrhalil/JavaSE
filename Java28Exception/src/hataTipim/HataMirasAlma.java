package hataTipim;

class HataTipim extends Exception
{
	String hataMetni = "Özel Hata Tipi";
	String hataTipi = "hataTipim";
	
	HataTipim()
	{
		
	}

	@Override
	public String toString() {
		
		hataMetni+=String.format(" : "+ hataTipi);
		return hataMetni;
	}
	
	
}


public class HataMirasAlma {

	public static void main(String[] args) {
		
		try {
			metot();
		} catch (HataTipim e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.toString());
		}
	}
	static void metot() throws HataTipim
	{
		throw new HataTipim();
	}

}
