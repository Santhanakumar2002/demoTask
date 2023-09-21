package college;

import java.util.Scanner;

public class scanner {


	public static void main(String[] args) {
		int start;
		int end;
	
	 Scanner Obj = new Scanner(System.in);
	 System.out.println("enter your star and end number");
	 start=Obj.nextInt();
	 end=Obj.nextInt();
	  System.out.println("Odd number");
	  for(int i=start;i<end;i++)
	  {
		  if(i%2!=0) {
			 System.out.print(i+" "); 
		  }
		  }
	  System.out.println( "\neven number");
	  for(int i=start;i<end;i++) {
	  
		  if(i%2==0) {
			  System.out.print(i+" ");
		  }
	  }
	  
	  }
	 
	

}
