/*
1
1 2
1 2 3 
1 2 3 4
1 2 3 4 5
 */

public class Pattern10 {
    public static void main(String[] args)
    {
        

        for(int i=1; i<=5; i++) // loop to print rows
        {
            int a = 1;   // here, declaration of 1 will be inside the row loop because every line is starting with 1 only.

            for(int j=1; j<=i; j++) // loop to print columns
            {
                System.out.print(a+" ");
                a++;       // this will increment the value of variable a. like from 1 to 2.
            }   
            System.out.println("");
        }
    }
}
