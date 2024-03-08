package BinarySearch;

public class Floor {
//	greates number in array which is the smaller than or equal to target element
	public static void main(String[] args) {
		int[] arr= {5,6,8,9,11,15};
		int target=8 ;
		int ans=floor(arr,target);
		System.out.println(ans);
		
	}
	static public int floor(int[] arr,int target) {
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
		return end;
	}

}
