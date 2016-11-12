import java.util.*;

public class A {
  public static void main(String[] args) {
    // HashSet
    List<String> l = new ArrayList<String>();
    List<String> l2 = new Vector<String>();
    for (String s : args) {
      l.add(s);
    }
    System.out.println(l.size() + " list words: " + l);

    // advanced for-loop
    for (Object o : l) {
      String element = (String) o;
    }

    //access via Iterator
    Iterator it = l.iterator();
    while(it.hasNext()) {
      String element = (String) it.next();
    }

    //legacy for-loop
    for (int i = 0; i < l.size(); ++i) {
      String element = l.get(i);
    }
    
  }
}
