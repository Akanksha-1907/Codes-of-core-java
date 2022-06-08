package trial1;

public class reversestring 
{
	public static void main(String[] args)
	{
		String s="987654321";
		//System.out.println("987654321");
		for(int i=s.length();i>0;i--)
		{
			System.out.print(s.charAt(i-1));
		}
		
		
	}

}
