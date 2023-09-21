package demo;


	class value{
	public int add(int n1,int n2){
		
	
		return n1+n2;
	}
	}
	class adv extends value{
	public int add(int n1,int n2) {
		
		return n1+n2+1;
	}
	}
	public class ridding {
	public static void main(String[] args)
	{
		
		adv obj = new adv();
	 int r1=obj.add(5,9);
	 System.out.println(r1);// here the both values are printed parent and child class are printed
	 value obj1=new value();
		int r2=obj1.add(12 ,0);
	 System.out.println(r2);
	}

}

