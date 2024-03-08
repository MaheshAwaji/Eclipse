package recursion_3;

import java.util.ArrayList;

public class AllIndex {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,6,4,7};
		System.out.println(FindAllIndex(arr,4,0,new ArrayList<>()));
		
	}
	public static ArrayList<Integer> FindAllIndex(int[] arr,int target,int index,ArrayList<Integer> list)
	{
		if(index==arr.length) {
			return list;
		}
		if(target==arr[index]) {
			list.add(index);
		}
		return FindAllIndex(arr,target,index+1,list);
	}

}
