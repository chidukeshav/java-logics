package Practice;

public class Sample15 {
	public static void main(String[] args) {
		int no = 135;
		int n = no;
		int copy = no;
		int count = 0, sum = 0;
		while (no != 0) {
			count++;
			no = no / 10;
		}
		while (n != 0) {
			int rem = n % 10;
			sum = sum + (int) Math.pow(rem, count);
			count--;
			n = n / 10;

		}
		if(sum==copy) {
			System.out.println("A");
		}
		else {
			System.out.println("n");
		}
	}

}
