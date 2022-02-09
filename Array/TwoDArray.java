package Array;

import java.util.Scanner;

public class TwoDArray
{
    int arr[][]=null;
    public void array()
    {
        Scanner sc=new Scanner(System.in);
        arr=new int[4][5];
        for(int i=0;i<4;i++)
        {
            System.out.println("enter the marks of 5 subject of student "+(i+1));
            for(int j=0;j<5;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
    }

    public void avemarkssub()
    {
        for(int i=0;i<5;i++)
        {
            int sum=0;
            for(int j=0;j<4;j++)
            {
                sum=sum+arr[j][i];
            }
            System.out.println("Average marks Obtained in subject "+(i+1)+" "+sum/4);
        }
    }

    public void avemarkstu()
    {
        for(int i=0;i<4;i++)
        {
            int sum=0;
            for(int j=0;j<5;j++)
            {
                sum=sum+arr[i][j];
            }
            System.out.println("Average marks Obtained by student "+(i+1)+" "+sum/5);
        }
    }

    public void avebelow()
    {
        int c=0;
        for(int i=0;i<4;i++)
        {
            int sum=0;
            for(int j=0;j<5;j++)
            {
                sum=sum+arr[i][j];
            }
            sum=sum/5;
            if(sum<50)
            {
                c++;
            }
        }
        System.out.println("Total no. of student who have scored below 50 in their average is "+c);
    }

    public void displayscore()
    {
        for(int i=0;i<4;i++)
        {
            System.out.println(" marks of 5 subject of student "+(i+1));
            for(int j=0;j<5;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        TwoDArray tw=new TwoDArray();
        tw.array();
        tw.avemarkssub();
        tw.avemarkstu();
        tw.displayscore();
        tw.avebelow();
    }
}
