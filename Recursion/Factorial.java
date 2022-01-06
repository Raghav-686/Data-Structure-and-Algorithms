package Recursion;
public class Factorial
{
    static int factorial(int n)
    {
        if(n<0)
        {
            return 0;
        }
        else if(n==0)
        {
            return 1;
        }
        return n * factorial(n-1);
    }

    public static void main(String[] args)
    {
        System.out.println(factorial(-5));
        System.out.println(factorial(4));
        System.out.println(factorial(0));
        System.out.println(factorial(1));
    }
}



