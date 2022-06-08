package control_statement_while_loop_statement;

public class whileloop_factorial 
{
	//factorial of a number using decrement operator
	public static void main(String[] args) 
	{
	
	int fact=1;
	int i=5;
	
	while(i>=1)
	{
		fact=i*fact;
		i--;
	}
	System.out.println("Factorial of number-  is " +fact);

}
}
