package LinearSearch;
// find wether 12 present in the arry or not if present then return the index ..
public class SearchElement {
    public static void main(String[] args) {
        int arr[] ={8,5,3,5,3,6,12,1};
        int target =12;
        System.out.println("element present index "+search(arr,target));
       
    }
    public static int search(int arr[],int target)
    {
        if(arr.length==0)
        {
            return -1;
        }
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i]== target)
            {
                return i;
            }
            
        }
        return -1;
    }
}
