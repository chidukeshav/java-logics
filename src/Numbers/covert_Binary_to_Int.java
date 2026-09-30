package Numbers;

public class covert_Binary_to_Int {
	public static void main(String[] args) {
		String no="1010";
		int res=0;
		for(int i=0;i<no.length();i++) {
			res=(res*2)+(no.charAt(i)-'0');
		}
		System.out.println(res);	
	}
}
