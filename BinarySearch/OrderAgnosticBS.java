package BinarySearch;
// orderAgnotsic Binary Search means order we does no either a ascending or decending order
public class OrderAgnosticBS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr= {-5,-1,4,5,7,9,11,14,55,}; //ascending order array 
		int[] arr= {19,14,13,11,6,5,4};
	    int target =11;
		int ans =binarySearch(arr,target);
		System.out.println(ans);

	}
	static int binarySearch(int[] arr,int target)
	{
		int start=0;
		int end =arr.length-1;
		 
		if(arr[0]< arr[end]) // means ascending orders
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
		
		}
		else // decending order
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
				else if(target< arr[mid])
				{ 
					start=mid+1;
				}
				else {
					end =mid-1;
				}
			}
			
			
		}
		
		return -1;
	}

}
