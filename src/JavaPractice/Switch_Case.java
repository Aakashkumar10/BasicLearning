package JavaPractice;

import java.util.Scanner;

public class Switch_Case {

	public static void main(String_Method args [])
	{
		
    
		Scanner input = new Scanner(System.in);
		System.out.println(" Enter the age ...");
		
		int age = input.nextInt();
			
		switch(age)
		{   
		case 12:
			System.out.println(" The Person  is boy");
			break;
		
		
		case 20:
			System.out.println(" The person is Young");
			break;
		
		case 40:
			System.out.println(" The person is old man");
			break;
			
			
			default :
				System.out.println(" The age is not defind");
		
		}
		
		
		
		
		
	}
}
