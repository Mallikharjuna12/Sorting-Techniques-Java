package sorting;
//slection sort :how they work this algorithm;
//get the minimuim value and swap it;
import java.util.*;
public class selection {
    // public static void selectSort(int arr[])
    // {

    // }
    public static void main(String[] args)
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
        for(int i=0;i<a-1;i++)
        {
            int min=i;
            for(int j=i+1;j<a;j++)
            {
                if(arr[j]<arr[min])
                {
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
            System.out.println("Iterartion "+i+":");
             for(int m:arr)
                {
                    System.out.print(m+" ");
                }
        }
        System.out.println("After Sorting:");
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
}
