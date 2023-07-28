package Java_Basic_Programs;

import java.util.Scanner;

public class Palindrome_1 {

	public static void main(String args [])
	{
		
	int temp,i,l,sum= 0;
	Scanner st = new Scanner(System.in);
		
	
	System.out.println(" Enter the number /..");
	
	int n = st.nextInt();
		
	temp =n;
	while(n>0)
	{
	
	l = n%10;
	sum = sum*10+l;
	n =n/10;
		
	}
	
	if(temp==sum)
	{
		System.out.println(temp + " Palindome number"); 
	}
	
	
	
	else
	{
		System.out.println(temp + " Not Palindrome number");
	}
	}
}
