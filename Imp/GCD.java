package Imp;
import java.util.*;
// Gcd means greatest common factor ..   two number ke factor karne ke bad  common hai aur bara hai
// 15 ka factor : 1,3,5  or 27 ka factor : 1,3,9 in both  3 is common so 3 is gcd   
// video link https://youtu.be/sLigMnetHkQ

public class GCD {
    public static void main (String args[])
    {
        
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter first numbe");
        int num1 =sc.nextInt();
        System.out.println("Enter second number ");
        int num2 =sc.nextInt();
        // int gcd =0;
        // for(int i=1;i<=num1 && i<=num2;i++)
        // {
        //     if(num1 % i==0 && num2 %i==0)
        //     {
        //         gcd =i;
        //     }
        // }
        // System.out.println("GCD of two number is "+ gcd);

        //  second approch   if a >b then (a-b ) and if b>a then (b-a)
        while(num1 !=num2)
        {
            if(num1> num2)
            {
                num1 =num1-num2;
            }
            else
            {
                num2 =num2-num1;
            }
        }
        System.out.println(" gcd "+ num2);




    }
    
}
 

