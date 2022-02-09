package Array;

import java.util.Scanner;

public class Insertion1
{
    int arr[]=new int[20];
    int size;
    public void array()
    {
       Scanner sc=new Scanner(System.in);
        System.out.println("enter the size");
        size=sc.nextInt();
        System.out.println("enter the elements");
       for(int i=0;i<size;i++)
       {
           arr[i]= sc.nextInt();
       }
    }

    public void insert(int loc,int value)
    {
      try
      {
        for(int i=size;i>loc;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[loc]=value;
        System.out.println("element added successfully");
      }
      catch(ArrayIndexOutOfBoundsException e)
      {
          System.out.println(e);
      }
      for(int i=0;i<=size;i++)
      {
            System.out.print(arr[i]+" ");
      }
    }

    public static void main(String[] args)
    {
        Insertion1 ins=new Insertion1();
        ins.array();
        ins.insert(1,6);
    }
}
