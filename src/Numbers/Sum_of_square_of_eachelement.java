package Numbers;

public class Sum_of_square_of_eachelement {
	public static void main(String[] args) {
		int no = 12364;
		int sum = 0;
		while (no != 0) {
			int rem = no % 10;
			sum = sum + (rem + rem);
			no = no / 10;
		}
		System.out.println(sum);

	}

}
