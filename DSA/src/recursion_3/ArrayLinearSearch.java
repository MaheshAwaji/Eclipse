package recursion_3;

public class ArrayLinearSearch {
	public static void main(String[] args) {
		int[] arr= {1,3,2,4,5,5,8,9};
		System.out.println(search(arr,4,0));
		System.out.println(searchIndex(arr, 5, 0));
		System.out.println(searchIndexLast(arr, 5, arr.length-1));
		
	}
	public static boolean search(int[] arr,int target,int index) {
		if(index==arr.length) {
			return false;
		}
		return arr[index]==target || search(arr,target,index+1);
	}
	public static int searchIndex(int[] arr,int target,int index) {
		if(index==arr.length) {
			return -1;
		}
		if(arr[index]==target) {
			return index;
		}else {
			return searchIndex(arr,target,index+1);
		}
		
	}
	public static int searchIndexLast(int[] arr,int target,int index) {
		if(index== -1) {
			return -1;
		}
		if(arr[index]==target) {
			return index;
		}else {
			return searchIndexLast(arr,target,index-1);
		}
		
	}

}
