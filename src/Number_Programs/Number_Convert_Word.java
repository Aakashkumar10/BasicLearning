package Number_Programs;

import java.util.Scanner;

public class Number_Convert_Word {

	
public static void main(String args [])
{
	
	Scanner st = new Scanner(System.in);
	System.out.print("Enter the number.....");
	
	
	int n = st.nextInt();
	
	if(n<0||n>999)
	{
		
		
		System.out.println(" Invalied Input ");
	}
	 
	else
	{
	int u = n%10;
	int tt = n/10;
	int t = tt%10;
	int h =n/100;
	
	
	String uw[] = {"  ", " One", " Two", " Three", " Four", " Five", " Six", " Seven", " Eight", " Nine", " Ten", " Eleven", " Twelve", " Thirteen", " Fourteen", " Fifteen", " Sixteen", " Seventeen", " Eighteen", " Nineteen"};
	String tw[] = {" ", " Ten", " Twenty", " Thirty", " Forty", " Fifty", " Sixty", " Seventy", " Eighty", " Ninety" };	
		
	String hw = "hundred";
	
	if(n<20)
	{
		
		System.out.println(uw[n]);
	}
	
	else if(n<100)
	{
		
		System.out.println(tw[t] + uw[u]);
		 
	}
	
	else
	{
		System.out.println(uw[h]+hw+tw[t]+uw[u]);
	}
	
	
	}
	
	
}
	
	
	
	
	
}
