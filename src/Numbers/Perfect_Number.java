package Numbers;

public class Perfect_Number {
	public static void main(String[] args) {
		int no = 6;
		int Sum = 0;
		for (int i = 1; i < no / 10; i++) {
			if (no % i == 0) {
				Sum = Sum + i;
			}
		}
		if (Sum == 0) {
			System.out.println("Perfect No");
		} else {
			System.out.println("Not Perfect");
		}

	}

}
