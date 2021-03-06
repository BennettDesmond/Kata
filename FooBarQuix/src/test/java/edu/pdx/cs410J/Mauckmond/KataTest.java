package edu.pdx.cs410J.Mauckmond;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;

public class KataTest
{

  @Test
  void canInstantiateKataClass() {
    new Kata();
  }

  @Test
  void divisibleByThree() {
    assertThat(Kata.compute("3"), containsString("Foo"));
    assertThat(Kata.compute("6"), containsString("Foo"));
    assertThat(Kata.compute("9"), containsString("Foo"));
    assertThat(Kata.compute("15"), containsString("Foo"));
    assertThat(Kata.compute("21"), containsString("Foo"));
    assertThat(Kata.compute("105"), containsString("Foo"));
  }

  @Test
  void divisibleByFive() {
    assertThat(Kata.compute("5"), containsString("Bar"));
    assertThat(Kata.compute("40"), containsString("Bar"));
    assertThat(Kata.compute("15"), containsString("Bar"));
    assertThat(Kata.compute("35"), containsString("Bar"));
    assertThat(Kata.compute("105"), containsString("Bar"));
  }

  @Test
  void divisibleBySeven() {
    assertThat(Kata.compute("7"), containsString("Qix"));
    assertThat(Kata.compute("14"), containsString("Qix"));
    assertThat(Kata.compute("21"), containsString("Qix"));
    assertThat(Kata.compute("35"), containsString("Qix"));
    assertThat(Kata.compute("105"), containsString("Qix"));
  }

  @Test
  void containsButIsNotDivisibleByThree() {
    assertThat(Kata.compute("23"), containsString("Foo"));
    assertThat(Kata.compute("43"), containsString("Foo"));
    assertThat(Kata.compute("53"), containsString("Foo"));
    assertThat(Kata.compute("73"), containsString("Foo"));
    assertThat(Kata.compute("133"), containsString("Foo"));
  }

  @Test
  void containsFive() {
    assertThat(Kata.compute("5"), containsString("Bar"));
    assertThat(Kata.compute("15"), containsString("Bar"));
    assertThat(Kata.compute("35"), containsString("Bar"));
    assertThat(Kata.compute("55"), containsString("Bar"));
  }

  @Test
  void containsButIsNotDivisibleBySeven() {
    assertThat(Kata.compute("71"), containsString("Qix"));
    assertThat(Kata.compute("17"), containsString("Qix"));
    assertThat(Kata.compute("27"), containsString("Qix"));
    assertThat(Kata.compute("75"), containsString("Qix"));
    assertThat(Kata.compute("177"), containsString("Qix"));
  }

  @Test
  void checkComputeResultsOrder() {
    assertEquals("Foo", Kata.compute("6"));
    assertEquals("Bar", Kata.compute("10"));
    assertEquals("Qix", Kata.compute("14"));
  }
}
