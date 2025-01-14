import java.util.HashSet;
import java.util.Set;

public class SetPractice {
  public static void main(String[] args) {
    // Create a HashSet of Strings and assign it to a variable of type Set
    Set<String> strSet = new HashSet<>();

    // Add 3 elements to the set
    // (It's OK to do it one-by-one)
    strSet.add("1");
    strSet.add("2");
    strSet.add("3");

    // Check whether the Set contains a given String
    strSet.contains("1");
    // Remove an element from the Set
    strSet.remove("2");
    // Get the size of the Set
    strSet.size();
    // Iterate over the elements of the Set, printing each one on a separate line
    for (String strs : strSet) {
      System.out.println(strs);
    }
    /*
     * Warning!
     * 
     * The iteration order over the items in a HashSet is NOT GUARANTEED.
     * 
     * Even running the exact same program multiple times may give different results.
     * Do not use a HashSet if order is important! You can use a TreeSet if you
     * want items in sorted order, or an array or List if you want them in a specified
     * order.
     * 
     * Also remember that sets do NOT have duplicates.
     */
  }
}
