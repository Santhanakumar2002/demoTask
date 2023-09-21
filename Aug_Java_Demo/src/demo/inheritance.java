package demo;

public class inheritance {
	class calc1{
	public int add1(int a, int b) 
	{
		return a+b;
	}
public int sub1(int a, int b)
{
	return a-b;

}
	}
	
	 class advcalc1 extends calc1
	{
		public int multi1(int a,int b)
		{
			return a*b;
			}
		
		public int div1(int a,int b ) {
			return a/b;
			
		}
		class veryadvcal extends advcalc1
		{
			public double power(int a, int b) 
			{
				return Math.pow(a,b);
				
			}
		}
}
	 
	
	public static void main(String[] args) {
		advcalc obj=new advcalc();
		int r1=obj.add1(6,9);
		int r2=obj.sub1(12, 6);
		int r3=obj.multi1(13, 4);
		int r4=obj.div1(6, 9);
		double r5=obj.power(6,3);
		System.out.println(r1+" "+r2+" "+r3+" "+r4+" "+r5);
}
}
