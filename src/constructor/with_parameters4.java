package constructor;

public class with_parameters4 
{
	String name;
	int rollno;
	String college;
	String city;
	float percentage;
	char grade;
	
	with_parameters4(String n,int r,String c,String ci,float p,char g)
	{
		name=n;
		rollno=r;
		college=c;
		city=ci;
		percentage=p;
		grade=g;
		
		System.out.println("Information of student");
		System.out.println("Name= "+n);        //or we can write name instead of n.
		System.out.println("Roll.no.= "+r);
		System.out.println("College Name= "+c);
		System.out.println("City Name= "+ci);
		System.out.println("Percentage= "+p);
		System.out.println("Grade= "+g);
		
	}
		public static void main(String[] args)
		{
			with_parameters4 obj=new with_parameters4("Akanksha",03,"Sipna","Amravati",96.36f,'A');
			
		}
}
