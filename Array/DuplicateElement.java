package Array;

import java.util.Scanner;

public class DuplicateElement
{
    int size;
    int arr[]=null;
    public void array()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size");
        size=sc.nextInt();
        arr=new int[size];
        System.out.println("enter the element");
        for(int i=0;i<size;i++)
        {
           arr[i]=sc.nextInt();
        }
    }

    public void duplicate()
    {
        int j=0;
        for(int i=0;i<size-1;i++)
        {
            if(arr[i]!=arr[i+1])
            {
                arr[j]=arr[i];
                j++;
            }
        }
        arr[j]=arr[arr.length-1];
        for(int i=0;i<=j;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args)
    {
        DuplicateElement de=new DuplicateElement();
        de.array();
        de.duplicate();
    }
}
