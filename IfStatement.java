import java.util.Scanner;
public class IfStatement
{
  public static void main(String args[])
{
  Scanner scan=new Scanner(System.in);
  System.out.println("Enter the number");
  int n=scan.nextInt();
  if (n<100){
     System.out.println("Number is less than 100");
}
   else{
     System.out.println("Number is greater than 100");
       }
     }
   }
