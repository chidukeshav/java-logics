package Numbers;

public class Disarium_Number {
	public static void main(String[] args) {
		int no=89,n=no,copy=no;
		int count=0,sum=0;
		while(no!=0) {
			count++;
			no=no/10;
		}
		while(n!=0) {
			int rem=n%10;
			sum+=Math.pow(rem,count);
			count--;
			n=n/10;
		}
		if(copy==sum) {
			System.out.println("Disarium No");
		}
		else {
			System.out.println("Not Disarium No");
		}
	}

}
