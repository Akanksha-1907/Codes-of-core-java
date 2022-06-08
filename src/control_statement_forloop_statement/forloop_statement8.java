package control_statement_forloop_statement;

public class forloop_statement8
{
	public static void main(String[] args) 
	{
		//display sum of n natural numbers or natural numbers from 1 to 1000
		
		int sum=0;
		int n=1000;     //n(n+1)/2
		
		for(int i=1;i<=n;++i)
		{
		
	      sum += i;                       //sum=sum+i
		}
		System.out.println("sum- "+sum);
		
	}

}

