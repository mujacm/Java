/*
Given an integer N, create a chess board of NxN dimensions with N queens placed such that no queen can attack another.

Example 1-

Input: N = 4
There are two possible outcomes.

Output:

Order: 1
_ Q _ _ 
_ _ _ Q 
Q _ _ _ 
_ _ Q _ 


Order: 2
_ _ Q _ 
Q _ _ _ 
_ _ _ Q 
_ Q _ _ 


Solutions: 2


Example 2-

Input: N = 2
There is no possible solution.

Output:

Solutions: 0

*/
import java.util.*;
class nQueens {

	static int arr[],c=0;

	void allocQueen(int x,int n) {

		for (int i=0;i<n;i++) {
			if (isValidPos(x,i)) {
				arr[x]=i;
				if(x==n-1) {
					System.out.println("order number="+(c+1));
					display(n);
				}
				else
					allocQueen(x+1,n);
			}
		}

	}


	boolean isValidPos(int r,int c) {
		for (int i=0;i<r;i++) {
			if ((arr[i]==c)||(Math.abs(i-r)==Math.abs(arr[i]-c)))
				return false;
		}
		return true;
	}


	void display(int n) {
		c++;
		char ch[][]=new char[n][n];
		int i,j;
		for(i=0;i<arr.length;i++)  {
			j=arr[i];
			ch[i][j]='Q';
		}
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++)
				System.out.print(ch[i][j]=='Q'?"Q ":"_ " );
			System.out.println();
		}
		System.out.println("\n");
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print("\n");
		arr=new int[n];
		nQueens ob=new nQueens();
		ob.allocQueen(0,n);
		System.out.println("\b\bSolutions="+c);
		sc.close();
	}
}
