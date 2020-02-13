package dahili.uye.siniflar;

public class Main {

	public static void main(String[] args) {
		InnerClass in = new InnerClass();
		System.out.println(in+"                             x : "+in.x);
		
		InnerClass.AltClass inin = new InnerClass().new AltClass();
		System.out.println(inin+"                    y : "+inin.y);
		
		InnerClass.AltClass2.EnAltClass ininin = new InnerClass().new AltClass2().new EnAltClass();
		System.out.println(ininin+"        h : "+ininin.h);
		
		InnerClass I = new InnerClass();
		System.out.println(I.new AltClass().y);
	}

}
