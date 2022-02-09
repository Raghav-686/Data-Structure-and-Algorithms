package Array;

import java.util.Scanner;

public class OddPoduct
{
    Scanner sc=new Scanner(System.in);
    int size;
    int arr[]=null;
    public void array()
    {
        System.out.println("enter the size");
        size=sc.nextInt();
        arr=new int[size];
        System.out.println("enter the element");
        for(int i=0;i<size;i++)
        {
            arr[i]= sc.nextInt();
        }
    }

    public void odd()
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                int n=arr[i]*arr[j];
                if(n%2!=0)
                {
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
    }


    public static void main(String[] args)
    {
        OddPoduct op=new OddPoduct();
        op.array();
        op.odd();
    }
}
