package Practice;

public class Sample2 {
	public static boolean add(int no) {
		boolean f = true;
		if (no <= 1) {
			return false;

		} else {
			for (int i = 2; i < no / 2; i++) {
				if (no % i == 0) {
					return false;
					

				}

			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 4, 5, 6, 8, 7, 11, 23 };
		for (int j = 0; j < a.length; j++) {
			if (add(a[j])) {
				System.out.println(a[j]);
			}
		}

	}
}
