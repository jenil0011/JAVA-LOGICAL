// Reverse Pyramid Pattern 
/*

i=rows and j=columns.

    j=1 j=2 j=3 j=4 j=5

i=1 * * * * *   // here 1st row prints 5 stars which is maximum of i=5.      
i=2 * * * *
i=3 * * *
i=4 * * 
i=5 *     // here 5th row prints only 1 star which is minimum of i . so loop will be written in reverse.

 */

import java.util.*; 

public class Pattern4 {
    public static void main(String[] args)
    {
        int n =0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter input:");
        n = sc.nextInt();

        for(int i=n; i>=1 ; i--) // row loop
        {
            for(int j=1 ; j<=i ; j++) // column loop
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
    
}
