package Array;

import java.util.Scanner;

public class Temperature
{
    int sum=0;
    int arr[]=null;
    public void array()
    {
        Scanner sc=new Scanner(System.in);
        int size;
        System.out.print("How Many Day's Temperature? ");
        size=sc.nextInt();
        arr=new int[size];
        for(int i=0;i<size;i++)
        {
            System.out.print("Day "+(i+1)+" 's High Temp: ");
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
    }

    public void temp()
    {
        float average=sum/arr.length;
        int c=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>average)
            {
                c++;
            }
        }
        System.out.println("Average= "+average);
        System.out.println(c+" Day's Above Average");

    }

    public static void main(String[] args)
    {
        Temperature t=new Temperature();
        t.array();
        t.temp();
    }
}
