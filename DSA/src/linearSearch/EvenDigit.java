package linearSearch;

public class EvenDigit {
	public static void main(String[] args) {
		int[] arr= {1,23,345,3456,12,43,1,234,};
		System.out.println(FindNumber(arr));
	}
	public static int FindNumber(int[] arr)
	{
		int count=0;
		for(int row=0;row<arr.length;row++)
		{
			int NumebrOfDigits=Even(arr[row]);
			if(NumebrOfDigits%2==0)
			{
				count++;
			}
		}
		return count;
	}
	public static int Even(int arr)
	{
		int count=0;
	    while(arr>0)
	    {
	    	count++;
	    	arr=arr/10;
	    }
	    return count;
	}

}
