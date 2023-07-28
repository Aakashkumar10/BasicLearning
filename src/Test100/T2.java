package Test100;

public class T2 {

	
	
	public static void main(String args[])
	{
		
		int n= 5;
		
		for(int i = 1 ;i<n;i++)
		{
			for( int j = n;j>i;j--)
			{
				System.out.print(" ");
			}
			
			for( int k = 1;k<=i;k++)
			{
				System.out.print("*");
			}
			
			System.out.println(" ");
		}
		
		n = n-2;
		
		
		
		for( int i = n;i>=1;i--)
		{
			
			for(int j = 1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			
			
			for( int k = 1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		
}

	
	
}
