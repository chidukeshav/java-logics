package String;

import java.util.LinkedHashSet;
import java.util.Set;

public class remove_dupchar_frm_string {
	public static void main(String[] args) {
		String s="abacdbcd";
		char[]ch=s.toCharArray();
		Set s1=new LinkedHashSet();
		for(char x:ch) {
			s1.add(x);
		}
		System.out.println(s1);
	}

}
