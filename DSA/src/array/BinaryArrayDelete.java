package array;

import java.util.Iterator;

public class BinaryArrayDelete {
	static int FindPosition(int[] arr,int start,int end,int t) {
		if(start>end) {
			return -1;
		}
		
		int mid =start+(end -start)/2;
		if(t==arr[mid]) {
			return mid;
		}
		if(t>arr[mid]) {
			return FindPosition(arr,mid+1,end,t);
		}else {
			return FindPosition(arr,start,mid-1,t);
		}
	}
	static int DeleteArray(int[] arr,int n,int t) {
		int pos=FindPosition(arr,0,n-1,t);
		
		if(pos==-1) {
			System.out.println("Element not present");
			return n;
		}
		
		for (int i = pos; i <n-1; i++) {
			arr[i]=arr[i+1];		
			
		}
		return n-1;
		
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,6,8,9,13,14};
		int n=arr.length;
		int target=13;
		
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
		
		n=DeleteArray(arr,n,target);
		
		
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");
			
		}
		
	}

}
