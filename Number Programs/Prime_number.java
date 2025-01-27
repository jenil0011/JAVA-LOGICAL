// program to check whether given number is prime number or not perform it by making function

// prime number is a number which is divisible by only two numbers. (1) 1   and (2) number itself .

// so, in order to find prime number we need to consider remainder of a division operation with 1 and number itself with a given number.

// prime number must have two divisors 1st = number itself and 2nd = 1.

// so, we need to use count to check number of divisors.  // and in order to check count we need to iterate through all numbers.
import java.util.*;

public class Prime_number 
{
    
    public static void is_prime(int num)
    {     
        int count = 0;   
        
        for(int i=1; i<=num; i++)
        {
            // here, num % i will be come.
            if(num % i == 0)    // like ex=11.   11 % 1==0 true.  then count=1.
            {                               // 11 % 11 ==0 true.  then count=2.
                count++;
            }
        }
        
        if(count == 2)
        {
            System.out.println("Number is Prime: "+num);
        }
        else
        {
            System.out.println("Number is not prime: "+num);
        }
    
    }
    
    public static void main(String[] args)
    {
        int num;
        

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to check is it prime number or not");
        num = sc.nextInt();

        is_prime(num);

    }
}