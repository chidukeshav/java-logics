package Numbers;

public class Factorial_return_parameter {
	static int add(int no) {
		int fact = 1;
		for (int i = no; i >= 1; i--) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {
		System.out.println(add(5));
	}

}
