package LinearSearch;
// given a 2D array  sum each colum and return  maximum of them ;
// for e.g: below given array  col 1: 7+5+6 =18 and col2 : 8+5+6=19;then return 19 as a ans
public class MaxWealth{
    public static void main(String[] args) {
        int arr[][] ={{7,5,9},{8,5,6}};
        int max = maximumWealth(arr);
        System.out.println("maximum wealth is "+ max);
    }
    public static int maximumWealth(int arr[][])
    {
        int max =Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {  int sum =0;
            
            for(int j=0;j<arr[i].length;j++)
            {
                sum =sum+arr[i][j];

            }
            if(sum>max)
            {
                max =sum;
            }
        }
        return max;
    }
}