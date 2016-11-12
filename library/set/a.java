import java.util.*;

public class A {
  public static void main(String[] args) {
    // HashSet
    Set<String> s = new HashSet<String>();
    for (String a : args)
      s.add(a);
    System.out.println(s.size() + " distinct words: " + s);

    //access via new for-loop
    for (Object o : s) {
      String element = (String) o;
    }

    //access via Iterator
    Iterator it = s.iterator();
    while(it.hasNext()) {
      String element = (String) it.next();
    }

  }
}
