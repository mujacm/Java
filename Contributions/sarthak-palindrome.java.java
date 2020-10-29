/*
Problem: To check if string is palindrome or not.
*/

import java.util.*;

public class palindrome
{
    public void main()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a word to check if it is palindrome or not : ");
        String st =s.nextLine();
        String st2="";
        for(int i=st.length()-1;i>=0;i--)
        {
            st2=st2+st.charAt(i);
        }
        if(st2.equalsIgnoreCase(st))
            System.out.println(st+" is Palindrome.");
        else
            System.out.println(st+" is not Palindrome.");
    }
}
