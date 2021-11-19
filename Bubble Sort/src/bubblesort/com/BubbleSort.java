package bubblesort.com;
import java.util.Scanner;

public class BubbleSort {
	public static int[] test(int a[])
	{
		for(int i=0; i<a.length-1; i++)
		{
			for(int j=0; j<a.length-1; j++)
			{
				int temp;
				if(a[j] > a[j+1])
				{
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		printarray(a);
		return a;
	}
	public static void printarray(int res[])
	{
		for(int i=0; i<=res.length-1; i++)
		{
			System.out.print(res[i]+ " ");
		}
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number of array elements :");
		int n = s.nextInt();
		
		int a[] = new int[n];
		
		System.out.println("Enter the array elements :");
		for(int i=0; i<n; i++)
		{
			a[i] = s.nextInt();
		}
		System.out.println(test(a));
	}

}
