package sorting;
//this one is insertion sort how the work
//arr={14,9,15,12,6,8,13};
import java.util.*;
public class insertionsort {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        int arr[]=new int[a];
        System.out.println("Before Sorting:");
        for(int i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<a;i++)
        {
            int j=i;
            while(j>0&& arr[j-1]>arr[j])
            {
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            } 
            System.out.println("Iterartion "+i+"(insertion "+arr[j]+"):");
             for(int m:arr)
                {
                    System.out.print(m+" ");
                }
        }
        System.out.println("After sorting:");
        for(int i:arr)
        {
            System.out.print(i+" ");
        }


    }
}
