package Numbers;

public class Spy_no1 {
	public static void main(String[] args) {
		int no = 123;
		int Sum = 0;
		int pro = 1;
		while (no != 0) {
			int rem = no % 10;
			Sum = Sum + rem;
			pro = pro * rem;
			no = no / 10;
		}
		if (Sum == pro) {
			System.out.println("Spy No");
		} else {
			System.out.println("Not a Spy No");
		}

	}
}
