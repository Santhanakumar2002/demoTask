package demo;

import java.util.HashMap;

public class hashmaps {
public static void main(String[] args) {
	HashMap<String,String> statescities = new HashMap<String,String>();
	statescities.put("Tamilnadu","chennai");
	statescities.put("Karnataka", "bengluru");
	statescities.put("Kerala", "kochi");
	statescities.put("Andra", "hydrabad");
	statescities.put("Andra", "nvjfnjdn");
	for(String i:statescities.keySet())
	{
	System.out.println("key: "+ i + ", value: "+statescities.get(i));
	}
	}
}
