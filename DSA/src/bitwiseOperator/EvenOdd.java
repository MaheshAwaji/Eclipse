package bitwiseOperator;

public class EvenOdd {
	public static void main(String[] args) {
		int n=11;
		System.out.println(isOdd(n));
		
	}

	public static boolean isOdd(int n) {
		
		return (n&1)==0;
	}

}
