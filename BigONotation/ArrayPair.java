package BigONotation;

import java.util.Scanner;

public class ArrayPair
{
    static  void arraypair(int arr[])
    {
        for(int i=0;i< arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                System.out.print(arr[i]+","+arr[j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        int arr2[]=new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr2.length;i++)
        {
           arr2[i]=sc.nextInt();
        }
        arraypair(arr2);
    }
}
