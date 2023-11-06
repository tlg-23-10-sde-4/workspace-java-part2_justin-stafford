/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.javatunes.product;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ShoppingCart<T extends Product> {  // holds its contents as a collection of class types
  // storage for the cart's contents
  private final Collection<T> items = new ArrayList<T>();  // diamond not used here just to emphasize the T
  // at runtime <T> collection will be shopping cart of music item, or media player, or product item
  // shopping cart IS-A product, media player IS-A product

  public double total() {
    double result = 0.0;

    for (T item : items) {
      result += item.getPrice();  // as soon as you write ShoppingCart<T extends product> .getPrice() is good.
    }  // page 139
    return result;
  }


  public Collection<T> allItems() {
    return Collections.unmodifiableCollection(items);  // read only view of items in list.

  }


  public int size() {
    return items.size();
  }

  public void addItem(T item) {
    items.add(item);
  }
  
  public void removeItem(T item) {
    items.remove(item);
  }
}