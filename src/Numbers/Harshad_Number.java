package Numbers;

public class Harshad_Number {
	public static void main(String[] args) {
		int no=18;
		int sum=0;
		int n=no;
		while(no!=0) {
			int rem=no%10;
			sum=sum+rem;
			no=no/10;
		}
		if(n%sum==0) {
			System.out.println("Harshad Number");
		}
		else {
			System.out.println("Not Harshard number");
		}
	}
}
