/* print below pattern 

0 0 0 0 0 6
0 0 0 0 5
0 0 0 4
0 0 3
0 2
       // here, we need two loops 1 for row and 1 for column
 */

public class Pattern6 {
    public static void main(String[] args)
    {
        for(int i=5; i>=1 ; i--) // row loop
        {
            for(int j=1; j<=i ; j++) // column loop
            {
                System.out.print("0 ");
            }
            System.out.print((i+1)+"");
            System.out.println("");
        }
    }
}
