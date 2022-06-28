package BinarySearch;

/*finding element in mountaion array
1. in this first find peak element
2. first search ascending order array
3. if in ascending array element is not present search in the decending array
*/


public class FindElementInMountaionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,3,4,5,3,2};
		int target = 4;
		int findElement=search(arr,target);
		System.out.println(findElement);
		
		

	}
	public static int search(int[] arr,int target)
	{
	
	int peak =peakIndexInMountainArray( arr);  // search peak element in the array
	int firsttry=binarySearch( arr,target,0,peak); // search element in ascendin array
	if(firsttry != -1)
	{
		return firsttry; //return elemet 
	}
	
	return binarySearch( arr,target,peak+1,arr.length-1); // search element in the decending order 
	}
	//here searching peak element in the array 
	public static int peakIndexInMountainArray(int[] arr) {
        int start =0;
        int end=arr.length -1;
        while(start<end) // here we are not check == to 
        {
         int mid =start +(end-start)/2;
            if(arr[mid]>arr[mid+1]) // I am in the decresing order
            {
                end =mid; //here not end=mid-1; beacuse of possible that mid is the answer
            }
            else
            {
                start =mid+1;
            }
        }
        return start;// here you return start as well as end 
        // when condintion is false then start and end point to one element which are maximum ;
        
 }
	// this is orderAgnostic mountain array 
	static int binarySearch(int[] arr,int target,int start,int end)
	{
		
		 
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
