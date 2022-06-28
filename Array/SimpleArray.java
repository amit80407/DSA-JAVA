package Array;

import java.util.Arrays;

public class SimpleArray {
    public static void main (String args[])
    {
//        int arr [] = new int [6];
//        arr[0]=9;
//        arr[1]=0;
//        arr[2]=9;
//        arr[3]=0;
//        arr[4]=9;
//        arr[5]=0;
//        for(int i =0;i<arr.length;i++)
//        {
//            System.out.print( arr[i]+" ");
//        }
    	
    	//***** finding maximum number 
    	//int arr [] = {4,6,5,7,5};
    	
//    	Arrays.sort(arr);
//    	System.out.println(Arrays.toString(arr));
//    	System.out.println(arr[arr.length-1]);
    	
    	
//         Or you can  also find maixmum number   
    	
//    	int max=arr[0];
//    	for(int i=0;i<arr.length;i++)
//    	{
//    		if(max<arr[i])
//    		{
//    			max =arr[i];
//    		}
//    	}
//    	System.out.println(max);
    	// finding unique element in the given array
    	int[] arr ={1,2,2,5,5};
    	Arrays.sort(arr);
    	System.out.println(Arrays.toString(arr));
    	int ui=unique(arr);
    	System.out.println(ui);    	
    }
    public static int unique(int arr[])
    {
    	int n=arr.length;
    	int i =0;
    	while(i<n-1)
    	{
    	   if(arr[i]==arr[i+1])
    	   {
    		   i=i+2;
    	   }
    	   else {
    		   return arr[i];
    	   }
    	}
    	return arr[n-1];
    }
    
}
