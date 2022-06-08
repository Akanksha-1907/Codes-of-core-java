package nonstaticmethods1;

public class nonstaticpara 
{
	public void pigeon(String a,int b,char c)
	{
		System.out.println("Name of the bird is- "+a);
		System.out.println("Number of birds are- "+b);
		System.out.println("Grade of the bird is- "+c);
	}
 public static void main(String[] args)
 {
	 nonstaticpara chick=new nonstaticpara();
	 chick.pigeon("Pigeon",500,'A');
	
}
}
