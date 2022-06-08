package nonstaticmethods;

public class swap_4no_without_3rdvar
{
	public void green(int a,int b,int c,int d)
	{
		a=a+b+c+d;
		b=a-(b+c+d);
		c=a-(b+c+d);
		d=a-(b+c+d);
		a=a-(b+c+d);
		
		System.out.println("After swapping- "+a+" "+b+" "+c+" "+d);
	
	}
		public static void main(String[] args) 
		{
			swap_4no_without_3rdvar coffee=new swap_4no_without_3rdvar();
			coffee.green(9, 10, 11, 12);
			
		}
}
