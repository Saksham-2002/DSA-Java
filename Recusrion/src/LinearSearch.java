
public class LinearSearch {

	public static void main(String[] args) {
		int nums[]= {2,4,6,8,3,9,45};
	    System.out.println(LinearSearch(nums, 7, 0));

	}
	
	public static int LinearSearch(int arr[], int target, int index)
	{
		if(index==arr.length)
		{
			return -1;
		}
		if(target==arr[index])
		{
			return index;
		}
		return LinearSearch(arr, target, index+1);
	}

}
