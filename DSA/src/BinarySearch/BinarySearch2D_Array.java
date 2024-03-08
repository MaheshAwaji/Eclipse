package BinarySearch;

import java.util.Arrays;

public class BinarySearch2D_Array {
	public static void main(String[] args) {
		int[][] matrix= {
				{10,20,30,35},
				{15,25,37,40},
				{24,32,39,42},
				{29,34,41,45}
		};
		System.out.println(Arrays.toString(Search(matrix,45)));
		
	}
	public static int[] Search(int[][] matrix,int target)
	{
		int r=0;
		int c=matrix.length-1;
		while(r<=matrix.length && c>=0)
		{
			if(matrix[r][c]==target)
			{
				return new int[] {r,c};
			}
			if(matrix[r][c]>target)
			{
				c--;
			}
			if(matrix[r][c]<target)
			{
				r++;
			}
		}
		return new int[] {-1,-1};
	}

}
