package method_with_return_type;

public class Compare_two_values_return_with_args
{
	//method with return type and with arguments
	
	public int compare(int a,int b)    //local variables
	{
		System.out.println("Value of a= " +a);			//we can or cannot write these sop's.
		System.out.println("Value of b= "+b);
		
		if(a>b)
			return a;
		else
			return b;
		
		
	}
	public static void main(String[] args)
	{
		
		Compare_two_values_return_with_args obj=new Compare_two_values_return_with_args();
		int a=obj.compare(80, 900);
		System.out.println("Larger number is- "+a);
		
	}

}
