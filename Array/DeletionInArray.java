package Array;

import java.util.Scanner;

public class DeletionInArray
{
    int size;
    int arr[]=null;
    public void array()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        size=sc.nextInt();
        arr=new int[size];
        System.out.println("enter the element");
        for(int i=0;i<size;i++)
        {
            arr[i]= sc.nextInt();
        }
    }

    public void deletion(int deletevalueatindex)
    {
        try
        {
             arr[deletevalueatindex]= Integer.MIN_VALUE;
            System.out.println("Deleted Successfully");
            System.out.println(arr[deletevalueatindex]);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    public static void main(String[] args)
    {
        DeletionInArray da=new DeletionInArray();
        da.array();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the index you want to delete");
        int index=sc.nextInt();
        da.deletion(index);

    }
}
