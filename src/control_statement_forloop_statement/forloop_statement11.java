package control_statement_forloop_statement;

public class forloop_statement11 
{
	public static void main(String[] args) 
	{
		
		//print odd number from 1 to 100
		
		for(int i=1;i<=100;i++)
		{
			if(i%2!=0)               //if(!(i%2==0))
			{
				System.out.println("The odd number is- "+i);
			}
		}
		
	}

}
