package JavaPractice;

public class String_Method {

	
	
	
	public static void main(String args[])
	{
	
		int arr[] = {10,25,2689,654};
		
		int min = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min =arr[i];
			}
		}
		  System.out.println(min);
			
}}
