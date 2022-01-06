package Recursion;
public class Power
{
    static int power(int n,int pw)
    {
        if(pw<0)
        {
            return 0;
        }
        if(pw==0)
        {
            return 1;
        }
        if(pw==1)
        {
            return n;
        }
      return n * power(n,pw-1);
    }

    public static void main(String[] args)
    {
        System.out.println(power(2,2));
        System.out.println(power(2,0));
        System.out.println(power(2,1));
    }
}
