package CyclicSort;

import java.util.Arrays;

public class CodeOFCyclicSort {
    public static void main(String[] args) {
        int arr[]={3,5,2,1,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int arr[])
    {
        int i =0;
        while(i<arr.length)
        {
            int correct =arr[i]-1;
            if(arr[i]!= arr[correct])
            {
                swap(arr,i,correct);
            }
            else
            {
                i++;
            }
        }
    }
    public static void swap(int arr[],int i,int correct)
    {
        int temp =arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
    }
}
