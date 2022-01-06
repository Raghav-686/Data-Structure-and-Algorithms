package Recursion;
public class GCD
{
    static int gcd(int n,int m)
    {
        if(n<0 || m<0)
        {
            return -1;
        }
        if(m==0)
        {
            return n;
        }
        return gcd(m,n%m);
    }

    public static void main(String[] args)
    {
        System.out.println(gcd(6,4));
        System.out.println(gcd(2,3));
        System.out.println(gcd(0,1));
    }
}
