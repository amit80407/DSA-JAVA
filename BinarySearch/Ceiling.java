package BinarySearch;

// Ceiling means = smaller number greatets or = target 
// ceiling =>target

public class Ceiling {
	public static void main(String[]args)
	{
		int[] arr= {2,3,5,9,16,18}; // here the ceiling number is 16
		int target =15;
		int ans =binarySearch(arr,target);
		System.out.println(ans);
	}
	// return the index of smallest no >= target
	 static int binarySearch(int[] arr,int target)
	{
		 // but what if the target is the greater then the greatest number in the array
		 
		int start=0;
		int end =arr.length-1;
		 if(target>arr[end])
		 {
			 return -1;
		 }
		while(start<=end)
		{
			
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
		return start;
	}
 

}
