package Numbers;

public class Sum_of_sqr_no_till_getting_single_dig {
	public static int add(int no) {
		int sum = 0;
		while (no != 0) {
			int rem = no % 10;
			sum = sum + (rem * rem);
			no = no / 10;

		}
		return sum;
	}

	public static void main(String[] args) {
		int no = 1234;
		while (no > 9) {
			no = add(no);
		}
		System.out.println(no);
	}

}
