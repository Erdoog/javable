package javable.task02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import javable.task02.FizzBuzz;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

  @Test
  void FizzBuzzForFour() {
    FizzBuzz fb = new FizzBuzz();
    assertEquals("1\n2\nfizz\n4", fb.fizzbuzz(4));
  }

  @Test
  void FizzBuzzForZeroShouldBeEmpty() {
    FizzBuzz fb = new FizzBuzz();
    assertEquals("", fb.fizzbuzz(0));
  }

  @Test
  void FizzBuzzForNegativeShouldThrowError() {
    assertThrows(
        IllegalArgumentException.class,
        () -> new FizzBuzz().fizzbuzz(-1));
  }

  @Test
  void FizzBuzzForSixteen() {
    FizzBuzz fb = new FizzBuzz();
    assertEquals("1\n2\nfizz\n4\nbuzz\nfizz\n7\n8\nfizz\nbuzz\n11\nfizz\n13\n14\nfizzbuzz\n16"
        , fb.fizzbuzz(16));
  }

  @Test
  void FizzBuzzForZero() {
    FizzBuzz fb = new FizzBuzz();
    assertEquals("", fb.fizzbuzz(0));
  }

}