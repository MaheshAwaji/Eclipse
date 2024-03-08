package array;

public class ArrayDelete {
	public static int FindArray(int[] arr,int n,int t) {
		for (int i = 0; i <n; i++) {
			if(arr[i]==t) {
				return i;
			}
			
		}
		return -1;
		
	}
	
	public static int DeleteArray(int[] arr,int n,int t) {
		int pos=FindArray(arr,n,t);
		
		if(pos==-1) {
			System.out.println("Elememt not found");
			return n;
		}
		
		for (int i = pos; i < n-1; i++) 
			arr[i]=arr[i+1];
			
		
		return n-1;
	}
	public static void main(String[] args) {
		int[] arr= {1,2,4,3,5,8,6,7};
		int n=arr.length;
		int target=5;
		
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] +" ");
		}
		
		System.out.println(" ");
		n=DeleteArray(arr,n,target);
		
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] +" ");
			
			
		}
		
	}

}
