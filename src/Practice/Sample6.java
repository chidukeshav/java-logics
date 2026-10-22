package Practice;

public class Sample6 {
	public static void main(String[] args) {
		int no = 123346;
		int pro = 1;
		while (no != 0) {

			int rem = no % 10;
			if (rem % 2 == 0) {
				pro = pro + rem;
				
			}
			no = no / 10;
		}
		System.out.println(pro);
	}

}
