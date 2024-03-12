/*
Write a program to do the following using in-built methods in the string class of java.
*/

class Test {
  public static void main (String[] args) {
    // a. Find the 3rd character in the string "Atmiya University"
    String str1 = "Atmiya University";
    char c= str1.charAt(3);
    System.out.println(c);
    
    // b. Find the index of character ‘o’ in string "Java Programming".
    String str2 = "Java Programming";
    int ind= str2.indexOf('o');
    System.out.println(ind);
    
    // c. Convert the string "Enjoy Holiday" to uppercase.
    String str3 = "Enjoy Holiday";
    System.out.println(str3.toUpperCase());
    
    // d. Replace character 'H' with 'n' in the string "Hello… Hi..".
    String str4 = "Hello… Hi..";
    System.out.println(str4.replace('H', 'n'));
  }
}
