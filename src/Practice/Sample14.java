package Practice;

public class Sample14 {
	public static void main(String[] args) {
		int sum=0,no=18,n=no;
		while(no!=0) {
			int rem=no%10;
			sum=sum+rem;
			no=no/10;
		}
		if(n%sum==0) {
			System.out.println("h");
			
		}
		else {
			System.out.println("n");
		}
	}

}
