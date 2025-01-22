/*
A
A B
A B C
A B C D
A B C D E 

*/

public class Pattern9 {
    public static void main(String[] args)
    {
        
        for(int i=1; i<=5 ; i++)  // loop for row
        {
            int letter = 65;  // here, we need to declare ascii value A inside the loop to start every row with A.

            for(int j=1; j<=i ; j++) // loop for column
            {
                System.out.print((char)letter+" ");
                letter++;  // and, we need to increment letter's value inside the column loop to print different characters on same line.      
            }
            System.out.println(" ");
        }
    }
    
}
