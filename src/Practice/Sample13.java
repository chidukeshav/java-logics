package Practice;

public class Sample13 {
	public static void main(String[] args) {
		int no = 123;
		int sum = 0;
		int pro = 1;
		while (no != 0) {
			int rem = no % 10;
			sum = sum + rem;
			pro = pro * rem;
			no = no / 10;

		}
		if (sum == pro) {
			System.out.println("Spy");
		} else {
			System.out.println("n");
		}
	}

}
