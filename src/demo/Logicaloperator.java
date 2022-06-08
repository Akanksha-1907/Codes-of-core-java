package demo;

public class Logicaloperator
{
	public static void main(String[] args) 
	{
	int a=6575;
	int b=89854;
	int c=03;
	
	//Logical AND Operator
	
	System.out.println("Output for the logic is- " +((a>b)&&(b<c)));
	System.out.println("Output for the logic is- " +((b>=a)&&(b<c)));
	System.out.println("Output for the logic is- " +((a>c)&&(b>c)));
	System.out.println("Output for the logic is- " +((c>a)&&(a>b)));
	
	//Logical OR Operator
	
	System.out.println("Output for the logic is- " +((c>a)||(a<b)));
	System.out.println("Output for the logic is- " +((b>a)||(b>c)));
	System.out.println("Output for the logic is- " +((c>b)||(a>b)));
	System.out.println("Output for the logic is- " +((a>c)||(a>b)));
	
	//Logical NOT Operator
	System.out.println("Output for the logic is- " +((a>c)!=(a>b)));
	System.out.println("Output for the logic is- " +!(a>c));
	System.out.println("Output for the logic is- " +!((c>b)!=(b<c)));
	System.out.println("Output for the logic is- " +!((a>c)!=(b>c)));
	
	//Asach sahaj practice
	System.out.println("Output for the logic is- " +!(((c<b)||(a<b)&&(a>c)||(c>b)!=(a>b))));
	}
}
