package bitwiseOperator;

public class Unique {
	public static void main(String[] args) {
		int[] arr= {2,2,3,4,3,4,1,7,1};
		System.out.println(Unique(arr));
	}

	private static int Unique(int[] arr) {
		int unique=0;
		for (int i = 0; i < arr.length; i++) {
			unique ^=arr[i];
			
		}
		
		return unique;
	}

}
