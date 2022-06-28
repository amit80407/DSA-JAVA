package Array;

public class MinimumAndMaximum {
    public static void main(String args[])
    {
        int arr []={5,4,8,6,1,9};
        int min =arr[0];
        int max =arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(min >arr[i])
            {
                min =arr[i];
            }
            if(max<arr[i])
            {
                max =arr[i];
            }
        }
       
        System.out.println("minimum "+min);
        System.out.println("minimum "+max);

        }
        
    }

