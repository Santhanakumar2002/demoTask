package college;

import java.util.Scanner;

public class simple {
	
public static void main(String[] args) {
	String name;
	String str= new String();
	Scanner sc= new Scanner(System.in);
	
	while(true) {
		System.out.println("Enter the String :");
		name= sc.nextLine();
		
		
	if(name.equals("stop" )|| name .equals("exit")) {
		break;
	}
	str+=name;
	}

	System.out.println(str);
	}

}


//System.out.println("Enter the String :");
//str=sc.next();
//System.out.println("you have enter:" +str);
//if()