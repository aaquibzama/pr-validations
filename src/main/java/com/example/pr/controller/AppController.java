package com.example.pr.controller;

import com.example.pr.service.DivisionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AppController {
  private final DivisionService divisionService;

  @GetMapping("/flag")
  public int getFlag() {
    return divisionService.divide();
  }
}
