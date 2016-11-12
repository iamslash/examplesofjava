import java.util.*;

public class A {
  public static void main(String[] args) {
    // HashSet
    Queue<String> q = new LinkedList<String>();
    for (String s : args) {
      q.add(s);
    }
    System.out.println(q.size() + " queue words: " + q);

    // advanced for-loop
    for (Object o : q) {
      String element = (String) o;
    }

    //access via Iterator
    Iterator it = q.iterator();
    while(it.hasNext()) {
      String element = (String) it.next();
    }

    System.out.println(q.element());
  }
}
