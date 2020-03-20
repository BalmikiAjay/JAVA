class Student3
{
  int id;
  String name;
  int age;
  public Student3(int i,String n) {
	 id=i;
	 name=n;
}
  public Student3(int i,String n,int a) {
      id=i;
      name=n;
      age=a;
}
  public Student3(String n ) {
	  name=n;
}
  void  display()
  {
	  System.out.println(id+" "+name+" "+age);
  }
  public static void main(String args[])
  {
	  Student3 s1 = new Student3(22,"ajay");
	  Student3 s2 = new Student3("Balmiki");
	  Student3 s3 = new Student3(21,"ajay",33); 
	  s1.display();
	  s2.display();
	  s3.display();
  }
  
}