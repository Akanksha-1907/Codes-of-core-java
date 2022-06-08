package method_with_return_type;

public class Returntype_sq_cube
{
	public int square(int num) //This is local variable So we can take same variable name in another method.
	{
		return num*num;
	}
	public int cube(int num)
	{
		return num*num*num;
	}
	public static void main(String[] args) 
	{
		Returntype_sq_cube obj=new Returntype_sq_cube();
		int sq=obj.square(2);
		int cu=obj.cube(2);
		System.out.println("Square is- "+sq+" Cube is- "+cu);
		
		System.out.println(obj.square(6));
		
	}
}
