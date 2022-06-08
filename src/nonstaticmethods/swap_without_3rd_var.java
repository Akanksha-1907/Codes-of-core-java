package nonstaticmethods;

public class swap_without_3rd_var
{
	public void umber(int a,int b)
	{
		
		//swapping of two numbers without using third variable
		// Let say a=10 & b=20
		
		System.out.println("The numbers before swapping are- "+a+" "+b);
		
		a=a+b;      //a=10+20=30
		b=a-b;      //b=30-20=10
		a=a-b;      //a=30-10=20
		
		System.out.println("The numbers after swapping are- "+a+" "+b);
	}
	public static void main(String[] args)
	{
		swap_without_3rd_var ctc=new swap_without_3rd_var();
		ctc.umber(10, 20);
		
	}

}
