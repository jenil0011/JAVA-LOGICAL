/* 
// print below pattern
 * 
 * *
 * * *
 * * * *
*/

import java.util.*;

public class Progra4 {

    public static void main(String[] args)
    {
        int x = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Rotations:");
        x = sc.nextInt();

        for(int i=0; i<x ; i++)  // for column (outer loop)
        {
            for(int j=0 ; j<i ; j++)
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
    
}
