package Array;

import java.util.Scanner;

public class Permutation
{


    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int size;
        int size1;
        System.out.println("enter the size");
        size=sc.nextInt();
        System.out.println("enter the size1");
        size1=sc.nextInt();
        if(size!=size1)
        {
            System.out.println("not equal array");
            return;
        }
        int arr[]=new int[size];
        int arr1[]=new int[size1];
        int sum1=0;
        int sum2=0;
        int mul1=1;
        int mul2=1;
        System.out.println("enter the element of first array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
            sum1+=arr[i];
            mul1*=arr[i];
        }
        System.out.println("enter the element of second array");
        for(int i=0;i<arr1.length;i++)
        {
            arr1[i]=sc.nextInt();
            sum2+=arr1[i];
            mul2*=arr1[i];
        }

        if(sum1 == sum2 && mul1 == mul2)
        {
            System.out.println("permutation");
        }
        else
        {
            System.out.println("false");
        }
    }
}
