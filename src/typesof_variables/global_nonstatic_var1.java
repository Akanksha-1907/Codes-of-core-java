package typesof_variables;

public class global_nonstatic_var1 
{
	String name;
	int rollno;
	int geo;
	int maths;
	int eng;
	
	
	public static void main(String[] args)
	{
		global_nonstatic_var1 Ashu=new global_nonstatic_var1 ();
		Ashu.name="Ashu";
		Ashu.rollno=2;
		Ashu.geo=85;
		Ashu.maths=85;
		Ashu.eng=85;
		
		global_nonstatic_var1 Abu=new global_nonstatic_var1 ();
		Abu.name="Abu";
		Abu.rollno=1;
		Abu.geo=75;
		Abu.maths=65;
		Abu.eng=40;
		
		
		global_nonstatic_var1 Anu=new global_nonstatic_var1 ();
		Anu.name="Anu";
		Anu.rollno=3;
		Anu.geo=50;
		Anu.maths=92;
		Anu.eng=58;
		
		System.out.println("Student number 1 information- "+Ashu.name+" "+Ashu.rollno+" "+Ashu.geo+" "+Ashu.maths+" "+Ashu.eng);
		System.out.println("Student number 2 information- "+Abu.name+" "+Abu.rollno+" "+Abu.geo+" "+Abu.maths+" "+Abu.eng);
		System.out.println("Student number 3 information- "+Anu.name+" "+Anu.rollno+" "+Anu.geo+" "+Anu.maths+" "+Anu.eng);
	}

}
