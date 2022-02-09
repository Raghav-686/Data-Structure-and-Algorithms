package Array;

import java.util.Scanner;

public class DuplicateFound
{
    Scanner sc=new Scanner(System.in);
    int len;
    int arr[]=null;
    public void array()
    {
        System.out.println("enter the size");
        len=sc.nextInt();
        arr=new int[len];
        System.out.println("enter the element");
        for(int i=0;i<len;i++)
        {
            arr[i]= sc.nextInt();
        }
    }

    public void duplicatefou()
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println("duplicate element "+arr[i]+" found at index "+j);
                }
            }
        }
    }

    public static void main(String[] args)
    {
            DuplicateFound de=new DuplicateFound();
            de.array();
            de.duplicatefou();
    }
}
