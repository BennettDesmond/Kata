package edu.pdx.cs410J.team;

import java.util.Collection;
import java.util.HashMap;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


// Zac Evanchak was here :)
/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {
  private static HashMap<String, ArthOperator> operatorFunctionMap = new HashMap() {{
    Kata kata = new Kata();
    put("+", new ArthOperator() { public int perform(int left, int right) { return left + right; } });
    put("-", new ArthOperator() { public int perform(int left, int right) { return left - right; } });
    put("*", new ArthOperator() { public int perform(int left, int right) { return left * right; } });
    put("/", new ArthOperator() { public int perform(int left, int right) { return left / right; } });
  }};

//Hi
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
    int result = parseAndRunRPN(args);
    System.exit(1);
  }

  public static int parseAndRunRPN(String[] args) {

    Stack<Integer> integerStack = new Stack<Integer>();
    int intermediateValue = 0;

    for (int i = 0; i < args.length; i++)
    {
      if (validateInts(args[i])) {
        integerStack.push(Integer.parseInt(args[i]));
      }
      else {
        int right = integerStack.pop();
        int left = integerStack.pop();
      }
    }



    int int1 = Integer.parseInt(args[0]);
    int int2 = Integer.parseInt(args[1]);
    return operatorFunctionMap.get(args[2]).perform(int1, int2);
  }

  private interface ArthOperator {
    int perform(int left, int right);
  }

  public static boolean validateInts(String possibleInt) {
    String regex = "^[0-9][0-9]*$";
    Pattern p = Pattern.compile(regex);
    Matcher m = p.matcher(possibleInt);
    return m.matches();
  }

}