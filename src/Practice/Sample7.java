package Practice;

public class Sample7 {
	public static int sum(int no) {
		int sum = 0;
		while (no != 0) {
			int rem = no % 10;
			sum = sum + rem;
			no = no / 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		int no = 78;
		while (no > 9) {
			no = sum(no);
		}
		if(no==1||no==7) {
		System.out.println("Happy no");
		}
		else {
			System.out.println("Not");
		}

	}

}
