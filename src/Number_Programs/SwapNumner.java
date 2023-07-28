package Number_Programs;

public class SwapNumner {

	
	
	
		static void Swap(int x,int y)
		{
		
		
       System.out.println("before Sawping the nuber is ..");
      System.out.println("fist is " +x + "  " +"Second"+ y);
       		
		x = x^y;
		y = x^y;
		x = x^y;
		
			
			System.out.println(" After Swaping the numbers ");
			System.out.println("first is "+x  + " " + "Second is "+y);
			
			
			
		}
		
	public static void main(String args [])
	{
		
	int x =10;
	int y = 20;
	
	Swap(x,y);
		
		
		
	}
		
		
		
		
		
	
	
	
}
