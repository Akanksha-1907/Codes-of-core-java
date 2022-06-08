package control_statement_while_loop_statement;

public class whileloop_factorial1
{
	
		//factorial of a number using increment operator
		public static void main(String[] args) 
		{
		
		int number=5;
		int fact=1;
		int i=1;
		
		while(i<=5)
		{
			fact=i*fact;
			i++;
		}
		System.out.println("Factorial of number- " +number+" is " +fact);

	}
	}



