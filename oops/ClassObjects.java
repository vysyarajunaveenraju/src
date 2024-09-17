package oops;

public class ClassObjects {
    public static void main(String[] args) {
        CSE stud1 = new CSE();
        //stud1.setName("Naveen");
        System.out.println(stud1.getName());
    }
    
}
class CSE{
   private String name;
   private int mobile;
   private int rollno;
   CSE(String name,int mobile,int roll)
   {
    this.name=name;
    this.mobile=mobile;
    this.rollno=roll;
   }
   CSE()
   {
    this.name="John";
    this.mobile=mobile;
    this.rollno=rollno;
   }
    public void  setName(String n)
    {
        this.name=n;
    }
    public String getName()
    {
        return this.name;
    }
}
