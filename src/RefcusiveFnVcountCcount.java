
public class RefcusiveFnVcountCcount {

	
	
	
	public static void main(String args [])
	{
	int vCount = 0,  cCount=0;
	
	String str = "AakashSinghFromIndia";
	
	str = str.toLowerCase();
	
	for(int i = 0;i<str.length();i++)
	{
		if(str.charAt(i) == 'a' ||str.charAt(i) == 'e' ||str.charAt(i)== 'i'||str.charAt(i) =='o'||str.charAt(i)=='u')
		{
			
			vCount++;              // That's using for Vowel Count 
		}
		
		
		else if(str.charAt(i)>='a' && str.charAt(i)<='z') {
			
			cCount++;         // That's Using for Constant.
			
		}
	}
	
	System.out.println("No of vowel" +  " __ " +  vCount);
	System.out.println("No of Constant" +  "__  " + cCount);

	}
		
	
	};
	
	
	
	
	

