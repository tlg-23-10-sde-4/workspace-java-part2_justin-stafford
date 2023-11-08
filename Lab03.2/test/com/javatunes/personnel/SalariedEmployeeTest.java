package com.javatunes.personnel;

import org.junit.Before;
import org.junit.Test;
import java.sql.Date;
import static org.junit.Assert.*;


public class SalariedEmployeeTest {
    private static final double SALARY_TAX_RATE = 0.30;
    // fixture -> business object(s) under test case
    private SalariedEmployee emp;

    @Before
    public void setUp() {
        emp = new SalariedEmployee("Aaron", Date.valueOf("2021-06-30"), 5000.0);
   }

   @Test
    public void testPay() {
        assertEquals(5000.0, emp.pay(), 0.001);
    }

   @Test
    public void testPayTaxes() {
      assertEquals(1500.0, emp.payTaxes(), 0.001);
   }





}