package Searching;

import java.util.Arrays;

import javax.print.CancelablePrintJob;

public class SortArray {
	
public static void main(String arg[])
{
	
	int temp =0;
	
int arr[] = {10 , 20 ,60,540,1454,445};


int n = arr.length;
for(int i = 0;i<arr.length;i++)
{
	for(int j = 0;j<arr.length;j++)
	{
		if(arr[i]<arr[j])
		{
			temp = arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			
		}
		
		
		
	}
}
	System.out.println("Know new Array is :" + Arrays.toString(arr));

	System.out.println();
System.out.println("The second largesgt element is " + arr[n-2]);	
	
}
	
	
	
	
}
