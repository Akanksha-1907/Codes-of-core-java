package constructor;

public class with_parameters3
{
	String name;
	int rollno;
	String college;
	String city;
	float percentage;
	char grade;
	
	with_parameters3(String n,int r,String c,String ci,float p,char g)
	{
		name=n;
		rollno=r;
		college=c;
		city=ci;
		percentage=p;
		grade=g;
		
	}
	public void info()
	{
		System.out.println("Information of student");
		System.out.println("Name= "+name);
		System.out.println("Roll.no.= "+rollno);
		System.out.println("College Name= "+college);
		System.out.println("City Name= "+city);
		System.out.println("Percentage= "+percentage);
		System.out.println("Grade= "+grade);
	}
	public static void main(String[] args)
	{
		with_parameters3 obj=new with_parameters3("Akanksha",03,"Sipna","Amravati",96.36f,'A');
		obj.info();
		
		//we can give multiple student information 
		
		with_parameters3 obj1=new with_parameters3("Gauri",17,"Ram Meghe","Nagpur",89.34f,'A');
		obj1.info();
		
	}
	

}
