package control_statement_jump_statement;

public class break2 
{
	//print even numbers from 1 to 50 but having a range of 1 to 100
		public static void main(String[] args)
		{
			int a=1;
			while(a<=100)
			{
				if(a%2==0)
				{
					System.out.println("Even number is "+a);
					}
				a++;
				if(a==50)
					break;
				
			}
			
		}

}
