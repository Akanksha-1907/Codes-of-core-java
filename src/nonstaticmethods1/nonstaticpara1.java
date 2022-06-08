package nonstaticmethods1;

public class nonstaticpara1 
{
	public void fuse(float p,float q, float r)
	{
		System.out.println("The first number is- "+p);
		System.out.println("The second number is- "+q);
		System.out.println("The third number is- "+r);
		System.out.println("The sum is- "+(p+q+r));
	}
	
	public void quiet()
	{
		nonstaticpara1 xyz=new nonstaticpara1();
		xyz.fuse(2.5f,2.5f ,5.5f);
		
	}
public static void main(String[] args) 
{
	nonstaticpara1 ghj=new nonstaticpara1();
	ghj.quiet();
}

}
