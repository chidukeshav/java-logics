package Numbers;

public class Covert_int_to_binary {
	public static void main(String[] args) {
	int no=9;
	String res="";
	while(no!=0) {
		int rem=no%2;
		res=rem+res;
		no=no/2;
	}
	System.out.println(res);
	}

}
