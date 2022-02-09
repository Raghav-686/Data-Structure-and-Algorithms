package Array;

import java.util.Scanner;

public class MinimumMarks
{
    private int rollno;
    private int marks;
    private String name;

    public int getRollno()
    {
        return rollno;
    }

    public int getMarks()
    {
        return marks;
    }

    public String getName()
    {
        return name;
    }

    public void setRollno(int rollno)
    {
        this.rollno = rollno;
    }

    public void setMarks(int marks)
    {
        this.marks = marks;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        MinimumMarks arr[]=new MinimumMarks[10];
        for(int i=0;i<10;i++)
        {
            arr[i]=new MinimumMarks();
            arr[i].setRollno(sc.nextInt());
            arr[i].setMarks(sc.nextInt());
            arr[i].setName(sc.next());
        }

        int min=100000000,max=-22;
        for(int i=0;i<3;i++)
        {
            if(arr[i].getMarks()<min)
            {
                min=arr[i].getMarks();
            }
            if(arr[i].getMarks()>max)
            {
                max=arr[i].getMarks();
            }
        }
        System.out.println();
    }
}
