//: c09:Collection1.java
// From 'Thinking in Java, 2nd ed.' by Bruce Eckel
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
// Things you can do with all Collections.
import java.util.*;
import com.bruceeckel.util.*;

public class Collection1 {
  public static void main(String[] args) {
    Collection c = new ArrayList();
    Collections2.fill(c, 
      Collections2.countries, 10);    
    c.add("ten");
    c.add("eleven");
    System.out.println(c);
    // Make an array from the List:
    Object[] array = c.toArray(); 
    // Make a String array from the List:
    String[] str = 
      (String[])c.toArray(new String[1]);
    // Find max and min elements; this means
    // different things depending on the way
    // the Comparable interface is implemented:
    System.out.println("Collections.max(c) = " +
      Collections.max(c));
    System.out.println("Collections.min(c) = " +
      Collections.min(c));
    // Add a Collection to another Collection
    Collection c2 = new ArrayList();
    Collections2.fill(c2, 
      Collections2.countries, 10);    
    c.addAll(c2);
    System.out.println(c);
    c.remove(CountryCapitals.pairs[0][0]);
    System.out.println(c);
    c.remove(CountryCapitals.pairs[1][0]);
    System.out.println(c);
    // Remove all components that are in the
    // argument collection:
    c.removeAll(c2);
    System.out.println(c);
    c.addAll(c2);
    System.out.println(c);
    // Is an element in this Collection?
    String val = CountryCapitals.pairs[3][0];
    System.out.println(
      "c.contains(" + val  + ") = " 
      + c.contains(val));
    // Is a Collection in this Collection?
    System.out.println(
      "c.containsAll(c2) = "+ c.containsAll(c2));
    Collection c3 = ((List)c).subList(3, 5);
    // Keep all the elements that are in both
    // c2 and c3 (an intersection of sets):
    c2.retainAll(c3);
    System.out.println(c);
    // Throw away all the elements 
    // in c2 that also appear in c3:
    c2.removeAll(c3);
    System.out.println("c.isEmpty() = " +
      c.isEmpty());
    c = new ArrayList();
    Collections2.fill(c, 
      Collections2.countries, 10);    
    System.out.println(c);
    c.clear(); // Remove all elements
    System.out.println("after c.clear():");
    System.out.println(c);
  }
} ///:~