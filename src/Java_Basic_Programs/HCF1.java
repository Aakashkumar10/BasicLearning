package Java_Basic_Programs;

import java.util.Scanner;

public class HCF1 {

	
	
public static void main(String args [])
{
	
Scanner st  = new Scanner (System.in);
System.out.print(" Enter the first number ....");

int g =0;
int a = st .nextInt();

System.out.print(" Enter the secod number... ");
System.out.print("   ");


int b = st .nextInt();


for(int i=1;i<=a &&i<=b;i++)
{
	
if(a%i==0&&b%i==0)
	g = i;
	
}


System.out.println(" The GCF is " + g);
	
	
	
	
	
}
 
	
}
