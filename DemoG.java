import java.util.Scanner;
class DemoG
{
  public static void main(String args[])
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("Eneter the number");
      int n=sc.nextInt();
      if(n<12){
        System.out.println("Good Morning");
      }
        else if(n<18){
       System.out.println("Good Afternoon");
       }
      else if(n<30){
       System.out.println("Good Evening");
     }
    else
         System.out.println("Hello Friends");

}
}