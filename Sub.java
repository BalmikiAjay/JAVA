import java.util.Scanner;
public class Sub
{
  public static void main(String args[])
{
  Scanner scan=new Scanner(System.in);
  System.out.println("Enetr first number:");
  int num1=scan.nextInt();
  System.out.println("Enter second number:");
  int num2=scan.nextInt();
  scan.close();
  int sub=num1-num2;
  System.out.println("sub is:"sub);

  }
}