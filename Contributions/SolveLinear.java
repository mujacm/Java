/*
Given a string input of linear single variable 'x' equation, solve this equation and output the value of x.

Input: 5x=10
Output: x = 2

Input: 8x-13=2x+10
Output: x = 3.83333
*/
import java.util.*;
class eqn1{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String eq=sc.nextLine();
    int sign=1,cof=0,cons=0,index=0;
    for (int i=0;i<eq.length();i++) {
      if (eq.charAt(i)=='+'||eq.charAt(i)=='-') {
        if(i>index)
          cons=cons+sign*Integer.parseInt(eq.substring(index,i));
        index=i;
      }
      else if (eq.charAt(i)=='x') {
        if(index==i||eq.charAt(i-1)=='+')
          cof+=sign;
        else if(eq.charAt(i-1)=='-')
          cof-=sign;
        else
          cof+=sign*Integer.parseInt(eq.substring(index,i));
        index=i+1;
      }
      else if (eq.charAt(i)=='=') {
        if(i>index)
          cons+=sign*Integer.parseInt(eq.substring(index,i));
        sign=-1;
        index=i+1;
      }
    }
    if(index<eq.length())
      cons+=sign*Integer.parseInt(eq.substring(index));
    if(cof==0)
      System.out.println("Check equation");
    else
      System.out.println("x="+(-cons*1.0/cof));
      sc.close();
  }
}
