package Patterns;

public class Pattern1 {

public static void main(String args [])	{

	
	
	 int i, j;  
     for(i=0; i<5; i++) //outer loop for number of rows(n) { for(j=2*(n-i); j>=0; j--) // inner loop for spaces 
         {           
             System.out.print(" "); // printing space
         } 
         for(j=0; j<=i; j++) //  inner loop for columns
         {       
             System.out.print("* "); // print star
         }           
         System.out.println(); // e
	
	
	
}
	
}
	

