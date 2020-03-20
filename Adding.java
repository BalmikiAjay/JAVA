import java.util.Scanner;
public class Adding
{
  public static void main(String args[])
{
  Scanner scan=new Scanner(System.in);
  System.out.print("Eneter first number");
  int n1=scan.nextInt();
  System.out.print("Enter second number");
  int n2=scan.nextInt();
  System.out.print("Enter last number");
  int n3=scan.nextInt();
  scan.close();
  int sum=n1+n2+n3;
  System.out.println("Sum of these three number:"+sum);
}
}