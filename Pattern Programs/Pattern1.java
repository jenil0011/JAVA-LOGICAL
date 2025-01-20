// half pyramid pattern
/*

 * 
 * * 
 * * *
 * * * *
 * * * * *

 */

import java.util.*;
 
public class Pattern1 {

    public static void main(String[] args)
{
    
    int n=0;

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter input");
    n = sc.nextInt();

    for(int i=1; i<=n ; i++) // row loop
    {
        for(int j=1; j<=i ; j++) // column loop
        {
            System.out.print("* ");
        }
        System.out.println(" ");
    }
}

}
