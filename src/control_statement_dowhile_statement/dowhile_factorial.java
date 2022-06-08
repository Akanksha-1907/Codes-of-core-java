package control_statement_dowhile_statement;

public class dowhile_factorial 
{
	int fact=1;
	int i=1;
	{
	do
	{
		fact=fact*i;
		i++;
	}
	while(i<=5);
	System.out.println(fact);
}
}
