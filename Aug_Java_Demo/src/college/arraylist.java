package college;

import java.util.ArrayList;
import java.util.Collections;

public class arraylist {
public static void main(String[] args) 
{
	ArrayList<String> fruit = new ArrayList<String>();
	fruit.add("apple");
	fruit.add("orange");
	fruit.add("mango");
	fruit.add("jackfruit");
	fruit.add("papaya");
	Collections.sort(fruit);
//	for(int i=0;i<fruit.size();i++) 
	for (String i: fruit )
	{
		System.out.println(i);
	}
	
	
	
}
}

//fruit.clear();
	//fruit.remove(3); remove the element 
	//fruit.set(2, "water melon");//change an item 
	
	//System.out.println(fruit.get(3)); get the particular value(access an item )
	//System.out.println(fruit);list the fruit name 
