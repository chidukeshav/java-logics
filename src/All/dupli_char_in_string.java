package All;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class dupli_char_in_string {
public static void main(String[] args) {
	String s="methodoverloading";
	Map<Character,Integer>map=new LinkedHashMap();
	for(char x:s.toCharArray()) {
		map.put(x , map.getOrDefault(x, 0)+1);
		
	}
	for(Entry<Character,Integer>y:map.entrySet()) {
		if(y.getValue()>1) {
			System.out.println(y.getKey());
		}
		
	}
	
}
}
