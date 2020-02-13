package systemGc;

public class GarbageCollector 
{

	public GarbageCollector() {
		System.out.println("Nesne Oluþtu");
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("Nesne Silindi");
	}

	public static void main(String[] args) 
	{
		GarbageCollector garbage = new GarbageCollector();
		garbage = new GarbageCollector();
		
		
		System.gc();
		//veya
		Runtime.getRuntime().gc();
	}

}
