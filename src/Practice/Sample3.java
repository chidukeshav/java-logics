package Practice;

public class Sample3 {
	public static boolean add(int no) {
		if (no <= 1) {
			return false;
		} else {
			for (int i = 2; i <= no / 2; i++) {
				if (no % 2 == 0) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[] a = { 1, 3, 4, 5, 6, 7, 8, 9, 11, 13 };
		int count = 0;
		for (int j = 0; j < a.length; j++) {
			if (!add(a[j])) {
				count++;

			}
		}
		System.out.println(count);
	}

}
