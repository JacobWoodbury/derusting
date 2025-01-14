import java.util.ArrayList;

public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable
    String str = "12345";

    // Find the length of the string
    str.length();

    // Concatenate (add) two strings together and reassign the result
    str = str + "hi";

    // Find the value of the character at index 3
    str.charAt(3);

    // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)
    str.contains("45");

    // Iterate over the characters of the string, printing each one on a separate line
    for(int i=0; i<str.length();i++){
      System.out.println(str.charAt(i));
    }

    // Create an ArrayList of Strings and assign it to a variable
    ArrayList<String> strList = new ArrayList<>();

    // Add multiple strings to the List (OK to do one-by-one)
    strList.add("aa");
    strList.add("bb");
    strList.add("cc");


    // Join all of the strings in the list together into a single string separated by commas
    // Use a built-in method to achieve this instead of using a loop
    String s = String.join("", strList);

    

    // Check whether two strings are equal
      if(str.equals(strList.get(0))){
        //do stuff
      }
    /*
     * Reminder!
     * 
     * When comparing objects in Java we typically want to use .equals, NOT ==.
     * 
     * We use == when comparing primitives (e.g. int or char).
     */
  }
}
