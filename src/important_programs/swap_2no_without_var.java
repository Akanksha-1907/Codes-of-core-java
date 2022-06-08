package important_programs;

public class swap_2no_without_var
{
	public void m2(int p,int q)
	{
		System.out.println("Before Swapping- "+p+" "+q);
		p=p+q;
		q=p-q;
		p=p-q;
		System.out.println("After Swapping- "+p+" "+q);
	}
	public static void main(String[] args)
	{
		swap_2no_without_var obj=new swap_2no_without_var();
		obj.m2(12, 98);
		
	}

}
