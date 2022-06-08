package control_statement_jump_statement;

public class continue1 
{
	//print number from 1 to 5 and skip number 3
	
	public static void main(String[] args) 
	{
		for(int i=1; i<=5; i++)
		{
			if(i==3)
				continue;
			System.out.println(i);
		}
		System.out.println("3 is skipped");
		
	}

}
