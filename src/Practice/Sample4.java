package Practice;

public class Sample4 {
	public static void main(String[] args) {
		int fib1=0,fib2=1,fib3=0;
		int range=10;
		System.out.println(fib1+" "+fib2);
		for(int i=2;i<=range;i++) {
			fib3=fib1+fib2;
			System.out.println(fib3);
			fib1=fib2;
			fib2=fib3;
		}
	}

}
