package Array;

import java.util.Scanner;

public class Insertion
{
    int arr[]=null;

    public Insertion(int size)
    {
        arr=new int[size];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=Integer.MIN_VALUE;
        }
    }

    public void insert(int loc,int value)
    {
        try
        {
            if(arr[loc]==Integer.MIN_VALUE)
            {
                arr[loc]=value;
                System.out.println("successfully inserted");
            }
            else
            {
                System.out.println("there is already element present");
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        Insertion in=new Insertion(size);

        in.insert(2,5);
        in.insert(0,0);
        in.insert(2,7);
        in.insert(5,7);
        in.insert(12,9);

    }
}
