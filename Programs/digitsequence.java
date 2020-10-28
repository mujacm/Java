/* 
Problem: Write a java program that divide a given number as follows:

If Input is 1234567
First No: 1357 (digit of odd place)
Second No: 246 (digit of even place)
And find which no is larger.
*/

import java.util.*;
public class evenOddDigit
{
    public void main()
    {
        Scanner s = new Scanner(System.in);
        int n,on=0,en=0,t,c=0;
        System.out.print("Enter a number : ");
        n = s.nextInt(); s.nextLine();
        t=n;
        while(t!=0)
        {
            c++;
            if(c%2==0)
                en= (en*10)+(t%10);
            else
                on= (on*10)+(t%10);
            t/=10;
        }
        System.out.println("Number using odd digits : "+reverse(on));
        System.out.println("Number using even digits : "+reverse(en));
        System.out.println("Larger number : "+Math.max(reverse(on),reverse(en)));
    }
    int reverse(int s)
    {
        int r,rev=0;
        while(s>0)
        {
            r=s%10;
            rev=rev*10+r;
            s=s/10;
        }
        return rev;
    }
}
