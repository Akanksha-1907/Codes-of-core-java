package important_programs;

public class Prime_or_not1
{
	public static boolean primeornot(int num)
	{
		if(num<=1)
		{
			return false;
		}
		for(int i=2;i<=num;i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
		
	}
	public static void getcount(int num)
	{
		for(int i=2;i<=num;i++)
		{
			if(primeornot(i))
				System.out.println(i+ " ");
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("55 is a prime number- " +primeornot(55));
		
		getcount(7);
		
	}

}
