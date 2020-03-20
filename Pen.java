class Pen
{
String clr;
void writes()

{
  System.out.println(this.clr+"pen writes");
}
 public static void main(String args[])
{
Pen P1=new Pen();
    P1.clr= "green";
    P1.writes();
Pen P2=new Pen();
    P2.clr= "black";
    P2.writes();
}
}