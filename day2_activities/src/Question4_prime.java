import java.util.Scanner;

public class Question4_prime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter number: ");

        int input = s.nextInt();

        boolean isPrime = true;

        for(int i = 2;i < input;i++)
        {
            if(input%i == 0)
            {
                isPrime = false;
                break;
            }
        }
        System.out.print("The number " + input +" is Prime:"+ isPrime);
    }
}
