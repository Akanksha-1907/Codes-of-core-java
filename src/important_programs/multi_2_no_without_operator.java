package important_programs;

public class multi_2_no_without_operator 
{
	static int product(int a,int b)
	{
		if(b==0)                                     //checks if b is 0 or not
			return 0;                                //returns 0 if any number is multiplied by 0.
		if(b>0)                                      //checks if b is greater than 0 or not
			return(a+product(a,b-1));                //calculate sum and returns the same
		if(b<0)                                      //executes if b is neagtive
			return -product(a,-b);
		return -1;
	}
	public static void main(String[] args) 
	{
		System.out.println("Multiplication is---> "+product(4,9));
		System.out.println("Multiplication is---> "+product(-7,-2));
		System.out.println("Multiplication is---> "+product(-6,3));
		
		
	}

}
