package Array;

public class Two_DArray {
    public static void main(String[] args) {
        //int [][] arr = {{5,6,6,6},{7,8,9} ,{ 8,9,9,7}}; // this is jagged array
        int [][] arr ={{8,8,4},{4,4,5},{5,5,4}};// this is matrix array 
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
