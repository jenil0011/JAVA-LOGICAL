/*
 print below patten 
      A  // n-i=  ex. 4-1 = 3. so,3 escape sequence will be leaved.
    A B     
  A B C
A B C D
 
here, declaration of ascii of a will be inside row loop, to iterate A in each row.
and increment will be in column loop to increment characters in each row.
*/
public class Pattern13 {
    public static void main(String[] args)
    {
        for(int i=1; i<=4; i++) // row loop
        {
            char a = 65;  // declaration of ascii of a.
            
            for(int j=1; j<= (4-i); j++) // escape sequence loop
            {
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++) // loop to print characters.
            {
                System.out.print( (char)a +"");
                a++;
            }
            System.out.println(" ");
        }
    }
}
