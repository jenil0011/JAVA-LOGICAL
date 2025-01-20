// program to swap numbers without using third variable
import java.util.*;

public class Program2 {
    public static void main(String[] args)
    {
        int a;
        int b;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Number 1:");
        a = sc.nextInt(); //10
        
        System.out.println("Number 2:");
        b = sc.nextInt(); //20

        a = a + b;  // =10+20 (a=30)
        b = a - b;  // =30-20 (b=10)
        a = a - b;  // =30-10 (a=20)
        
        System.out.println("num1 :"+a);
        System.out.println("num2 :"+b);
        
        sc.close();
    }
}
