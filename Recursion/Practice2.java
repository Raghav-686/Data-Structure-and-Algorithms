package Recursion;
public class Practice2
{
    static void first()
    {
        second();
        System.out.println("first method");
    }
    static void second()
    {
        third();
        System.out.println("second method");
    }
    static void third()
    {
        fourth();
        System.out.println("third method");
    }
    static void fourth()
    {
        System.out.println("fourth method");
    }

    public static void main(String[] args)
    {
        first();
    }
}
