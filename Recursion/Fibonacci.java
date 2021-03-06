package Recursion;
public class Fibonacci
{
    static int fibonacci(int n)
    {
        if(n<0)
        {
            return 0;
        }  if(n==0 || n==1)
        {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args)
    {
        System.out.println(fibonacci(4));
        System.out.println(fibonacci(3));
        System.out.println(fibonacci(-2));
        System.out.println(fibonacci(1));
    }
}
