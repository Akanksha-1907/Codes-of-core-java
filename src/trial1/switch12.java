package trial1;
import java.util.Scanner;

public class switch12 
{
	public static void main(String[] args) 
	{
		
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter CIBIL score");
    int CIBIL=obj.nextInt();
    
    if(CIBIL>=100)
    {
    	System.out.println("12% compensation on Housing loan");
    }
    else if(CIBIL>=80)
    {
    	System.out.println("8.5% compensation on Gold loan");
    }
    else if(CIBIL>=75)
    {
    	System.out.println("7% compensation on Educational loan");
    }
    else
    {
    	System.out.println("You need to increase your CIBIL score");
    }
	

}
}
