package Numbers;

public class Sum_each_ele_getting_single_digit {
	public static void main(String[] args) {
		int no=78;
		while(no>9) {
			no=Add(no);
		}
		System.out.println(no);
				
	}
	public static int Add(int no) {
	int sum=0;
	while(no!=0) {
		int rem=no%10;
		sum=sum+rem;
		no=no/10;
		
	}
	return sum;
	}
}
