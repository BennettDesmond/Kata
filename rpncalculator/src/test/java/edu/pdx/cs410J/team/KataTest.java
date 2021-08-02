package edu.pdx.cs410J.team;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.function.Consumer;
import java.util.function.Function;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Disabled;

public class KataTest
{

  @Test
  void canInstantiateKataClass() {
    new Kata();
  }

  @Test
  void canDoSimpleArithmetic() {
    int result = Kata.parseAndRunRPN(new String[]{"3", "6", "+"});
    assertEquals(3 + 6, result);
  }

  @Test
  void canDoSimpleSubtraction() {
    int result = Kata.parseAndRunRPN(new String[]{"5", "2", "-"});
    assertEquals(5 - 2, result);
  }

  @Test
  void canDoSimpleMultiply() {
    int result = Kata.parseAndRunRPN(new String[]{"10", "2", "*"});
    assertEquals(20, result);
  }

  @Test
  void testProvidedCases() {
    // Case 01
    int result01 = Kata.parseAndRunRPN(new String[]{"20", "5", "/"});
    assertEquals(4, result01);

    // Case 02
    int result02 = Kata.parseAndRunRPN(new String[]{"4", "2", "+", "3", "-"});
    assertEquals(3, result02);

    // Case 03
    int result03 = Kata.parseAndRunRPN(new String[]{"3", "5", "8", "*", "7", "+", "*"});
    assertEquals(141, result03);
  }

  @Test
  void testTheRegexValidator() {
    boolean result01 = Kata.validateInts("0");
    assertEquals(false, result01);
    boolean result02 = Kata.validateInts("01");
    assertEquals(false, result02);
    boolean result03 = Kata.validateInts("5");
    assertEquals(true, result03);
    boolean result04 = Kata.validateInts("10");
    assertEquals(true, result04);
    boolean result05 = Kata.validateInts("500");
    assertEquals(true, result05);
    boolean result06 = Kata.validateInts("Hello World");
    assertEquals(false, result06);
  }

  @Disabled
  @Test
  void divideByZero() {
    //
//    assertThrows(() -> Kata.parseAndRunRPN(new String[]{"5", "0", "/"}));
  }
}
