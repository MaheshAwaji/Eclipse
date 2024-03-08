package linearSearch;

public class ArraySearch {
	public static void main(String[] args) {
		int[] num= {1,3,4,5,7,-2,3,4,12,13,23,45};
		int target=45;
		int ans=LinearSearch(num,target);
		System.out.println(ans);
	}
	static int LinearSearch(int[] num,int target) {
		if(num.length==0) {
			return -1;
		}
		for(int i=0;i<num.length;i++) {
			if(num[i]==target) {
				return i;
			}
		}
		return -1;
		
	}

}
