/*
Problem: Write a program to reverse elements of an array without creating any temporary array.
*/

import java.util.*;
public class repo
{
    public static void main(String [] args)
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n=s.nextInt(); s.nextLine();
        System.out.println("\nEnter "+n+" integers for the array: ");
        int[] arr = new int[n];
        int i=0,j=n-1;
        for(i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.println("\nThe elements entered are:");
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        for(i=0;i<n;)
        {
            arr[i]=arr[i]+arr[j];
            arr[j]=arr[i]-arr[j];
            arr[i]=arr[i]-arr[j];
            i++;
            j--;
        }
        System.out.println("\nThe elements after reversing are:");
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" "); /*
            Printing the array
            */
        }
    }
}

