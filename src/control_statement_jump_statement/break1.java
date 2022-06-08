package control_statement_jump_statement;

public class break1
{
	//print number from 1 to 10 but got the range from 1 to 20
	
	public static void main(String[] args)
	{
		for(int i=1;i<=20;i++)
		{
			System.out.println(i);
			
			if(i==10)
				break;
		}
		System.out.println("Loop stopped");
		
	}

}
