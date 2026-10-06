package All;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class find_frequency_word {
public static void main(String[] args) {
	String s="hi hello hi hi sharath";
	Map<String,Integer>map=new LinkedHashMap();
	
	for(String x:s.split(" ")) {
		map.put(x , map.getOrDefault(x, 0)+1);
		
	}
	for(Entry<String,Integer>y:map.entrySet()) {
		System.out.println(y.getKey()+" "+y.getValue());
	}
	
}
}
