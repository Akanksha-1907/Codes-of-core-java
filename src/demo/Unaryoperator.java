package demo;

public class Unaryoperator
{
	public static void main(String[] args) 
	{
		//Decerement Operator
		//1. Post Decrement
		
		int a=85;
		int b=96;
		
		System.out.println("The Decremented Value is- " +(a--));
		
		//2. Pre Decrement
		
		System.out.println("2.##############");
		System.out.println(b);
		System.out.println("The Decremented Value is- " +(--b));
		System.out.println(b);
		
		//Increment Operator
		//1. Pre Increment
		
		
		System.out.println("3.##############");
		System.out.println("The Incremented Value is- " +(++b));
		System.out.println(b);
		
		//2. Post Increment
		
		System.out.println("4.##############");
		System.out.println("The Incremented Value is- " +(b++));
		System.out.println(b);
		
	}
	

}
