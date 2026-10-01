package String;

import java.util.LinkedHashSet;
import java.util.Set;

public class remove_dupword_frm_string {
public static void main(String[] args) {
	String s="Hi Hello hi  hi are you";
	String []s1=s.split(" ");
	Set<String>set=new LinkedHashSet();
	for(String x:s1) {
		set.add(x);
	}
	for(String y:set) {
		System.out.print(y+" ");
	}
}
}
