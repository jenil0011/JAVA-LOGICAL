/*
print below pattern using decrement operation

1 2 3 4 5
1 2 3 4
1 2 3
1 2
1

// here 1 comes in every row so, declaration of 1 will be inside the row loop.
// and increment will be inside column loop.

 */
public class Pattern11 {

    public static void main(String[] args)
    {
        for(int i=5; i>=1 ; i--) // row loop
        {
            int a = 1;  // declaration of 1.

            for(int j=1; j<=i; j++) // column loop
            {
                System.out.print(a+" ");
               // a++; //it will increment value of a in each iteration.
            }
            
            System.out.println("");
        }
    }
    
}
