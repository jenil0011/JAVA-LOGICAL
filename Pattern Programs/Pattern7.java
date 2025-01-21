/*
print below side pyramid pattern 

here , there will be 3 loops first for iteration, second for providing spacing and third for printing stars.

conside n(rows)=4  

      *  n-1(star)=3 means n-i=3 so, 3 spaces are there in 1st line
    * *  n-2(star)=2  so, 2 spaces are there in 2nd line
  * * *
* * * *  n-4=0  so, 0 spaces are there in last line 
  
 */

public class Pattern7 {
    public static void main(String[] args)
    {
        int n=4;
       for(int i=1; i<=n; i++)  // loop for iteration
       {
            for(int j=1; j<=n-i ; j++)  // loop for spacing and logic will be written in condition here.
            {
                System.out.print(" ");
            }

            for(int j=1; j<=i ; j++) // loop for printing stars
            {
                System.out.print("*");
            }
            System.out.println("");
       }
    }
}
