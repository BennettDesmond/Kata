package edu.pdx.cs410J.Mauckmond;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {
                                                                                    

  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
    System.exit(1);
  }

  public static String compute(String str) {
    String returnStr = str;
    if((Integer.parseInt(str) % 3) == 0) {
      returnStr = "Foo";
    }
    return returnStr;
  }
}