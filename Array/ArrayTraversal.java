package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTraversal
{
    int size;
    int arr[]=null;
    public void array()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        size=sc.nextInt();
        arr=new int[size];
        System.out.println("enter the elements");
        for(int i=0;i<size;i++)
        {
            arr[i]= sc.nextInt();
        }
    }

    public void traversal()
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args)
    {
        ArrayTraversal at=new ArrayTraversal();
        at.array();
        at.traversal();
    }
}
