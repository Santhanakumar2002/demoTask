package college;

import java.util.Scanner;

public class length {
	public static void main(String[] args) {
		String name1;
		String name2;
		String str= new String();
		Scanner sc= new Scanner(System.in);
		
		 	System.out.println("Enter the name:");
		 	
		 	name1=sc.nextLine();
			 name2=sc.nextLine();
			 
//			 str=name1+name2;
			 System.out.println(name1+" "+ name2 );// how many space u want in between the two string;
			 //System.out.println(name1.concat(name2) );
			 str=name1+name2;
			 System.out.println("string length:"+str.length());
			 
			for(int i=0;i<=(str.length());i++) 
			{
				System.out.println(str.charAt(str.length()-i-1));
			}
	
	}

}
