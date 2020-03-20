class Student2
{
  int id;
 String name;
 Student2(int i,String n)
 {
	 id=i;
	 name=n;
 }
 void display()
 {
	 System.out.println(id+" "+name);
 }
  public static void main(String[] args)
  {
	  Student2 s1=new Student2(11,"balmiki");
	  Student2 s2=new Student2(22,"ajay");
          Student2 s3=new Student2(42,"ajay");
	
	  s1.display();
	  s2.display();
          s3.display()
}
}