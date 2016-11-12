import java.util.*;

public class A {
  public static void main(String[] args) {
    // HashSet
    Deque<String> d = new ArrayDeque<String>();
    Deque<String> d2 = new LinkedList<String>();
    for (String s : args) {
      d.add(s);
    }
    System.out.println(d.size() + " deque words: " + d);

    // advanced for-loop
    for (Object o : d) {
      String element = (String) o;
    }

    //access via Iterator
    Iterator it = d.iterator();
    while(it.hasNext()) {
      String element = (String) it.next();
    }

    System.out.println(d.element());
  }
}
