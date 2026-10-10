package Numbers;

public class Reverse {
	public static void main(String[] args) {
		int no = 1234;
		int res = 0;
		while (no != 0) {
			int rem = no % 10;
			res = (res * 10) + rem;
			no = no / 10;

		}
		System.out.println(res);

	}

}
