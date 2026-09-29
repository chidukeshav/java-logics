package Numbers;

public class palindrome {
	public static void main(String[] args) {
		int no=121;
		int res=0;
		int copy=no;
		while(no!=0) {
			int rem=no%10;
			rem=(rem*10)+rem;
			no=no/10;
		}
		if(copy==res) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
	}

}
