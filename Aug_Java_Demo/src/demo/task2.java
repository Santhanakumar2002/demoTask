package demo;

import java.util.ArrayList;
import java.util.Scanner;

// in array list we get from  scanner to  chech either odd or even;
public class task2 {
	public static void main(String[] args) {
		
		ArrayList<Integer>evenList = new ArrayList<Integer>();
		 ArrayList<Integer>oddList = new ArrayList<Integer>();
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
	
