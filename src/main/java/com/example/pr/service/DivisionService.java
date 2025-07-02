package com.example.pr.service;

import com.example.pr.utils.PrUtils;
import java.util.Random;
import java.util.random.RandomGenerator;
import org.springframework.stereotype.Service;

@Service
public class DivisionService {

  public int divide() {
    return PrUtils.divide(PrUtils.getRandomNumber(), PrUtils.getRandomNumber());
  }

}
