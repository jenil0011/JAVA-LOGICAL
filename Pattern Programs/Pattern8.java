/*
A
B B
C C C
D D D D
E E E E E 
 */

public class Pattern8 {
    public static void main(String[] args)
    {
        int letter=65;  // here we need to declare ascii value of A outside loop just to not start every row with A.

        for(int i=1; i<=5 ; i++) //loop to print rows
        {
            for(int j=1; j<=i ; j++)
            {
                System.out.print( (char) letter+" ");
            }
            letter++; // here, we need to place increment operator with letter in a row loop to continuos print the same letter at each row 
            System.out.println(" ");
        }
    }    
}
