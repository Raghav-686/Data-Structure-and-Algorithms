package Array;

import java.util.Scanner;

public class MaxProduct
{
    public String product(int arr[])
    {
        int maxpro=0;
        String pair="";
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]*arr[j]>maxpro)
                {
                    maxpro=arr[i]*arr[j];
                     pair=Integer.toString(arr[i])+","+Integer.toString(arr[j]);
                }
            }
        }
        return pair;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        MaxProduct mp=new MaxProduct();
        int size;
        System.out.println("Enter the size of array");
        size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("enter the element");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        String result=mp.product(arr);
        System.out.println(result);
    }
}
