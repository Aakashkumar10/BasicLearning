package InterviewPracticxe;

import java.util.Scanner;

public class Prime_number {

	
public static void main(String args [])
{
	
	
	int h =1;
	Scanner sc = new Scanner(System.in);
	
	System.out.println(" Enter the numvber ");
	
	int no = sc.nextInt();
	
	if(no==0 || no ==1)
	{
		
	System.out.println("number is not a prime number ");	
	}
	

		for(int i =2;i<no/2;i++)
		{
			if( no%i==0)
			{
				h++;
			}
			
			
		}
	
	if( h !=1)
	{
		System.out.println(" no prime");
	}
	
	else
	{
	
		System.out.println(" prime");
	}
	
	
	
	
	
	
	
	
	
}
	
	
	
}
