package Searching;

import java.util.Scanner;

import javax.swing.text.Position;

public class LinesarSearch {

public static void main(String args[])
{
	
int i;	
Scanner sc = new Scanner(System.in);

System.out.println("Enter the number how many number you want in the array"
		+ "");

int n = sc.nextInt();
int arr[] = new int[n];

 int Pos = -1;

System.out.println("Enter Array Elements.." + n);

for( i = 0 ;i<n;i++)
{
arr[i] =	sc.nextInt();
}


System.out.println(" Find the searching element..");



int search = sc.nextInt();


for( i =0;i<n;i++)
{
	if(arr[i] ==search)
	{
		Pos = i;
//		System.out.println(" The element is fount at index" + " " +(i+1) );
		break;
	}
}
if(Pos !=-1)
{
	System.out.println(" elemnt not found at the index " + (Pos +1));
}
	
else {
	{
		System.out.println("Element not found");
	}
}
	
	
	
	
}}
	
	

