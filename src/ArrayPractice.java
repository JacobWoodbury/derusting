public class ArrayPractice {
  public static void main(String[] args) {
    // Create an array of Strings of size 4
    String[] arr = new String[4];

    // Set the value of the array at each index to be a different String
    // It's OK to do this one-by-one
    arr[0] = "A";
    arr[1] = "B";
    arr[2] = "C";
    arr[3] = "D";
    // Get the value of the array at index 2
    System.out.println(arr[2]);

    // Get the length of the array
    System.out.println(arr.length);

    // Iterate over the array using a traditional for loop and print out each item
    for(int i=0; i<arr.length; i++)
    {
      System.out.println(arr[i]);
    }
    // Iterate over the array using a for-each loop and print out each item
    for (String str : arr) {
      System.out.println(str);
    }
    /*
     * Reminder!
     * 
     * Arrays start at index 0
     */
  }
}
