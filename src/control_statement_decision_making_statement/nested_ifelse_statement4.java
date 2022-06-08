package control_statement_decision_making_statement;

public class nested_ifelse_statement4 
{
	public static void main(String[] args) 
	{
		int runs=100;
		int players=11;
		{
			if(players==11)
			{
				if(runs>=80)
				{
					System.out.println("Eligible for the next match");
				}
				else
				{
					System.out.println("Not eligible for the next match");
				}
			}
			else
			{
				System.out.println("Disqualified from the match");
			}
		}
	
	}

}
