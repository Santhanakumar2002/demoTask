package demo;

import java.util.LinkedHashMap;

public class linkedHashMapSize {
	public static void main(String[] args) {
		LinkedHashMap<Integer,String> linkedHashMap= new LinkedHashMap<Integer,String>();
		linkedHashMap.put(1,"sandy");
		linkedHashMap.put(2, "ranjith");
		linkedHashMap.put(3,"john");
		System.out.println("LinkedHashMap:"+ linkedHashMap +"\n" );
//		int size=linkedHashMap.size();// here we count the size of the hashmap 
//		System.out.println("Size: "+size);
	}

}
