package LinearSearch;
// leetcode question 

// in the given array find how many even digit number present in the array 
public class FindEvenDigits {
    public static void main(String[] args) {
        int arr[] = { 7887, 8, 8, 888, 8878, 88 };  // 3 even digit number present 
        int count = findNumber(arr);
        System.out.println(count);
       
    }

    
    public static int findNumber(int arr[])
    {
        int count=0;
        for (int num : arr)  /// this is foreach loop 
      // for(int i =0;i<arr.length;i++)  // you can also use for loop  only change in even() method
        {
            if(even(num))
            {
                count++;
            }
        }
        return count ;
    }
    // check even or odd 
    public static Boolean even(int num)
    {
        int numberOfDigit =countDigits(num);
        // if(numberOfDigit %2==0)
        // {
        //     return true;
        // }
        // return false;  
        /// ******   or we can write directly like that*****///
        return numberOfDigit %2==0; // it is only single line of code
        
    }
    // find number of digit  e.g: 7778  output 4
    public static int countDigits(int num)
    {  int count =0;
        while(num >0)
        {
            count++;
            num =num/10;
        }
        return count;
    }
    // you can also find number of digit in best way or directly find 
    // public static int countDigits(int num)
    // {
    //     return (int )(Math.log10(num))+1;
    // }

}
