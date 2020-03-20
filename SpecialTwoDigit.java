import java.util.Scanner;
class SpecialTwoDigit
{
  public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter the number");
   int n=sc.nextInt();
   int d1=n%10;
   int d2=n/10;
   int sum=(d1+d2)+(d1*d2);
   if(sum==n)
   System.out.println(n+"its special two digit number");
   else
   System.out.println(n+"its not a special digit number");

  }
}