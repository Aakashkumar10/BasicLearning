package Searching;

import java.util.Arrays;

import javax.swing.text.Position;

public class Test {

	
public static void main(String args []) {
	
int arr[] = {10 , 20, 30 , 50 ,80};	

 int Position = -1;
 
 int key = 20;
 
 System.out.println("The arrya is :" + Arrays.toString(arr));

 
 System.out.println("The Searching Element is : "+ key);
 
 for( int i =0;i<arr.length;i++)
 {
	 if(arr[i] ==key)
	 {
		 Position =i;
		 break;
	 }
		 
		 
 }
	
 if(Position != -1)
 {
	 System.out.println("The Element is on index " + (Position +1));
 }
 
 else {
	 
	System.out.println(" Element is not found"); 
	 
}
}
}
