/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.entertainment.catalog;

import static org.junit.Assert.*;
import java.util.Collection;
import java.util.Map;

import org.junit.Test;
import com.entertainment.Television;

public class CatalogTest {

  @Test
  public void findByBrands_shouldReturnPopulatedMap_brandsPassed() {
    Map<String,Collection<Television>> tvMap = Catalog.findByBrands("Sony", "Zenith", "RCA");

    assertEquals(3, tvMap.size());
    Collection<Television> sonyTvs = tvMap.get("Sony");
    for (Television tv : sonyTvs) {
      assertEquals("Sony", tv.getBrand());
    }
    Collection<Television> zenithTvs = tvMap.get("Zenith");
    for (Television tv : zenithTvs) {
      assertEquals("Zenith", tv.getBrand());
    }
    Collection<Television> rcaTvs = tvMap.get("RCA");
    for (Television tv : rcaTvs) {
      assertEquals("RCA", tv.getBrand());
    }
  }

  @Test
  public void findByBrands_shouldReturnEmptyMap_noBrandsPassed() {
    Map<String,Collection<Television>> tvMap = Catalog.findByBrands();
    assertTrue(tvMap.isEmpty());
    assertEquals(0, tvMap.size());
  }

  public void findByBrand_shouldReturnEmptyCollection_brandFound() {
    Collection<Television> tvs = Catalog.findByBrand("Sony");

    assertEquals(7, tvs.size());

    for (Television tv : tvs) {
      assertEquals("Sony", tv.getBrand());
    }
  }
  
  /**
   * Contract: a no-matches result should be an empty collection (not null).
   */
  @Test
  public void findByBrand_shouldReturnEmptyCollection_brandNotFound() {
    Collection<Television> tvs = Catalog.findByBrand("NO-MATCHES");
    // assertNotNull(tvs);
    assertTrue(tvs.isEmpty());
  }
}