/*
Problem: To check if string is palindrome or not.
*/

//import java.util.*;
import java.util.Scanner;

public class palindrome
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string to check if it is palindrome or not : ");
        String str =s.next();
        check(str);
    }
    public static void check(String str)
    {
        int i=0,j=str.length()-1;
	while(i<str.length()/2)
	{
            if(str.charAt(i)!=str.charAt(j))
            { 
	       System.out.println(str+" is not a Palindrome.");   
            }
	    i++;
	    j--;
	}
        System.out.println(str+" is a Palindrome.");
    }
}
