package palindromenumber1;

public class PalindromeNumber1 {
    public static void main(String args[])
    {
    	int n=121;
    	int temp=n;
    	int rev=0,rem;
    	while(temp != 0)
    	{
    		rem = temp%10;
    		rev=rev*10+rem;
    		temp=temp/10;
    	}
    	if(n==rev)
    	{
    		System.out.println(n+ "is a palindrome number");
    	}	
    	else
    	{
    		System.out.println(n+ "is not a palindrome number");
    	}
    }
}
