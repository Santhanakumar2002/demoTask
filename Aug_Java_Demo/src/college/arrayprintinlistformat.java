package college;

import java.util.Arrays;
import java.util.Scanner;

public class arrayprintinlistformat {
	public static void main(simple[] args)
	{
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the element you want from user:");
		num=sc.nextInt();// to get how many elemets you want from user
		
		int[] array =new int[6];
		System.out.println(" eneter the number of elements :");
		for(int i=0;i<num;i++)
		{
			array[i]=sc.nextInt();
		}
		System.out.println("array elements are");
		for(int i=0;i<num;i++)
		{
			//System.out.print(array[i]+" ");
			//here array is object name ;(array to print list type )
		}
		System.out.println(Arrays.toString(array));
	}

}
