package trial1;
import java.util.Scanner;

public class reverse_string_scanner 
{
	public static void main(String[] args) 
	{
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter the String");
	String str=obj.next();
	
	for(int i=str.length();i>0;i--)
	{
		System.out.print(str.charAt(i-1));
	}
	
	

}
}
