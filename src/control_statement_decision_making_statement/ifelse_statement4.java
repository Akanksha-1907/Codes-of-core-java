package control_statement_decision_making_statement;

public class ifelse_statement4
{
	public static void main(String[] args) 
	{
		int year=2015;
		if(((year%4 ==0)&&(year%100!=0))||(year%400==0))
		{
			System.out.println("Leap Year");
		}
		else 
		{
			System.out.println("Common Year");
		}
		
	}
}
