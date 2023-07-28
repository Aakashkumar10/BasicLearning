package Array_Programs;

import java.util.Scanner;

public class Basic {

	
	public static void main(String args[])
	{

  Scanner sc = new Scanner(System.in);
  System.out.println(" Enter the size of the array..");
		
int size = sc.nextInt();
 int marks [] = new int[size];
	
for( int i =0;i<size;i++)
{
	marks[i] = sc.nextInt();
}
 

System.out.println("The reak array is ....");
System.out.println(" Enter the searching element ...");

int x =sc.nextInt();
for( int i =0;i<size ;i++)
{
 if(marks[i]==x)
 {
	 System.out.println(" The is on the index is .." + i +1);
	 break;
 }
 else
	 
 {
	 System.out.println(" Element is not found");
	 break;
 }
}
 

}
	
}
