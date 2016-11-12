import java.util.*;

public class A {
  public static void main(String[] args) {
    // HashMap
    Map<Integer, String> mp = new HashMap<Integer, String>();
    int i = 0;
    for (String s : args) {
      mp.put(i++, s);
    }
    System.out.println(mp.size() + " map words: " + mp);

    // advanced for-loop
    for (Object o : mp.values()) {
      String element = (String) o;
    }

    //
    for (Map.Entry<Integer, String> e : mp.entrySet()) {
      String element = e.getValue();
    }
  }
}
