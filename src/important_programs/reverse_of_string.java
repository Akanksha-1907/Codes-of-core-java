package important_programs;

public class reverse_of_string 
{
	public static void main(String[] args)
	{
		String str="AutomationTesting",nstr=" ";
		char ch;
		System.out.println("Original Word- ");
		System.out.println("AutomationTesting");
		
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			nstr=ch+nstr;
		}
		System.out.println("Reversed Word- "+nstr);
}

}