// program to print sum of digits in a string by user input
import java.util.*;

public class Program1 {
    public static void main(String[] args)
    {
        int number;
        int sum = 0;
        int last_digit;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string of digits:");
        number = sc.nextInt();

        // here we have used while loop because iterarion of a loop is not fixed
        while(number>0)
        {
            // if number is 625 , last_digit = 5
            last_digit = number % 10;

            // now, need to add last_digit in a sum variable
            sum = sum + last_digit;

            // now, again we need to remove last_digt from number so, it cant get add again in counting
            number = number / 10;
        }

        System.out.println("Sum is:"+sum);
        sc.close();
    }
}
