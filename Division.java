import java.util.Scanner;
public class Division
{
  public static void main(String args[])
{
  Scanner scan=new Scanner("System.in");
  System.out.println("Enter first number:");
  int num1=scan.nextInt();
  System.out.println("Enetr second number:");
  int num2=scan.nextInt();
  scan.close();
  int division=num1/num2;
  System.out.println("division is:"+division);

}

} 