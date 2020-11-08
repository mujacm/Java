/*
Problem: To check if string is palindrome or not.
*/

import java.util.*;

public class palindrome
{
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String s=sc.nextLine();
        int l=s.length();
        String r="";
        for(int x=l-1;x>=0;x--)
        {
            char ch=s.charAt(x);
            if(ch!=' ')
            {
                r=r+ch;
            }
        }
        
        boolean b=s.equalsIgnoreCase(r);
            if(b==true)
            {
                System.out.println("  Palindrome");
            }
            else
            {
                System.out.println(" not Palindrome");
            }
        }
}
      
