package Practiceset;
import java.util.Scanner;


public class cbsepercentageuserinput
{
	public static void main(String a [])
	{
		Scanner ab=new Scanner(System.in);
		
		System.out.println("Marks of English- ");
		int p=ab.nextInt();
		
		System.out.println("Marks of Mathematics- ");
		int q=ab.nextInt();
		
		System.out.println("Marks of Science- ");
		int r=ab.nextInt();
		
		System.out.println("Marks of Social Science- ");
		int s=ab.nextInt();
		
		System.out.println("Marks of Sanskrit- ");
		int t=ab.nextInt();
		
		float sum=p+q+r+s+t;
		System.out.println("Percentage- " +((sum/500)*100));
		
	}

}
