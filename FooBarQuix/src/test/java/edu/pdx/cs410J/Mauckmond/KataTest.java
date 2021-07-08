package edu.pdx.cs410J.Mauckmond;

import org.junit.jupiter.api.Test;

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
  }

}
