/*
Problem: Write a java program to find the sum of digits of a given number.
*/

import java.util.*;
public class digitSum
{
    public void main()
    {
        Scanner s = new Scanner(System.in);
        int n,t,sum=0;
        System.out.print("Enter a number : ");
        n=s.nextInt();
        s.nextLine();
        t=n;
        while(t!=0)
        {
            sum+= (t/10);
            t/=10;
        }
       
       System.out.print
    }
}