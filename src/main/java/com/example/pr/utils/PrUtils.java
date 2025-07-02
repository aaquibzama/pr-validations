package com.example.pr.utils;

import java.util.concurrent.ThreadLocalRandom;

public class PrUtils {

  public static int divide(int dividend, int divisor) {
    return dividend/divisor;
  }

  public static int getRandomNumber() {
    boolean pickFirstRange = ThreadLocalRandom.current().nextBoolean();
    if (pickFirstRange) {
      return ThreadLocalRandom.current().nextInt(1, 101);
    } else {
      return ThreadLocalRandom.current().nextInt(20, 31);
    }
  }
}
