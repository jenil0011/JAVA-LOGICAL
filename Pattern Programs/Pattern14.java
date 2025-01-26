/*
5 4 3 2 1
4 3 2 1
3 2 1
2 1
1 

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
