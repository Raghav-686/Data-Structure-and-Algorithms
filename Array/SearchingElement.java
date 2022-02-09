package Array;

import java.util.Scanner;

public class SearchingElement
{
    Scanner sc=new Scanner(System.in);
    int size;
    int arr[]=null;
    public void array()
    {
        System.out.println("enter the size of array");
        size=sc.nextInt();
        arr=new int[size];
        System.out.println("enter the element");
        for(int i=0;i<size;i++)
        {
            arr[i]= sc.nextInt();
        }
    }

    public void search(int tosearch)
    {
        for(int i=0;i<arr.length;i++)
        {
            if (arr[i] == tosearch)
            {
                System.out.println("ELement found at " + i);
                return;
            }
        }
        System.out.println(tosearch+" is not present");
    }

    public static void main(String[] args)
    {
        SearchingElement se=new SearchingElement();
        Scanner sc=new Scanner(System.in);
        se.array();
        int element;
        System.out.println("enter the element you want to search");
        element=sc.nextInt();
        se.search(element);
    }
}
