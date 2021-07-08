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
    String returnStr = "";

    // When divisible by 3 add "Foo"
    if((Integer.parseInt(str) % 3) == 0) {
      returnStr += "Foo";
    }

    // When divisible by 5 add "Bar"
    if((Integer.parseInt(str) % 5) == 0) {
      returnStr += "Bar";
    }

    // When divisible by 7 add "Qix"
    if((Integer.parseInt(str) % 7) == 0) {
      returnStr += "Qix";
    }

    // If no substitutions where made, then just return the initial string.
    if(returnStr == "") {
      returnStr = str;
    }

    //Check to see if the string contains 3, 5, or 7
    for(int i = 0; i < str.length(); i++) {
      if(str.charAt(i) == '3') {
        returnStr += "Foo";
      } else if(str.charAt(i) == '5') {
        returnStr += "Bar";
      } else if(str.charAt(i) == '7') {
        returnStr += "Qix";
      }
    }

    return returnStr;
  }
}