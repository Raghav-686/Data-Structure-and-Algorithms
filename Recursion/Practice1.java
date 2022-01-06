package Recursion;
public class Practice1
{
    static void recursive(int n)
    {
        if(n<1)
        {
            System.out.println("n is less than 1");
        }
        else
        {
            recursive(n-1);
            System.out.println(n);
        }
    }


    public static void main(String[] args)
    {
        recursive(4);
    }
}
