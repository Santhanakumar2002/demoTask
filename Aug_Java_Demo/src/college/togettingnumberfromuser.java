package college;

import java.util.Scanner;

public class togettingnumberfromuser {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter ther number");
		int num = sc.nextInt();
		if(num>0) {
		System.out.println("postive num");
		}
		else if(num<0) {
			System.out.println(" negative num ");
		}
		else {
			System.out.println("zero");
		}
	
		
	}

}
