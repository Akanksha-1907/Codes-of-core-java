package control_statement_while_loop_statement;

public class whileloop_7_continue
{
	public static void main(String[] args) 
	{
		//print number from 50 to 40
		
		int i=51;
		while(i>=41)
		{
			i--;
			if(i==41)
				continue;
			System.out.println(i);
		}
		System.out.println("Looping is completed");
		
	}

}
