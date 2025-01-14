import java.util.ArrayList;

public class ListPractice {


  public static void main(String[] args) {
    // Create an empty ArrayList of Strings and assign it to a variable of type List
    ArrayList<String> arrList = new ArrayList<>();
    // Add 3 elements to the list (OK to do one-by-one)
    arrList.add("a");
    arrList.add("b");
    arrList.add("c");
    // Print the element at index 1
    System.out.println(arrList.get(1));

    // Replace the element at index 1 with a new value
    // (Do not insert a new value. The length of the list should not change)
    arrList.set(1, "new");

    // Insert a new element at index 0 (the length of the list will change)
    arrList.add(0,"new 2");

    // Check whether the list contains a certain string
    System.out.println(arrList.contains("a"));

    // Iterate over the list using a traditional for-loop.
    // Print each index and value on a separate line
    for(int i=0; i<arrList.size(); i++)
    {
      System.out.println(arrList.get(i));
    }

    // Sort the list using the Collections library
    arrList.sort(null);

    // Iterate over the list using a for-each loop
     // Print each value on a second line
    for (String str : arrList) {
      System.out.println();
      System.out.println(str);
    }
   

    /*
     * Usage tip!
     * 
     * Use a traditional for-loop when you need to use the index or you need to iterate in an
     * unconventional order (e.g. backwards)
     * 
     * Otherwise, if you're iterating the in the conventional order and don't need the
     * index values a for-each loop is cleaner.
     */
  }
}