package Practiceset;
import java.util.Scanner;

public class CheckuserInput 
{
	public static void main(String args[])
	{
		System.out.println("Take input from the user");
		Scanner am=new Scanner(System.in);
		//boolean b7=am.hasNextInt();
		//System.out.println(b7);              ----1st program
		//String str=am.next();
		//System.out.println(str);             -----2nd program
		String str=am.nextLine();
		System.out.println(str);
	}

} 
