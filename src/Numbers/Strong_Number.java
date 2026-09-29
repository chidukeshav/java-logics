package Numbers;

public class Strong_Number {
	static int factorial(int no) {
		int fact=1;
		for(int i=no;i>=1;i--) {
			fact=fact*i;
		}
		return fact;
	}
public static void main(String[] args) {
	int no=145,sum=0,copy=no;
	while(no!=0) {
		int rem=no%10;
		sum=sum+factorial(rem);
		no=no/10;
	}
	if(copy==sum) {
		System.out.println("Strong Number");
	}
	else {
		System.out.println("Not Strong");
		}
	}
}
