package Searching;

import java.util.Arrays;

public class BinarySearch {

public static void main(String args []) {

	
	int arr[] = {10 , 20 ,30 ,40, 50 , 60,100};
	
	System.out.println("the Array is : " + Arrays.toString(arr));
	
	int search = 30;
	int fi = 0;
	int lst = arr.length-1;
	int mid = (fi+lst)/2;
	
	while(fi<=lst)
	{
		
		 if(arr[mid] ==search)
		{
			System.out.println();
			System.out.println("Element fount at index :  " + (mid +1 ));
			break;
		}
		
		
		 else if(arr[mid]<search)
		{
			fi = mid+1;
		}
		
		
		
		else {
			lst = mid-1;
		}
		
	mid =(fi+lst)/2;	
	
	}
	
	if(fi >lst)
	{
		System.out.println("Element not found  ");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
}
