package Java_Basic_Programs;

import java.util.Scanner;

public class Palindrome {


public static void main(String args [])
{
	
	
	int n , sum=0,l;
	
	
	
	
	
Scanner st = new Scanner(System.in);

System.out.println(" Enter the number ...");

int num = st.nextInt();
	
int 	temp =num;
	
	
	while(num>0)
	{
	
	l =num%10;
	sum= (sum*10) +l;
	num = num/10;
		
		
	}
	
	if(temp ==sum )
	{
		System.out.println("Number is Palindrome number...");
	}
	else 
	{
		System.out.println(" Number is not a Palindrome number");
	}
	
	
}
	
	
	
	
}


