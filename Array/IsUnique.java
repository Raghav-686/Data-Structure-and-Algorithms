package Array;

import java.util.Scanner;

public class IsUnique
{
    public boolean unique(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    return false;
                }
            }
        }
        return true;
    }


    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        IsUnique iu=new IsUnique();
        int size;
        System.out.println("Enter the size of array.");
        size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("enter the element");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(iu.unique(arr));

    }
}
