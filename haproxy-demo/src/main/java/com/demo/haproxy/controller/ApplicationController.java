package com.demo.haproxy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {

  private final String appId;

  @Autowired
  public ApplicationController(@Value("${appId}") String appId) {
    this.appId = appId;
  }

  @GetMapping("/")
  public String home() {
    return appId + ": Hello from Home";
  }

  @GetMapping("/endpoint1")
  public String endpoint1() {
    return appId + ": Hello from Endpoint1";
  }

  @GetMapping("/endpoint2")
  public String endpoint2() {
    return appId + ": Hello from Endpoint2";
  }

  @GetMapping("/admin")
  public String admin() {
    return appId + ": Hello from Admin";
  }
}