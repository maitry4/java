/*
Define a class University having instance variable uname, ucity and tot_stud.
Define getUni() method to initialize instance variable. Define derived class
Department having instance variable deptno and deptname. Define getDept()
method to initialize instance variable. Also define display() method to display all
information. Create two objects and demonstrate.
*/

class University {
  String uname;
  String ucity;
  int tot_stud;
  
  void getUni(String n, String c, int t) {
    uname = n;
    ucity = c;
    tot_stud = t;
  }
}

class Department extends University {
  String dname;
  int deptno;
  
  void getDept(String n, int no) {
    dname = n;
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
    Department d = new Department();
    Department d1 = new Department();
    
    d.getUni("Atmiya", "Rajkot", 100);
    d1.getUni("Marwadi", "Jamnagar", 150);
    d.getDept("BCA", 10);
    d1.getDept("BBA", 15);
    
    d.display();
    d1.display();
  }
}
