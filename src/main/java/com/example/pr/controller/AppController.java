package com.example.pr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

  @GetMapping("/flag")
  public boolean getFlag() {
    return true;
  }
}
