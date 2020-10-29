/*
Problem: Write a java program to find the sum of digits of a given number.
*/
import java.io.*;
public class digitSum
{
    public static void main(String args[]) public static throws IOException
    {
        BufferedReader br = new BufferedReader(new InputSteamReader(System.in))
        int n,t,sum=0;
        System.out.println("Enter a number : ");
        n=Integer.parseInt(br.readLine());
        t=n;
        while(t!=0)
        {
            sum+= (t/10);
            t/=10;
        }
        System.out.println("Sum of digits of "+n+" is = "+sum);
    }
}