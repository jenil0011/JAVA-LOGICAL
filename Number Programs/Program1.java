// program to print sum of digits in a string by user input and count numbers in a string
import java.util.*;

public class Program1 {
    public static void main(String[] args)
    {
        int number;
        int sum = 0;
        int last_digit;
        int count = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string of digits:");
        number = sc.nextInt();

        if(number==0)
        {
            sum = 0;
            count = 0;
        }
        else
        {
        // here we have used while loop because iterarion of a loop is not fixed
        while(number>0)
        {
            // if number is 625 , last_digit = 5
            last_digit = number % 10;

            // now, need to add last_digit in a sum variable
            sum = sum + last_digit;

            // now, again we need to remove last_digt from number so, it cant get add again in counting
            number = number / 10;
            count++;
        }

        System.out.println("Sum is:"+sum);
        System.out.println("Number Count is:"+count);
        sc.close();
    }
}
}
