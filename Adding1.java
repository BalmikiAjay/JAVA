import java.util.Scanner;
class Adding1
{
  public static void main(String args[])
  {
    int num1,num2,num3,sum;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the num1:");
    num1=sc.nextInt();

    System.out.println("enter the num2:");
    num2=sc.nextInt();
   
    System.out.println("enter the num3:");
    num3=sc.nextInt();

   sum=num1+num2+num3;
   System.out.println("sum of these number:"+sum);
}
}