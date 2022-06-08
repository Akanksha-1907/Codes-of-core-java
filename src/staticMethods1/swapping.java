package staticMethods1;

public class swapping 
{
	//swapping values of two numbers
	//Let say a=2,b=3 then after swapping a=3,b=2
 
	public static void swapno(int a,int b)
	{
		int var;//var=2,a=2 b=3
		var=a;//a=3
		a=b;//b=3,a=3
		b=var;//b=2,a=3,var=2
		System.out.println("After swapping, The number stored in a= "+a+ " The number stored in b=" +b);
	}
	public static void main(String[] args)
	{
		swapno(3,2);
		
	}
}
