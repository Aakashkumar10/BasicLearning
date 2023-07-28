package Searching;

public class Test21 {

	public static void main(String arg[])
	{
		
		int arr[] = {10 , 20 , 60 ,100 ,101 , 200};
		
		int search = 10059;
		int n = arr.length;
		int fs = 0 ;
		int lst = n-1;
		
		int mid = (fs +lst)/2;
		
		
		while(fs<=lst)
		{
		
			if(arr[mid] == search)
			{
				System.out.println("Element found at index :  " + (mid+1));
				break;
			}
			
			else if(arr[mid]< search)
			{
				fs = mid +1;
			}
			
			

			else {
				
				lst = mid-1;
	
			
			}
			mid = (fs +lst)/2;
		}
		
	
		
		
		if(fs>lst)
		{
			System.out.println(" Element is not found");
		}
	}
	
}
