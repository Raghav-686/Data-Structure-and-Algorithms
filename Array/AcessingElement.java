package Array;

import java.util.Scanner;

public class AcessingElement
{
    int size;
    int arr[]=null;
    public void array()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size");
        size=sc.nextInt();
        arr=new int[size];
        System.out.println("enter the elements");
        for(int i=0;i<size;i++)
        {
            arr[i]= sc.nextInt();
        }
    }

    public void access()
    {
        System.out.println("first element is "+arr[0]);
        System.out.println("second element is "+arr[1]);
        System.out.println("last element is "+arr[size-1]);
        try
        {
            System.out.println("exception"+arr[size]);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    public static void main(String[] args)
    {
        AcessingElement ae=new AcessingElement();
        ae.array();
        ae.access();
    }
}
