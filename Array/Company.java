package Array;

import java.util.Scanner;

public class Company
{
    int item1;
    int item2;
    int item3;

    public int getItem1()
    {
        return item1;
    }

    public void setItem1(int item1)
    {
        this.item1 = item1;
    }

    public int getItem2()
    {
        return item2;
    }

    public void setItem2(int item2)
    {
        this.item2 = item2;
    }

    public int getItem3()
    {
        return item3;
    }

    public void setItem3(int item3) {
        this.item3 = item3;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Company Salesman[]=new Company[5];
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter the sales of 3 items sold by salesman "+(i+1)+" ");
            Salesman[i]= new Company();
            System.out.println("Enter the item1 item2 item3");
            Salesman[i].setItem1(sc.nextInt());
            Salesman[i].setItem2(sc.nextInt());
            Salesman[i].setItem3(sc.nextInt());
        }
        for(int i=0;i<5;i++)
        {
            int sum=0;
            sum=sum+Salesman[i].getItem1()+Salesman[i].getItem2()+Salesman[i].getItem3();
            System.out.println("total sales by salesman is "+(i+1)+" "+sum);
        }
            int sum=0;
            for(int j=0;j<5;j++)
            {
                sum=sum+Salesman[j].getItem1();
            }
        System.out.println("total sales of item1 "+" "+sum);
             sum=0;
        for(int j=0;j<5;j++)
        {
            sum=sum+Salesman[j].getItem2();
        }
        System.out.println("total sales of item2 "+" "+sum);
        sum=0;
        for(int j=0;j<5;j++)
        {
            sum=sum+Salesman[j].getItem3();
        }
        System.out.println("total sales of item3 "+" "+sum);
    }
}












































































































































































































































