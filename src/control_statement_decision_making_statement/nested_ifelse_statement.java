package control_statement_decision_making_statement;

public class nested_ifelse_statement
{
	public static void main(String[] args) 
	{
		String Username="akanksha@yahoo.com";
		String Password="Diamond@987";
		
		if (Username=="akanksha@yahoo.com")
		{
			System.out.println("Username is correct");
			if (Password=="Diamond@987")
			{
				System.out.println("Password is correct");
				System.out.println("Login Successful");
			}
			else
			{
				System.out.println("Password is Incorrect");
				System.out.println("Login Failed");
			}
		}
		else
		{
			System.out.println("Username is Incorrect");
		}
		
	}

}
