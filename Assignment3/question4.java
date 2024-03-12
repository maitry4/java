/*
-----------DYNAMIC METHOD DISPATCH--------------
When reference variable of Parent class refers to the object of Child class, it is
known as upcasting.(Dynamic method Dispatch)
Create a Shape class as the abstract class with abstract method draw( ), its
implementation is provided by the Rectangle & Circle classes. Create a reference of
Shape class and if you create the instance of Rectangle class, draw() method of
Rectangle class will be invoked. And same for Circle class. (Dynamic Method
Dispatch)
*/
class Test {
  public static void main (String[] args) {
    Shape s = new Rectangle();
    Shape s2 = new Circle();
    
    s.draw();
    s2.draw();
  }
}
abstract class Shape {
  abstract void draw();
 
}
class Rectangle extends Shape {
   void draw() {
     System.out.println("Rectangle");
   }
 
}
class Circle extends Shape {
   void draw() {
     System.out.println("Circle");
   }
 
}

