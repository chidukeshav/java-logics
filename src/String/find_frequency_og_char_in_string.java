package String;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class find_frequency_og_char_in_string {
public static void main(String[] args) {
	String s="abaccdcc";
	Map<Character,Integer>map=new LinkedHashMap();
	for(char x:s.toCharArray()) {
		map.put(x , map.getOrDefault(x, 0)+1);
		
	}
	for(Entry<Character,Integer>y:map.entrySet()) {
		System.out.println(y.getKey()+" "+y.getValue());
	}
	
}
}
