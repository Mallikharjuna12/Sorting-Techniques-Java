package sorting;
import java.util.*;
public class bubblesort {
    public static void main(String [] args)
{
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int arr[]=new int[a];
    for(int i=0;i<a;i++)
    {
        arr[i]=sc.nextInt();
    }
    System.out.println("Before Sorting:");
    for(int i:arr)
    {
        System.out.print(i+" ");
    }
    System.out.println();
    for(int i=0;i<a;i++)
    {
        for(int j=0;j<a-i-1;j++)
        {
            if(arr[j]>arr[j+1])
            {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
            System.out.println("Iterartion "+i+":");
             for(int m:arr)
                {
                    System.out.print(m+" ");
                }
        }
    }
    System.out.println("After sorting:");
    for(int i:arr)
    {
        System.out.print(i+" ");
    }
}
}
