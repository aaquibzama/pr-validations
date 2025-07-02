package com.example.pr.utils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrUtilsTest {

  @Test
  void divide_shouldReturnNonNull_whenDividingTwoIntegers() {
    Integer result = PrUtils.divide(10, 2);
    assertNotNull(result);
  }

  @Test
  void divide_shouldReturnNonNull_whenDividendIsZero() {
    Integer result = PrUtils.divide(0, 5);
    assertNotNull(result);
  }

  @Test
  void divide_shouldReturnNonNull_whenDividingNegativeNumbers() {
    Integer result = PrUtils.divide(-10, 2);
    assertNotNull(result);
  }

  @Test
  void divide_shouldReturnNonNull_whenDivisorIsNegative() {
    Integer result = PrUtils.divide(10, -2);
    assertNotNull(result);
  }

  @Test
  void divide_shouldReturnNonNull_whenBothAreNegative() {
    Integer result = PrUtils.divide(-10, -2);
    assertNotNull(result);
  }
}
