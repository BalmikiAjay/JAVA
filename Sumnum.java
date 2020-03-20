import java.util.Scanner;
class Sumnum
{
  public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the value of n");
  int n=sc.nextInt();
  int sum=0;
  for(int i=1;i<=n;i++)
{ 
   sum+=1;
} 
 System.out.println(sum);
}
}