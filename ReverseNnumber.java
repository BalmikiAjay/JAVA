import java.util.Scanner;
class Number1toN
{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the valu of n");
 int n=sc.nextInt();
 for(int i=1;i>=n;i++)
{
System.out.print(i);
} 
}
}