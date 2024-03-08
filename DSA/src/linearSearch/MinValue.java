package linearSearch;

public class MinValue {
	public static void main(String[] args) {
		int[] num= {23,4,2,5,23,43,12};
		System.out.println(Min(num));
	}
	static int Min(int[] num)
	{
		int ans=num[0];
		for(int i=1;i<num.length;i++)
		{
			if(num[i]<ans)
			{
				ans=num[i];
			}
		}
		return ans;
		
	}

}
