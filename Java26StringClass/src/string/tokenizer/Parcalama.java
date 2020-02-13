package string.tokenizer;

import java.util.StringTokenizer;

public class Parcalama {

	public static void main(String[] args) {
		String cumle ="Yenilirsen deðil vazgeçersen kaybedersin, kanka / // /// yapma etme ( neden derler böyle)";
		
		StringTokenizer t = new StringTokenizer(cumle);
		
		while(t.hasMoreTokens())
		{
			System.out.print(t.nextToken());
			System.out.print(" | ");
		}
		
		StringTokenizer tt = new StringTokenizer(cumle,",()/ ");
		System.out.println("");
		
		while(tt.hasMoreTokens())
		{
			System.out.print(tt.nextToken());
			System.out.print(" | ");
		}
		
		StringTokenizer ttt = new StringTokenizer(cumle,",");
		System.out.println("");
		
		while(ttt.hasMoreTokens())
		{
			System.out.print(ttt.nextToken());
			System.out.print(" | ");
		}
	}

}
