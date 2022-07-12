public class SortedArray {

	public static void main(String[] args) {
	  int nums[]= {2,4,6,8,10,12,14,16};
	  System.out.println(SortedArray(nums));

	}
	
	public static boolean SortedArray(int arr[])
	{
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i]<arr[i-1])
			{
				return false;
			}
		}
		return true;
	}

}
