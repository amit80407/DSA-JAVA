package CyclicSort;
// given  an array for 0 to n  find missing number ;
//use cyclic sort for that beacause of it given 0 to n array 
// amazon question :: leetcode question 
import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int arr[]={5,0,2,1,4};

         int missing= sort(arr);// missing number 
         System.out.println(missing);
      
        System.out.println(Arrays.toString(arr)); // printing sorted array 

    }
    public static int sort(int arr[])
    {
        int i =0;
        while(i<arr.length)
        {
            int correct =arr[i];
            if( arr[i]< arr.length && arr[i]!= arr[correct])
            {
                swap(arr,i,correct);
            }
            else
            {
                i++;
            }
        }
        //search for first missing value in array
        for(int index=0;index<arr.length; index++)  
        {
            if(arr[index]!=index)
            {
                return index;
               
            }
           
        }
        // case 2
        
       return arr.length;
        
    }
    public static void swap(int arr[],int i,int correct)
    {
        int temp =arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
    }
    
}
