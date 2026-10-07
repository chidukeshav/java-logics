package All;

import java.util.Set;
import java.util.TreeSet;

public class Panagram {
	public static void main(String[] args) {
		String s="the quick brown fox jumps over the lazy dog";
		s=s.replaceAll(" ","");
		Set s1=new TreeSet();
		for(char x:s.toCharArray()) {
			s1.add(x);
		}
		if(s1.size()==26) {
			System.out.println("panagram");
		}
		else {
			System.out.println("Not panagram");
		}
	}

}
