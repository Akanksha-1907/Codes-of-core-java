package control_statement_forloop_statement;

public class forloop_statement12
{
	//print even number from 1 to 100 and else odd number from 1 to 100
	
	public static void main(String[] args)
	{
		for (int k=1;k<=100;k++)
		{
			if(k%2==0)
				System.out.println("The even number is- "+k);
			else
				System.out.println("The odd number is-  "+k);
		}
	}

}
