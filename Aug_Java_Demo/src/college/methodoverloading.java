package college;

public class methodoverloading // overloading is working by creating the same methods and different parameters.
{
	public int add(int i1,int i2,int i3) {
		return i1+i2+i3;
		}
	public int add(int i1, int i2)
	{
		return i1+i2;
	}
	public static void main(String[] args)
	{
		methodoverloading obj= new methodoverloading ();
		int a1=obj.add(10, 20,30);
		System.out.println(a1);
				//add(int i1:10, int i2:12);
		
	}

}
