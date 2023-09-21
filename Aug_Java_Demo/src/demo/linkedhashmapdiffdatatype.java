package demo;

import java.util.LinkedHashMap;

public class linkedhashmapdiffdatatype {
	public static void main(String[] args) {
		LinkedHashMap<Integer,String> linkedHashMap = new LinkedHashMap<Integer,String>();
		System.out.println("linkedHashMap:" +linkedHashMap);
		boolean isEmpty=linkedHashMap.isEmpty();
		System.out.println("Isempty :"+ isEmpty +"/n");
		linkedHashMap.put(1,"apple");
		linkedHashMap.put(2,"orange");
		linkedHashMap.put(3, "grapes");
		
		System.out.println("linkedHashMap:" +linkedHashMap);
		isEmpty= linkedHashMap.isEmpty();
		System.out.println("Isempty :"+ isEmpty);
	}
 // in this programm we checking either our hashmap is empty or not by using boolean data type ;
}