package nonstaticmethods;

public class swap_3no_without3rd_var
{
	public void blue(int p,int q, int r)
	{
		System.out.println("Before swapping "+p+" "+q+" "+r);
		p=p+q+r;
		q=p-(q+r);
		r=p-(q+r);
		p=p-(q+r);
		
		System.out.println("After swapping "+p+" "+q+" "+r);
	}
	public static void main(String[] args) 
	{
		swap_3no_without3rd_var tea=new swap_3no_without3rd_var();
		tea.blue(5, 6, 7);
	}

}
