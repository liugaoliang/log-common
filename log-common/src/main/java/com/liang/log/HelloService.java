package com.liang.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloService {
  
  private static final Logger logger = LoggerFactory.getLogger(HelloService.class);
  
  public String service(String name) {
    logger.info("receive message {}", name);
    return "hello," + name;
  }
  
  public static void main(String[] args) {
    HelloService service = new HelloService();
    String result = service.service("liang");
    logger.info(result);
  }

}
