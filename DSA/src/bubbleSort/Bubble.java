package bubbleSort;

import java.util.Arrays;
import java.util.Iterator;

public class Bubble {
	public static void main(String[] args) {
		int[] arr= {5,4,3,2};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void sort(int[] arr)
	{
		boolean swapped;
		for (int i = 0; i < arr.length; i++) {
			swapped=false;
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j]<arr[j-1]) {
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					swapped=true;
				}				
				
			}
//			if you didnt swap for particular element then the array is swapped then stop program
			if(!swapped) {
				break;
			}
		}
	}

}
