package control_statement_decision_making_statement;

public class elseif_statement 
{
	public static void main(String[] args) 
	{
		int marks=45;     //we can put different marks for different output..but if 1st condition is true then it do not check further.
		if(marks>=75)
		{
			System.out.println("Student passed with Distinction");
		}
		else if(marks>=60)
		{
			System.out.println("Student passed with First class");
		}
		else if(marks>=50)
		{
			System.out.println("Student passes with second class");
		}
		else if(marks>35)
		{
			System.out.println("Student passed but is below average");
		}
		else
		{
			System.out.println("Student is failed");
		}
			
		
	}

}
