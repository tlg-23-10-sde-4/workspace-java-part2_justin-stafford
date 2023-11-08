package com.entertainment;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TelevisionTest {
    private Television tv;

    @Before
    public void setUp() {
        tv = new Television();
    }

    @Test(expected = IllegalArgumentException.class)
    public void setVolume_shouldThrowIllegalArgumentException_whenInvalid_lowerBound() {
        tv.setVolume(-1);

    @Test(expected = IllegalArgumentException.class)
    public void setVolume_shouldThrowIllegalArgumentException_whenInvalid_upperBound() {
           try {
               tv.setVolume(101);   //this should throw IllegalArgumentException
           fail("Shoud have thrown");
           }
           catch (IllegalArgumentException e) {
               assertEquals("Invalid volume: 101. Allowed range: [0, 100].", e.getMessage());
       }

    }

        @Test
    public void setVolume_shouldStoreValue_whenValid() {
        Television tv = new Television();
        tv.setVolume(0);
        assertEquals(0, tv.getVolume());
    }

    @Test
    public void setVolume_shouldStoreValue_whenValid_upperBound() {
        tv.setVolume(100);
        assertEquals(100, tv.getVolume());
    }
}