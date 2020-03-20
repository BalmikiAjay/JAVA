import java.util.Scanner;
class PrintNumber1
{
   public static void main(String args[])
 {
    Scanner sc = new Scanner(System.in);
    System.out.println("enetr the number");
    int n=sc.nextInt();
    for(int i=n;i>=1;i--)
  {
     System.out.println(i);
    }
  }
}