package BinarySearch;

public class Ceiling {
//	ceiling of number -smallest no. in array greater than or equal to target element 
		public static void main(String[] args) {
			int[] arr= {1,2,14,15,20,25,30};
			int target=29;
			int ans=ceiling(arr,target);
			System.out.println(ans);
			
		}
		static public int ceiling(int[] arr,int target) {
//			what if the target element is greater than the greatest no. inside the array elements
			if(target>(arr[arr.length-1])) {
				return -1;
			}
			int start=0;
			int end=arr.length-1;
			while(start<=end) {
				int mid=start+(end-start)/2;
				if(target<arr[mid]) {
					end=mid-1;
				}
				else if(target>arr[mid]) {
					start=mid+1;
				}
				else {
					return mid;
				}
			}
			return start;
		
		
	}

}
