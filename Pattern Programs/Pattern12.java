/*
5 4 3 2 1
5 4 3 2
5 4 3
5 4 
5
// each row is starting with 5. so, we need to declare 5 inside row loop.
// and need to use decrement operator inside column loop.

// patten is in decreasing order so use for loop according to decerement operator
 
*/
public class Pattern12 {
    public static void main(String[] args)
    {
        for(int i=5; i>=1; i--) // row loop
        {
            int a = 5; // declaration of variable 5.

            for(int j=1; j<=i; j++)
            {
                System.out.print(a+" ");
                a--;  // decrementing value each by each.
            }
            System.out.println("");
        }
    }
    
}
