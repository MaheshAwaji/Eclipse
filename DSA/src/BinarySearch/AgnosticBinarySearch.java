package BinarySearch;

public class AgnosticBinarySearch {
	
	public static void main(String[] args) {
//		int[] arr= {90,80,70,60,50,40,30,20,10};
		int[] arr= {2,3,5,6,7,8,9,3,90};
		int target=8;
		int ans=Agnostic(arr,target);
		System.out.println(ans);
		
	}
	static int Agnostic(int[] arr,int target) {
		int start=0;
		int end=arr.length-1;
		
		boolean isAsc;
		if(arr[start]<arr[end]) {
			isAsc=true;
		}
		else {
			isAsc=false;
		}
//		boolean isAsc =arr[start]<arr[end];
		
		while(start<=end) {
			int mid=start+(end-start)/2;
			
			if(arr[mid]==target) {
				return mid;
			}
			
			if(isAsc) {
				if(target<arr[mid]) {
					end=mid-1;
				}
				else if(target>arr[mid]) {
					start=mid+1;
				}
				
			}else {
				if(target<arr[mid]) {
					start=mid+1;
				}
				else if(target>arr[mid]) {
					end=mid-1;
				}
			}
			
			
		}
		return -1;
	}

}
