package Number_Programs;

import java.util.Scanner;

public class Reverse_Number {

public static void main(String args [])
{
	
Scanner st = new Scanner(System.in);
System.out.println(" Enter the number..");

int num  = st.nextInt();

int rev =0,k,j;

int temp =num;
while(num!=0)
{
j =num%10;
rev = rev*10+j;
num = num/10;
	
}

System.out.println(" The reverse number is.. "+ rev);
	
	
	

	
}
	
	
	
	
}
