/* perform below pattern with pyramid soultion

1
1 3 
1 3 5
1 3 5 7 
1 3 5 7 9
2 4 6 8 10
2 4 6 8
2 4 6
2 4 
2
        // we can divide this pattern in two portion like odd and even numbers.
        // we need to write seperate loops for both cases.
*/
public class Pattern5 {
    public static void main(String[] args)
    {
        // for odd numbers we have total 5 lines and they are in increasing order.
        for(int i=1 ; i<=5 ; i++) // row loop for odd numbers.
        {
            for(int j=1; j<=i ; j++) // column loop for odd numbers.
            {
                System.out.print((2*j)-1+" "); // (2*1)-1 = 1 , (2*2)-1 = 3, so,on
            } 
            System.out.println(" ");
        }

        // for even number we have total 5 lines and it's in decreasing order so row loop will be negative.

        for(int i=5; i>=1 ; i--) // row loop for even numbers
        {
            for(int j=1 ; j<=i ; j++) // column loop for even numbers
            {
                System.out.print(2*j+" "); // 2*1 = 2 , 2*2 = 4
            }   
            System.out.println(" ");
        }

    }
    
}
