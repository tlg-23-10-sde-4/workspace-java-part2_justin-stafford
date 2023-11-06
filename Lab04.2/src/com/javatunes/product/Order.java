/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.javatunes.product;

import java.util.Collection;

public class Order {
  private String id;
  
  public Order(String id) {
    this.id = id;
  }
  
  /**
   * get the items from the cart and iterate over them, print each item's product code
   * get cart total and print
   */
  public void processCart(ShoppingCart<? extends Product> cart) {  // shopping cart of anything as long as it IS-A product
    System.out.println("Order " + getId() + ": contains the following products:");

    for (Product product : cart.allItems()) {   // calling a method on right side of code
      System.out.println(product.getCode());
    }
    System.out.println("Order Total: " + cart.total());
    
  }
  
  public String getId() {

    return id;
  }
}