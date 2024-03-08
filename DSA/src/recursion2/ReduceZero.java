package recursion2;

public class ReduceZero {
	public static void main(String[] args) {
		System.out.println(step(14));
		
	}
	public static int step(int n) {
		return helper(n,0);
	}
	public static int helper(int n,int s) {
		if(n==0) {
			return s;
		}
		if(n%2==0) {
			return helper(n/2,s+1);
		}
		return helper(n-1,s+1);
	}

}
