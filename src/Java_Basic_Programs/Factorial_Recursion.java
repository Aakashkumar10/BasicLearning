package Java_Basic_Programs;

public class Factorial_Recursion {

static int factorial(int n)	{
	if(n==0)
	{
		return 1;
	}
	else 
	{
		return(n*factorial(n-1));
	}
	
}
	
	public static void main(String args [])
	{
	
    int fact =1,number =3;
    
    fact = factorial(number);
		
	System.out.println(fact);	
		
		
	}
	
}
	
	
	
	
	

