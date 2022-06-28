package LinearSearch;
// in the array find minimum number in the array ..
/*
 apporch : - make first element is mimimum and compare with all remaing  element in  the array 
            if (min> arr elememt )
            {
                then  min = arr element;
            }
 */
public class SearchingMinimumNumber {
    public static void main(String[] args) {
        int[] arr = {6,5,-7,2,4,1,5};
        int min = minimum(arr); 
        int index =searchIndex(arr ,min);
        System.out.println(" minimum element is "+ min+ " at present in the index "+index );
    }
    // finding minimum element in the array 
    public static int minimum(int arr[])
    {
        int min =arr[0];
        for(int i =1;i<arr.length;i++)
        {
            if(min>arr[i])
            {
                min =arr[i];
            }
        }
        return min ;
    }
    //findin minimum element index in the array
    public static int searchIndex(int arr[],int target)
    {
        for(int i =0;i<arr.length;i++)
        {
            if(target == arr[i])   
            {
                return i;
            }
        }
        return -1;
    }
}
