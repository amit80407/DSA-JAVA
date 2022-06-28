package BinarySearch;
 // find peak index in mountain array or find peak index only both are same
public class peakIndexInMountainArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,3,4,5,3,2};
		int peak =peakIndexInMountainArray( arr);
		System.out.println("peak index in mountain Array is "+peak);
		
		

	}
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
}

