package Array;

public class ReverseArray {
    public static void main (String args[])
    {
         
        int arr [] ={3,3,4,5,5,6};
        System.out.println("before reversed");
        for(int i =0;i<arr.length;i++)
        {
            System.out.print(arr[i] +" ");

        }
        int lb =0;

        int ub =(arr.length)-1;
        int temp;
       
        while(lb<ub)
        {
            temp =arr[lb];
            arr[lb]= arr[ub];
            arr[ub]=temp;
            lb++;
            ub--;


        }
        System.out.println();
    System.out.println(" now array is reversed");
    for(int i =0;i<arr.length;i++)
    {
        System.out.print(arr[i] +" ");
    }
    }
}
