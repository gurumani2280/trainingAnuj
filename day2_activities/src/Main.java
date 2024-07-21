import java.math.*;

// Java Excerise 0

public class Main {
    public static void main(String[] args) {

        int i;
        // 1
        System.out.println("\nPrint numbers from 1 to 20");
        for( i = 1; i <= 20; i++)
        {
            System.out.print(i + "\t");
        }
        // 2
        System.out.println("\nPrint even numbers till 20");
        for( i = 1; i <= 20; i++)
        {
            if(i % 2 == 0)
            {
                System.out.print(i + "\t");

            }
        }
        // 3
        System.out.println("\nPrint odd numbers till 20");
        for( i = 1; i <= 20; i++)
        {
            if(i % 2 != 0)
            {
                System.out.print(i + "\t");

            }
        }
        // 4

        // 5
        System.out.println("\nPrint the sum of numbers from 1 to 20 ");
        int j = 0;
        for( i = 1; i <= 20; i++)
        {
            j += i;
        }
        System.out.print(j + "\t");







    }
}