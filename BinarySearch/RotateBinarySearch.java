package BinarySearch;

public class RotateBinarySearch {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int arr[]= { 3,4,5,0,1,2}; // this is rotated array
		int target =3;
		System.out.println(findPivot(arr));
		int search =search(arr,target);// searching target element 
		
		System.out.println(search);

	}
	//searching target element  and return element
	public static int search(int[] arr,int target)
	{
		int n=arr.length-1;
		int pivot =findPivot(arr);
		if(pivot==-1)
		{
			return binarySearch(arr,target,0,n); //if pivot is not availabel then   call binary search
			
		}
		if( arr[pivot]==target)  
		{
			return pivot;
		}
		if(target>=arr[0])  // if target >start then call binary search form 0 to pivot-1;
		{
			return binarySearch(arr,target,0,pivot-1);
		}
		else {  // else call binary search form pivot+1 to array length
			return binarySearch(arr,target,pivot+1,n);
		}
		
	}
	
	
	public static int findPivot(int arr[])
	{
		int start =0;
		int end =arr.length-1;
		while(start<=end)
		{
			int mid =start +(end-start)/2;
			if( mid<end && arr[mid] > arr[mid+1])
			{
				return mid;
			}
			if( mid>start && arr[mid] < arr[mid-1])
			{
				return mid-1;
			}
			if(arr[mid]<=arr[start])
			{
				end=mid-1;
			}
			else
			{
				start =mid+1;
			}
		}
		return -1;
	}
	static int binarySearch(int[] arr,int target,int start,int end)
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
