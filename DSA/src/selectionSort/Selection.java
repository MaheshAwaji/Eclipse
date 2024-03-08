package selectionSort;

import java.util.Arrays;
import java.util.Iterator;

public class Selection {
	public static void main(String[] args) {
		int[] arr= {1,4,3,2,6,5};
		Selection(arr);
		System.out.println(Arrays.toString(arr));
	}
	static void Selection(int[] array)
	{
		for (int i = 0; i < array.length; i++) {
			int last=array.length-i-1;
			int MaxIndex=getMaxIndex(array,0,last);
			
			swap(array,MaxIndex,last);
			
		}
	}
	static int getMaxIndex(int[] array, int start, int last) {
		int max=start;
		for (int i = start; i <= last; i++) {
			if (array[max]<array[i]) {
				max=i;								
			}
			
		}
		return max;
	}
	static void swap(int[] arr,int first,int second)
	{
		int temp=arr[first];
		arr[first]=arr[second];
		arr[second]=temp;
	}

}
