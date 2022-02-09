package Array;

import java.util.Scanner;
import java.util.Arrays;

public class PairTwoSum
{
    int sum=0;
    int size=0;
    int arr[]=null;
    public void array()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        size=sc.nextInt();
        arr=new int[size];
        System.out.println("enter the element of array");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the number you want to check for the pairs of the sum");
        sum=sc.nextInt();
    }

    public int[] pair() throws Exception {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if((arr[i]+arr[j]==sum))
                {
                    return new int[]{i,j};
                }
            }
        }
        throw new Exception("no pair found");



    }


    public static void main(String[] args) throws Exception {
        PairTwoSum ps=new PairTwoSum();
        ps.array();;
        int[] result= ps.pair();
        System.out.println(Arrays.toString(result));
    }
}
