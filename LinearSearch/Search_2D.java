package LinearSearch;
// searching element in 2D array 

import java.lang.annotation.Target;
import java.util.Arrays;

public class Search_2D {
    public static void main(String[] args) {
    //     int[][] arr =  {{8,4,9,5},
    //                     {8,5,9},
    //                     {4,7,8,6,4}};
       
    //   int target =6;
    //   int ans[] =search(arr,target);   // in this return arrys not simple element
    //   System.out.println(Arrays.toString(ans)); // Arrays.toStirng() mehtod print the array
                        
    
    // }
    // public static int[] search(int[][] arr ,int target)  
    // {
    //     for(int i =0;i<arr.length;i++)
    //     {
    //         for(int j=0;j<arr[i].length;j++)
    //         {
    //             if(arr[i][j]==target)
    //             {
    //                 return new int[]{i,j}; // here creatin new array beacuse we have to return array 
    //             }
    //         }
    //     }
    //     return new int[]{-1,-1};  // here creatin new array beacuse we have to return array

    /* ******* finding  maximum in 2D array  ******
             
    */
    int arr [][]={ {7,5,8,4},{8,8,84,8}};
    int ans = max(arr);
    System.out.println(ans+"  this is the maximum element in the array");

    }
    public static int max(int[][] arr)
    {
        int max =arr[0][0];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j]> max )
                {
                    max= arr[i][j];
                }
            }
        }
        return max;

    }
}
