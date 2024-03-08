package linearSearch;

import java.util.Arrays;

public class SearchIn2DArray {
	public static void main(String[] args) {
		int[][] arr= {
				{1,3,4,5},{2,24,46,13},{23,90,87,65,122}
		};
		int target=90
				;
		int[] ans=Search(arr,target);
		System.out.println(Arrays.toString(ans));
		System.out.println(max(arr));
	}
	public static int[] Search(int[][] arr,int target) {
		for(int row=0;row<arr.length;row++)
		{
			for(int col=0;col<arr[row].length;col++)
			{
				if(arr[row][col]==target)
				{
					return new int[] {row,col};
				}
			}
		}
		return new int[] {-1,-1};
	}
	public static int max(int[][] arr) {
		int max=Integer.MIN_VALUE;
		for(int row=0;row<arr.length;row++)
		{
			for(int col=0;col<arr[row].length;col++)
			{
				if(arr[row][col]>max)
				{
					max=arr[row][col];
				}
			}
		}
		return max;
	}
	

}
