package main;

import java.util.HashMap;

public class Map {
   private HashMap<String, String> hashMap = new HashMap<String, String>();
	
	public String hashAdd(String string, String string2) {
		return this.hashMap.put(string, string);
	}
}
