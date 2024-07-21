public class ex_2 {

    // 1
    //Enter 3 numbers from the user & make a function to print their average.
    public static double calculateAverage(int num1, int num2, int num3) {
        double ans = (num1 + num2 + num3) / 3.0;
        return ans;
    }

    //2
    //Write a function to print the sum of all odd numbers from 1 to n
    public static double oddNumberSum(int n) {
        int sum = 0;
        for(int i = 0; i <= n; i++)
        {
            if (i % 2 == 1 )
            {
                sum += i;
            }
        }
        return sum;
    }

    //3
    //Write a function which takes in 2 numbers and returns the greater of those two.
    public static double greaterNumber(int num1, int num2)
    {
        if (num1 > num2)
        {
           return num1;
        }
        else
        {
            return num2;
        }
    }

    //4
    //Write a function that takes in the radius as input and returns the circumference of a circle.
    public static double areaCircle(int rad)
    {
        return rad * Math.PI * 2;
    }

    //5
    /*Write a function that takes in age as input and returns if that person is eligible to
     vote or not. A person of age > 18 is eligible to vote.
     */
    public static boolean canVote(int age)
    {
        return age >= 18;

    }
    //6
    //Write an infinite loop using do while condition.
    public static void InfiniteLoop()
    {
        int i = 9;
        while(i > 8)
        {
            System.out.print(i);
        }
    }
    //7
    /*Write a program to enter the numbers till the user wants and at the end
    it should display the count of positive, negative and zeros entered.*/



    public static void main(String[] args) {



    }
}
