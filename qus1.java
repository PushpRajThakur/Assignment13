import java.util.*;
 class qus1 {
  public static void main(String[] args) {
     
        HashSet<String> h1 = new HashSet<String>();
          h1.add("C");
          h1.add("C++");
          h1.add("JAVA");
          h1.add("PYTHON");
          System.out.println("First HashSet : "+h1);
          HashSet<String>h2 = new HashSet<String>();
          h2.add("RUBY");
          h2.add("JAVA");
          h2.add("JAVASCRIPT");
          h2.add("C++");
          System.out.println("Second HashSet : "+h2);
          h1.retainAll(h2);
          System.out.print("HashSet :");
          System.out.print(h1);
     }
}