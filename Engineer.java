class Engineer
{
  void show()
{
  System.out.println("1");
}
}
class CivilEngineer extends Engineer
{
  void show()
{
  System.out.println("2");
}
public static void main(String args[])
{
  Engineer e=new Engineer();
  e.show();
  CivilEngineer ce=new CivilEngineer();
  ce.show();
}
}
 