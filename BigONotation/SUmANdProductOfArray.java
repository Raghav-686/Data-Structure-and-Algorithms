package BigONotation;

import java.util.Scanner;

public class SUmANdProductOfArray
{
    void SandP(int arr[])
    {
        int sum=0;
        int product=1;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
            product=product*arr[i];
        }
        System.out.println(sum+" , "+product);
    }


    public static void main(String[] args)
    {
      SUmANdProductOfArray st=new SUmANdProductOfArray();
      int arr1[]=new int[5];
        Scanner sc =new Scanner(System.in);
      for(int i = 0; i<arr1.length;i++)
        {
            arr1[i]=sc.nextInt();
        }
      st.SandP(arr1);
    }
}
