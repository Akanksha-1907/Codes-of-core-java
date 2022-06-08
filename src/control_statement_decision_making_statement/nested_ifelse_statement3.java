package control_statement_decision_making_statement;

public class nested_ifelse_statement3 
{
	public static void main(String[] args)
	{
		int age=14;         //we can check output by taking different numbers
		int weight=65;
		
		if(age>=18)
		{
			if(weight>=60)
			{
				System.out.println("Eligible for the blood donation");
			}
			else
			{
				System.out.println("Not eligible for the blood donation");
			}
		}
		else
		{
			System.out.println("Not eligible for the blood donation");
		}
		
	}

}
