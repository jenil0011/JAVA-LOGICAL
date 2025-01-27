// program to check if given string is palindrome or not.

// 121 it's a palindrome number   like, 1st and last number should be same for palindrome number

// 122 it's not a palindrome number

import java.util.*;

public class Palindrome_number {
                                        //252
    public static void is_palindrome(int num)
    {
        int backup_num = num;   // backup_num = 252

        int reverse_num=0; 

        int last_digit=0;
        
        // here, number of iterations are not known that's why we have used while loop.
        
        while (num>0)      
        {
        last_digit = num % 10;    
        reverse_num = reverse_num * 10 + last_digit;
        num = num/10;   
        }
        
        // for while loop

        /*
        1 st iteration:
        252>0, yes

        0 = 252 % 10 ;   // 10/252 = 2(remainder) IS EXTRACTED FROM NUMBER
        last_digit = 2 now,

        0 = 0 * 10 + 2;  // 0 + 2 = 2
        reverse_num = 2 now,

        252 = 252/10;  // 10/252 = 2(remainder) is removed from number 
        num = 25 now, 
        */

        /*
        2nd iteration:
        25>0 yes,

        0 = 25 % 10 ; // 10/25 = 5 is EXTRACTED 
        last_digit = 5 now,  

        
        
        */
        if(backup_num == reverse_num)
        {
            System.out.println("Number is palindrome");
        }
        else
        {
            System.out.println("Number is not palindrome");
        }
    }
    
    public static void main(String[] args)
    {
        int num = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number to check: ");
        num = sc.nextInt();   // 252
        
                      //252
        is_palindrome(num);
    }    
}
