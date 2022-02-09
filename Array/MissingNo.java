package Array;

import java.util.Scanner;

public class MissingNo
{
    int c=0;

    public void missing(int arr[])
    {
        int sum=10*(10+1)/2;
        for(int i : arr)
        {
            c=c+i;
        }
        System.out.println("Missing Element is: "+(sum-c));
    }

    public static void main(String[] args)
    {
        MissingNo mn=new MissingNo();
        int arr[]={1,2,3,4,5,6,8,9,10};
        mn.missing(arr);
    }
}
