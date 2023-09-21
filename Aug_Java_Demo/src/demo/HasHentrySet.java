package demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HasHentrySet {
	public static void main(String[] args) {
		
		HashMap<Integer , String> linkedHashMap= new HashMap<Integer , String>();
		linkedHashMap.put(1, "Apple");
		linkedHashMap.put(2, "Watermelon");
		linkedHashMap.put(3, "Musk melon");
		linkedHashMap.put(4, "Chicku");
		linkedHashMap.remove(4);
		linkedHashMap.put(1, "blueberry");//if u duplicate to values in a map then it shows updated one :
		System.out.println("Hashmap :" + linkedHashMap + "\n");
		//returns a set view of the mapping contained in this map.
		 Set<Map.Entry<Integer , String>>entrySet= linkedHashMap.entrySet();
		 System.out.println("Entryset:"+ entrySet);//here we decleare the entrysetmethod ;
		 System.out.println("-------------");
		 System.out.println("key "+ "|" + " value");
		 System.out.println("-------------");
		
		 for(Map.Entry<Integer, String>Entry:entrySet) {
			 System.out.println(Entry.getKey()+" | "+Entry.getValue());
		 }
		 
		 }

}
