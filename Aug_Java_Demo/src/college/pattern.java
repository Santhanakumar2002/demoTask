package college;

public class pattern {
	
	public static void main(simple[] args) 
	{
//	int i,j,row=6;
//	for(i=0;i<row;i++) {
//	
//	for(j=2*(row-i);j>=0;j--)
//	{ 
//		System.out.print("");
//		
//		for(j=0;j<=i;j++) {
//			
//			System.out.print("* ");
//		}
//	
//		System.out.println();
//	}
//	}
		int i, j, row = 7;       
		//Outer loop work for rows  
		for (i=0; i<row; i++)   
		{  
		//inner loop work for space      
		for (j=2*(row-i); j>=0; j--)         
		{  
		//prints space between two stars      
		System.out.print(" ");   
		}   
		//inner loop for columns  
		for (j=0; j<=i; j++ )   
		{   
		//prints star      
		System.out.print("*");   
		}   
		//throws the cursor in a new line after printing each line  
		System.out.println();   
		}   
		System.out.println("");   

	}
}

