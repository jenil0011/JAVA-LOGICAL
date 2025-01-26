/*
 1 2 3 4 5
 2 3 4 5
 3 4 5
 4 5
 5

 */
public class Pattern14 {
    public static void main(String[] args)
    {

        for(int i=1; i<=5; i++) //loop to print row
        {
            for(int j=i; j<=5; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    }
}
