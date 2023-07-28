package Java_Basic_Programs;

public class HCF {

public static void main(String args [])
{
	
int n1 =10,  n2=55;

int  gcd = 1;

for(int i =1 ; i<= n1 &&i <=n2;i++)
{
	
if(n1%i==0 && n2%i ==0)
gcd = i;
	
}

System.out.println(" The GCF Of both numbers are .." + gcd);
	
	
	
	
}
	
	
	
	
	
	
	
	
	
}
