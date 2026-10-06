package All;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class frequency_no_in_array {
public static void main(String[] args) {
	int[] a= {1,2,3,4,1,3,3,4,5,6};
	Map<Integer,Integer>map=new LinkedHashMap();
	for(int x:a) {
		map.put(x , map.getOrDefault(x, 0)+1);
		
	}
	for(Entry<Integer,Integer>y:map.entrySet()) {
		System.out.println(y.getKey()+" "+y.getValue());
	}
	
}
}
