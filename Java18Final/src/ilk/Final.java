package ilk;

public final class Final {
	private final int a;
	
	public Final(int a) {
		this.a=a;
	}
	
	public final void metodTest() {
		System.out.println("test metodu çalıştı");
	}
	
	public void metodd(final int a) {
		//a++;//final parametreler değiştirelemezler
		
		
	}
}
