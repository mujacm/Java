/*
Problem: Write a program to reverse elements of an array without creating any temporary array.
*/

import java.util.*;
public class repo
{
    public static void main(String [] args)
    {
        for(int i=0;i<args.length;i++)
        {
            String s="";
            for(int j=s.length()-1;j>=0;j--)
            {
                s=s+args[i].charAt(j);
            }
            System.out.print(s+" ");
    }
}
}

