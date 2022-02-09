package Array;

import java.util.Scanner;

public class Search
{
        int size = 0;
        int search=0;
        int arr[] = null;

        public void array()
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the size of array.");
            size = sc.nextInt();
            arr = new int[size];
            System.out.println("enter the elements");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("enter the no you want to search");
            search = sc.nextInt();
        }

        public void find(){
            for(int i=0;i<arr.length;i++)
            {
                    if(arr[i]==search)
                    {
                        System.out.println("number found at index "+i);
                        return;
                    }
                }
            System.out.println("not found");
            }


    public static void main(String[] args)
    {
        Search s=new Search();
        s.array();
        s.find();
    }
}
