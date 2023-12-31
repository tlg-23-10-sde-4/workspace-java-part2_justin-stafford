/*
 * This code is sample code, provided AS-IS, and we make NO
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.javatunes.thread;

// TODO: extend the Thread class
public class MessagePrinter extends Thread {
  private String message;
  private int count = 10;
  private long interval = 1000;
  
  public MessagePrinter(String message) {
    this.message = message;
        // TODO: set the thread name [important when debugging]
    setName("Message Printer");
  }
  public MessagePrinter(String message, long interval, int count) {
    this.message = message;
    this.interval = interval;
    this.count = count;
        // TODO: set the thread name [important when debugging]
    setName("Message Printer");
  }
  /**
   * TODO: implement run() as follows:
   * It should loop 10 times, printing the 'message' field to stdout,
   * then pausing for some interval (in millis) that you choose.
   * 
   * Use a try/catch to call Thread.sleep(interval) for the pause.
   * The sleep() method throws InterruptedException, which you need to catch.
   * You can either leave the catch block empty, or print the exception to stdout.
   */
  @Override
  public void run() {
    for (int i = 0; i < count; i++) {
      System.out.println(message);
      try {
        Thread.sleep(interval);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    
  }
}