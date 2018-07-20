package com.liang.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Serd {
  
private static final Logger logger = LoggerFactory.getLogger(Serd.class);
  
  public String service(String name) {
    logger.info("receive message {}", name);
    return "hello," + name;
  }
  
  public static void main(String[] args) {
    Serd service = new Serd();
    String result = service.service("liang");
    logger.info(result);
    logger.info(result);
    logger.info(result);
  }

}
