//To do sum of digits of a no
import java.util.*;
class sumNo
{
	Scanner sc=new Scanner(System.in)
	public static void main()
	{
	int n= sc.nextInt();int d=n;
	int s=0;
	while(n>=0)
	{
      int a=d%10;
      s=s+a;
      d=d/10;
	}
	System.out.println("sum of digit of no ="+s);
	}
}