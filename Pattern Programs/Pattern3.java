/* 
* * * * 
* * * * 
* * * * 
* * * * 
*/ 

import java.util.*;

public class Pattern3
{
    public static void main(String[] args)
    {
        int x = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Pattern Length");
        x = sc.nextInt();

        for(int i=0; i<x ; i++)  // for column
        {
            for(int j=0; j<=x; j++) // for row
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

}