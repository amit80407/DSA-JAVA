package BinarySearch;

public class SimpleBinarySearch {
	public static void main(String[]args)
	{
		int[] arr= {-5,-1,4,5,7,9,11,14,55};
		int target =11;
		int ans =binarySearch(arr,target);
		System.out.println(ans);
	}
	 static int binarySearch(int[] arr,int target)
	{
		int start=0;
		int end =arr.length-1;
		
		while(start<=end)
		{
			//finding mid we can finding mid two way 
			//first ways
			//int mid = (start+end)/2;
			//second way 
	   		int mid =start +(end-start)/2;
			//checking condition 
			if(target==arr[mid])
			{
				return mid;
			}
			else if(target> arr[mid])
			{ 
				start=mid+1;
			}
			else {
				end =mid-1;
			}
				
		}
		return -1;
	}
	

}
