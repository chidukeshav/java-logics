package Practice;

public class Sample {
	public static void main(String[] args) {
		int no = 8;
		boolean flag = true;
		if (no <= 1) {
			flag = false;
		} else {
			for (int i = 2; i < no / 2; i++) {
				if (no % i == 0) {
					flag = false;
				}
			}
		}
		if (flag) {
			System.out.println("prime");
		} else {
			System.out.println("not");
		}
	}

}
