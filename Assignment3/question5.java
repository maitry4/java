/*
----------INTERFACE--------------
Create two interfaces Printable and Showable having methods print( ) and show( )
respectively. Create a Test_Multiple class which implements all 2 interfaces and
override print( ) and show( ) methods. Write a main method in this class and create an
object of this class and use the methods.
*/
class Test {
  public static void main (String[] args) {
    Test_Multiple t = new Test_Multiple();
    t.print();
    t.show();
  }
}
interface Printable {
  public void print();
 
}
interface Showable {
   public void show();
 
}
class Test_Multiple implements Printable, Showable {
   public void show() {
     System.out.println("showing");
   }
   public void print() {
     System.out.println("printing");
   }
 
}

