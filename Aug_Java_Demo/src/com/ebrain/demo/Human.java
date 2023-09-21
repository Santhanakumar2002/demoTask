package com.ebrain.demo;

public class Human {
	private static Object viodStaticmethod;

	private String name;
	
	private String fathername;
	
	private String mothername;
	
	private double monthlysalary;

	private long mobileno;
	
	private String email;
	
	private boolean isGraduated;
	
	public void setName(String yourName) { // method without return type
		this.name= yourName;
	} 
	
	public String getName() { // method with return type
		return name;
		
	}
	
	public void voidNormalmethod() {
		System.out.println("hey mr.sandy this is void normal method");//method without arugments and no return type; 
	}

	public static void voidstaticmethod() {
		System.out.println("hey mr.sandy this is void static method");// method without arugments and with return type; 
	}

 	
	public Human() {} //defualt constructor;
	
	//user definr constructor

	public Human(String name,String fathername,String mothername,double monthlysalary,long mobileno,String email) {
		this.name= name;
		this.fathername=fathername;
		this.mothername=mothername;
		this.monthlysalary=monthlysalary;
		this.mobileno=mobileno;
		this.email=email;
		
	}
	
	public static void main(String[] args) {
	
		Human sandyObj = new Human();
		
		//sandyObj.name =	"Sandy";
		sandyObj.setName("Sandy");
		sandyObj.fathername = "Mariappan";
		sandyObj.mothername = "Sumathi";
		sandyObj.monthlysalary = 250000.00;
		sandyObj.mobileno= 8925196535l;
		sandyObj.email="msanthanamkumar10@gmail.com";
		sandyObj.isGraduated = true;
		
		sandyObj.voidNormalmethod();
		Human.voidstaticmethod();
		
		String sandyDetails= sandyObj.name+","+sandyObj.fathername+","+sandyObj.mothername+","+sandyObj.mobileno;
		System.out.println(sandyDetails);
		
		/*
				
		Human ranjithObj= new Human ("ranjith", "mariapan", "sumathi", 25000, 9600373320l, "ranjithkunmar@gmail");
		
		
		
		Human johnObj= new Human("john", "joshep", "meenaka", 2500000, 8220896944l, null);
		
		
		
		String sandyDetails= sandyObj.name+","+sandyObj.fathername+","+sandyObj.mothername+","+sandyObj.mobileno;
		
		String ranjithDetails=ranjithObj.name+","+ranjithObj.fathername+","+ranjithObj.mothername+","+ranjithObj.mobileno;
		
		String johnDetails=johnObj.name+","+johnObj.fathername+","+johnObj.mothername+","+johnObj.mobileno;
		
		System.out.println(sandyDetails);
		System.out.println(ranjithDetails);
		System.out.println(johnDetails);
*/
	}

}
