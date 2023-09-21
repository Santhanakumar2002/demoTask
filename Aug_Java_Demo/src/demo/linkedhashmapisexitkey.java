package demo;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class linkedhashmapisexitkey {
	public static void main(String[] args) {
		LinkedHashMap<Integer,String> linkedHashMap= new LinkedHashMap<Integer,String>();
		
		linkedHashMap.put(1,"apple");
		linkedHashMap.put(2,"orange");
		linkedHashMap.put(3, "grapes");
		Collection<String> collection=linkedHashMap.values();
		System.out.println("LinkedHashMap:"+ linkedHashMap);
		
		for(Iterator<String> itreator=collection.iterator();itreator
				.hasNext();)
		{
			
			String value= itreator.next();
		
			System.out.println( value);
		}
	
		}
		
		
		
	}

//{
// here we removing all value from linkedHashMap
//		Set<Integer> set=linkedHashMap.keySet();
//		System.out.println("Set:"+set);
//		for(Integer  key : set) {
//			System.out.println(key);
//			System.out.println(set);
//   }
//	{
//	here we removing the key from linkedHashmap
//	String value= linkedHashMap.remove(2);
//	System.out.println("\nvalue:"+value);
//	System.out.println("LinkedHashMap:"+ linkedHashMap );
//  }
	
//	{
//	here we get the value from linkedhashmap if i pass the value, i will get the relatable string value
//	String value= linkedHashMap.get(2);
//	System.out.println(" Value of 2 is:"+ value);
//	 value= linkedHashMap.get(3);
//	System.out.println(" Value of 3 is:"+ value);
//	 value= linkedHashMap.get(10);
//	System.out.println(" Value of 10 is:"+ value);
//	{
//boolean isValueExit=linkedHashMap.containsValue("apple");
//	System.out.println("isKey 'apple' Exit: " +isValueExit);
//	 isValueExit=linkedHashMap.containsValue("mango");
//	System.out.println("isKey 'mango ' Exit: " + isValueExit);
//   }
	
// {
//here we i call the value so i used containskey, if i using to call character i need to write contains
//	boolean isKeyExit=linkedHashMap.containsKey(1);
//	System.out.println("isKey '1' Exit: " +isKeyExit);
//	 isKeyExit=linkedHashMap.containsKey(10);
//	System.out.println("isKey '10 ' Exit: " + isKeyExit);
// }
	
