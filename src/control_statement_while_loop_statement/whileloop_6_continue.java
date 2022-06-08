package control_statement_while_loop_statement;

public class whileloop_6_continue
{
	public static void main(String[] args) 
	{
		//print number from 20 to 30 but don't print 24
		
		int a=19;  
		//in while loop if we have to use continue then initial number should take (-1)i.e. initial number-1
		while(a<=29)
		{
			a++;               //and we have to write increment/decrement operator before if statement for both while and do while
			if(a==24)
			 continue;
			 System.out.println(a);
			
		}
		System.out.println("Looping completed");
	}
}
				
		
	


