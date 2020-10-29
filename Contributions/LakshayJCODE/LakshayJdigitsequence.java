/* 
Problem: Write a java program that divide a given number as follows:

If Input is 1234567
First No: 1357 (digit of odd place)
Second No: 246 (digit of even place)
And find which no is larger.
*/

import java.util.Scanner;
public class evenOdddigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int cnt = 0,num;
		System.out.print("Enter a number : ");
	    int n = s.nextInt(); 
	    s.nextLine();
	    num = n;
	    while(num > 0)
	    {
	    	cnt++;
	    	num /= 10;
	    }
	    if(cnt%2==0)
	    {
	    	Enofdigits(n);
	    }
	    else
	    {
	    	Onofdigits(n);
	    }
	}
	public static void Onofdigits(int n)
	{
		int t,c=0,eno=0,ono=0;
		t=n;
                while(t!=0)
                {
                    c++;
                    if(c%2==0)
                        eno= (eno*10)+(t%10);
                    else
                        ono= (ono*10)+(t%10);
                    t /= 10;
                }
                eno = reverse(eno);
                ono = reverse(ono);
                System.out.println("Number using odd digits : "+ono);
                System.out.println("Number using even digits : "+eno);
	}
	public static void Enofdigits(int n)
	{
		int t,c=0,eno=0,ono=0;
		t=n;
		while(t!=0)
		{
			c++;
			if(c%2==0)
				ono= (ono*10)+(t%10);
			else
				eno= (eno*10)+(t%10);
			t /= 10;
		}
		eno = reverse(eno);
	        ono = reverse(ono);
	        System.out.println("Number using odd digits : "+ono);
	        System.out.println("Number using even digits : "+eno);	
	}
    public static int reverse(int n)
    {
    	int a = 0;
		while (n > 0) {
			int r = n % 10;
			a = (a * 10) + r;
			n = n / 10;	
		}
		return a;
    }
}

