package control_statement_jump_statement;

public class continue2
{
	public static void main(String[] args) 
	{
		
		//print odd number between 1 to 25 but don't print 13    
		int a=26;
		while(a>=1)
		{
			a--;
			if(a%2!=0)
			
			{
				if(a==13)
					continue;
				System.out.println(a);
				
			}
		
			
		}
	
	
	}

}
