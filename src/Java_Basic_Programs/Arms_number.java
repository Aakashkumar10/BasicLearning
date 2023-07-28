package Java_Basic_Programs;

//package Java_Basic_Programs;

import java.util.Scanner;

public class Arms_number {

	public static void main(String args[])
	
	{
		
	int temp,r,sum= 0;
	
	Scanner st = new Scanner(System.in);
	System.out.println(" Enter the number ...");
	
	int num = st.nextInt();
	st.close();
	
	
	temp=num;
	while(num>0)
	{
		
   r = num%10;
   sum= sum+r*r*r;
   num = num/10;
		

   
	}
	
	if(temp==sum)
	{
		System.out.println(temp+ " yes  Arms number");
	}
		
	else
	{
		
		System.out.println(temp + " not a Arms Storga a number");
	}
	}
	
	
	
}
