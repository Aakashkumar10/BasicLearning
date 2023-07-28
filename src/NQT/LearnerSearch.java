
package NQT;

import java.util.Scanner;

public class LearnerSearch {

public static void main(String args [])
{

Scanner sc  = new Scanner(System.in);

System.out.print("Enter the total number in Array :  ");

int N = sc.nextInt();

System.out.print(" Enter the Elements of array ");

 int arr[] = new int[N];
 
 for( int i =0 ;i<N ; i++)
 {
	 
	 arr[i] = sc.nextInt();
 }
 
 
 System.out.println(" Enter the Target Element:   ");
 

int Target = sc.nextInt();


for( int i =0;i<N;i++)
{
	
if(arr[i]==Target)
{
	System.out.print(" Element Found at index " + " " + (i+1));
	break;
}
	

else
{
	System.out.println(" Target Elemnent not found");
	break;
}

}
	
	

}
	
}
