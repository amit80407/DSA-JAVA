// package CyclicSort;
// // find number which is no present in the array
// // it is not complate


// import java.util.ArrayList;
// import java.util.Arrays;

// public class RetrunAllMissingNumber {
//     public static void main(String[] args) {
//         int arr[]= {1,3,4,5,7,8};
//     int array [] =sort(arr);
//     System.out.println(Arrays.toString(array));
//     }
//     public static List<Integer> sort(int arr[])
//     {
        
//         int i=0;
//         while(i<arr.length)
//         {
//             int correct =arr[i]-1;
//             if(arr[i]!= arr[correct])
//             {
//                 swap(arr,i,correct);
//             }
//             else
//             {
//                 i++;
//             }
//           ArrayList<Integer> ans=new ArrayList<>();
//             for(int index =0;index<arr.length;index++)
//             {
//                 if(arr[index] !=index+1)
//                 {
//                    ans.add (index+1); 
//                 }

//             }
            
//         }
//         return ans;
//     }
//     public static void swap(int[] arr, int i, int correct)
//      {
//         int temp =arr[i];
//         arr[i]=arr[correct];
//         arr[correct]=temp;
//     }
// }
