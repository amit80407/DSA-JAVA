package BinarySearch;
//search element in the infinite array 
// infinite array means length is not given
// amazon question

public class SearchElementINTheInfiniteArray {
	public static void main(String []args)
	{
		int[] arr  = {1,3,4,5,6,7,7,8,9,10,11,18,20}; //infinite array
		int target=6;
		int ans =findIndex(arr,target);
		System.out.println(ans);
		
	}
	public static int findIndex(int arr[],int target)
	{
		int start =0;
		int end =1;
		if(target> arr[end])
		{
			int temp =end+1;
			end =end+(end-start+1)*2;
			start =temp;
		}
		return binarySearch(arr,target,start,end);
		
	}
	public static int binarySearch(int[] arr,int target,int start,int end)
	{
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
