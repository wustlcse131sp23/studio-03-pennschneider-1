package studio3;

import java.util.Scanner;

public class Sieve {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("What is the top integer you want:" );
	int topNumber = in.nextInt();
	int[] a= new int[topNumber+1];
	
	for (int i=2; i<topNumber+1;  i++)
	{
		a[i]=i;
		
		int[] b= new int[topNumber];
		
	}
	
	
	for (int j=2; j<topNumber+1; j++)
	{
		for (int k=2*j; k<topNumber+1;  k=k+j)
		{
			a[k]=0;
			
		}
		
	}
	for(int s = 2; s <topNumber+1; s++)
	{
		if (a[s]!= 0)
		{
		System.out.println(a[s]);
		}
	}
	
	
	
	
	
}
}
