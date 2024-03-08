package recursion2;

public class PrintNNo {
	public static void main(String[] args) {
		Fun(5);
	}

	public static void Fun(int i) {
		if(i==0) {
			return;
		}
		Fun(i-1);
		System.out.println(i);
		
		
		
	}

}
