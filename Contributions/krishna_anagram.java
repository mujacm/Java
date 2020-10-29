/*
 * Program to check if two words are anagrams (eg. FLOW and WOLF)
 */
import java.util.*;
public class Anagram
{
    public static void main()
    {
        int p1,p2,as1,as2,s1=0,s2=0,k=1;
        String str1,str2,str3="",str4="";
        char ch1,ch2;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter first word");
        str1=in.next();
        System.out.println("Enter second word");
        str2=in.next();
        str1=str1.toUpperCase();
        str2=str2.toUpperCase();
        p1=str1.length();
        p2=str2.length();
        if(p1==p2)
        {
            for(int i=65;i<=90;i++)
            {
                for(int j=0;j<p2;j++)
                {
                    ch1=str1.charAt(j);
                    ch2=str2.charAt(j);
                    as1=(int)ch1;
                    as2=(int)ch2;
                    if(Character.isLetter(ch1)==true && Character.isLetter(ch2)==true)
                    {
                        if(as1==i)
                        {
                            str3+=ch1;
                            s1+=as1;
                        }
                        if(as2==i)
                        {
                            str4+=ch2;
                            s2+=as2;
                        }
                    }
                    else
                    {
                        k=0;
                        break;
                    }
                }
            }
            if(k==1)
            {if(str3.equals(str4) && (s1==s2))
                System.out.println(str1+" and "+str2+" are Anagrams.");
            else
                System.out.println(str1+" and "+str2+" are not Anagrams.");
            }
            else
            System.out.println("Invalid input!");
        }
        else
            System.out.println("Invalid input!");

    }
}