/*
Problem: To check if string is palindrome or not.
*/

import java.util.*;

public class palindrome
{
    public void main()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number to check if it is palindrome or not : ");
        String st =s.nextLine();
        String st2="";
        // Reverses the string and stores it in a variable.
        for(int i=st.length()-1;i>=0;i--)
        {
            st2=st2+ st.charAt(i);
        }
        // Compares both strings to check if they are same or not and prints a suitable output.
        if(st==st2)
            System.out.println(st+" is Palindrome.");
        else
            System.out.println(st+" is not Palindrome.");
    }
}
