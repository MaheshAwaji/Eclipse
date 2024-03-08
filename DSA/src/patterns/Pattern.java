package patterns;

public class Pattern {
	public static void main(String[] args) {
		Pattern1(4);
		System.out.println();
		Pattern2(4);
		System.out.println();
		Pattern3(4);
		System.out.println();
		Pattern4(5);
		System.out.println();
		Pattern5(5);
		System.out.println();
		Pattern6(10);
		
	}
	public static void Pattern1(int n) {
	     for (int row = 1; row<=n; row++) {
	    	 for (int col=1;col<=n; col++) {
	    		 System.out.print("* ");				
			}
	    	 System.out.println();			
		}
	}
	public static void Pattern2(int n) {
	     for (int row = 1; row<=n; row++) {
	    	 for (int col=1;col<=row; col++) {
	    		 System.out.print("* ");				
			}
	    	 System.out.println();			
		}
	}
	public static void Pattern3(int n) {
	     for (int row = 1; row<=n; row++) {
	    	 for (int col=1;col<=n-row+1; col++) {
	    		 System.out.print("* ");				
			}
	    	 System.out.println();			
		}
	}
	public static void Pattern4(int n) {
	     for (int row = 1; row<=2*n; row++) {
	    	int ColInRow=row>n?2*n-row:row;
	    	 for (int col=1;col<ColInRow; col++) {
	    		 System.out.print("* ");				
			}
	    	 System.out.println();			
		}
	}
	public static void Pattern5(int n) {
	     for (int row = 1; row<=2*n; row++) {
	    	int ColInRow=row>n?2*n-row:row;
	    	int SpacesInCol=n-ColInRow;
	    	for (int s = 0; s < SpacesInCol; s++) {
	    		System.out.print(" ");				
			}
	    	 for (int col=1;col<ColInRow; col++) {
	    		 System.out.print("* ");			
			}
	    	 System.out.println();			
		}
	}
	public static void Pattern6(int n) {
		for (int row = 1; row < n; row++) {
			for (int space = 0; space <n-row; space++) {
				System.out.print(" ");				
			}
			for (int col = row; col>=1; col--) {
				System.out.print("* ");
				
			}
//			for (int col =n; col <row; col++) {
//				System.out.print("* ");
//				
//			}
			System.out.println();
			
		}
		
	}

}
