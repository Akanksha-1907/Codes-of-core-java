package control_statement_decision_making_statement;

public class if_statement 
{
	public static void main(String[] args) 
	{
		
		//if the condition is satisfied it prints all of that.
		
		int marks=60;
		if(marks>50)
		{
			System.out.println("Congratulations! You are promoted to the next class");
		}
		System.out.println("Good luck.");
		
		//if the condition is not satisfied then it not prints the value.
		//it only prints the last statement which is out of that scope where the if statement is written.
		
		int marks1=60;
		if(marks1>75)
			
		{
		System.out.println("Congratulations! You are promoted to the next class");
		}
		System.out.println("***********");
	    System.out.println("Good luck for the next time.");
	
	}

}
