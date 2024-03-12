/*
Define a class University having instance variable uname, ucity and tot_stud.
Define parameterized constructor to initialize instance variable. Define derived
class Department having instance variable deptno and deptname. Define
parameterized constructor to initialize instance variable. Also define display()
method to display all information. Create two objects and demonstrate.
*/

class University {
  String uname;
  String ucity;
  int tot_stud;
  
  University(String n, String c, int t) {
    uname = n;
    ucity = c;
    tot_stud = t;
  }
}

class Department extends University {
  String dname;
  int deptno;
  
  Department(String n, String c, int t,String nm, int no) {
    // super keyword refers to super class
    super(n,c,t);
    dname = nm;
    deptno = no;
  }
  
  void display() {
    System.out.println(uname);
    System.out.println(ucity);
    System.out.println(tot_stud);
    System.out.println(dname);
    System.out.println(deptno);
  }
}

class Test {
  public static void main (String[] args) {
    Department d = new Department("Atmiya", "Rajkot", 100, "BCA", 10);
    Department d1 = new Department("Marwadi", "Jamnagar", 150, "BBA", 15);
    
    d.display();
    d1.display();
  }
}
