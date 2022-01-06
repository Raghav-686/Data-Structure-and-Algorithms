package Recursion;
public class DecimalToBinary
{
    static int number(int n)
    {
        if(n<0)
        {
            return -1;
        }
        if(n==0)
        {
            return 0;
        }
        return n%2 + 10*number(n/2);
    }

    public static void main(String[] args)
    {
        System.out.println(number(10));
        System.out.println(number(3));
        System.out.println(number(111));
    }
}
