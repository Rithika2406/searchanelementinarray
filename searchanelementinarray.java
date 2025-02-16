import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner S=new Scanner(System.in);
		int N=S.nextInt();
		int X=S.nextInt();
		int []A=new int[N];
		int count=0;
		for(int i=0;i<N;i++)
		{
		    A[i]=S.nextInt();
		}
		for(int i=0;i<N;i++)
		{
		    if(A[i]==X)
		    {
		        count++;
		    }
		}
		if(count>0)
		{
		    System.out.println("YES");
		}
		else{
		    System.out.println("NO");
		}

	}
}
