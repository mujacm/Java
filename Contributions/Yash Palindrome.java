/*
Problem: To check if string is palindrome or not.
*/

import java.util.*;
// util package has been imported to the program.

public class palindrome
{
    public void main()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number to check if it is palindrome or not : ");
        String st =s.nextLine();
        String st2="";
        for(int i=st.length()-1;i>=0;i--)
        {
            st2=st2+ st.charAt(i);
        }
        if(st==st2)
            System.out.println(st+" is a Palindrome., which means it is the same forwards and backwards.");
        else
            System.out.println(st+" is not Palindrome. which means it is not the same forwards and backwards.");
    }
}
