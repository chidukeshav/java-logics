package Practice;

public class Sample11 {
	public static void main(String[] args) {
		int no=121;
		int copy=no;
		int res=0;
		while(no!=0) {
			int rem=no%10;
			res=res*10+rem;
			no=no/10;
		}
		if(copy==res) {
			System.out.println("p");
		}
		else {
			System.out.println("Not");
		}
	}

}
