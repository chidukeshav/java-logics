package Numbers;

public class Armstrong_Number {
	public static void main(String[] args) {
		int no = 153;
		int n = no;
		int copy = 0;
		int count = 0, sum = 0;
		while (no != 0) {
			count++;
			no = no / 10;
		}
		while (no != 0) {
			int rem = n / 10;
			sum += Math.pow(rem, count);
			n = n / 10;
		}
		if (copy == sum) {
			System.out.println("Armstrong No");
		} else {
			System.out.println("Not Armstrong");
		}
	}
}
