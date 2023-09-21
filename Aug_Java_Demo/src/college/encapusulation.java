package college;

public class encapusulation {
	private int age;
	private String name;
	public int getage() // here i getting a data :
	{
		return age;
	}
	public  int setAge(int a) // here i getting a data :
	{
		 return age=a;
	}
	public String getname() 
	{
  return name;
	}
	public  void setName(String n) // here i getting a data :
	{
		 name =n;
	}
	
	 

	
	public static void main(String[] args) {
	encapusulation obj= new encapusulation();
	obj.setAge(21);
	obj.setName("Sandy");// assigining the values by using methods
	System.out.println(obj.getname()+" "+obj.getage());
	}

}
//Here encapsulation is working how it is If you declare a variable private means you can able to access it in a public method so you have to get and call the method:)