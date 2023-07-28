package JavaPractice;

import java.util.Scanner;

public class Calculator_Basic {

public static void main(String_Method args [])
{
	
Scanner st = new Scanner(System.in);
System.out.print(" Enter the First number...");

float num1 = st.nextFloat();


System.out.print(" Enter the Second  number...");

float num2= st.nextFloat();


String prompt = " Press 1 for the Add   , Press 2 For the Sub    , Press 3 for the Mul    , Press 4 for the Div     Plz Enter your choice ....";
System.out.println(prompt);
	

int input = st.nextInt();
switch(input)
{

case 1:
	System.out.println("The additon of two numbers...");
	System.out.print(num1+num2);
    break;

case 2:
	System.out.println("The subition of two numbers...");
	System.out.print(num1-num2);
    break;
case 3:
	System.out.println("The multiplication of two numbers...");
	System.out.print(num1*num2);
    break;
case 4:
	System.out.println("The Division of two numbers...");
	System.out.print(num1/num2);
    break;
default:
	
	System.out.println(" Invalied Choice");




}
	
}
	
	
	
}
