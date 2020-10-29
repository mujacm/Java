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
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.println("\nThe elements entered are:");
        display(arr);
        reverse(arr);
        System.out.println("\nThe elements after reversing are:");
        display(arr);
    }
    public static void reverse(int[] arr)
    {
        int j = arr.length - 1;
	for (int i = 0; i < j; i++) 
        {
            arr[i] = arr[i] + arr[j];
	    arr[j] = arr[i] - arr[j];
            arr[i] = arr[i] - arr[j];
	    j--;
	}  
    }
    public static void display(int[] arr)
    {
        for(int i = 0;i < arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        } 
    } 
}

