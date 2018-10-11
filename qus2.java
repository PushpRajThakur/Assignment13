import java.util.*;
class qus2 {
  public static void main(String args[]) {
  HashMap<Integer,String> h= new HashMap<Integer,String>();
  h.put(1, "C");
  h.put(2, "C++");
  h.put(3, "JAVA");
  h.put(4, "Python");
  h.put(5, "JAVASCRIPT");

   for(Map.Entry x:h.entrySet()){
   System.out.println(x.getKey()+" "+x.getValue());
}
}
}