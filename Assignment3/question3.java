/*
WAP to perform mathematical operation create a class called AddSub with attributes
num1 and num2 of type int, also define methods calAdd( ) and calSub( ) to calculate
addition and subtraction .Create another class MulDiv that extends AddSub class to
use member a data of super class. MulDiv should have methods calMul( ) &amp; calDiv( )
to calculate multiplication and division. A main method should access the methods
and perform operations.
*/

class AddSub {
  int num1;
  int num2;
  
  AddSub(int n1, int n2) {
    num1 = n1;
    num2 = n2;
  }
  
  void calAdd() {
    System.out.println(num1+num2);
  }
  
  void calSub() {
    System.out.println(num1-num2);
  }
}
class MulDiv extends AddSub {
  MulDiv(int n1, int n2){
    super(n1, n2);
  }
  void calMul() {
    System.out.println(num1*num2);
  }
  
  void calDiv() {
    System.out.println(num1/num2);
  }
}


class Test {
  public static void main (String[] args) {
    MulDiv obj = new MulDiv(100, 10);

    obj.calAdd();
    obj.calSub();
    obj.calMul();
    obj.calDiv();
  }
}
