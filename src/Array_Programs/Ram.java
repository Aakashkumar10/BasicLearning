package Array_Programs;

import java.util.Scanner;

public class Ram{
	
	
public static void main(String args [])
{
	
	
Scanner sc = new Scanner(System.in);

System.out.println(" Enter the size of array");

int size = sc.nextInt();

System.out.println(" Enter the elements of array");

int marks[] = new int[size];
for( int i =0;i<size;i++)
{
	marks[i] = sc.nextInt();
	
//	System.out.println(marks[i]);
}

System.out.println(" Enter the target element ...");

int x = sc.nextInt();
	
for( int i =0;i<size;i ++)
{
	if(marks[i] == x)
	{
	System.out.println("The target element at index is : " +  (i +1));	
	break;
		
	}
	
	else
	{
		System.out.println(" Element is not found..");

	break;
	}
}

}
	
	
}