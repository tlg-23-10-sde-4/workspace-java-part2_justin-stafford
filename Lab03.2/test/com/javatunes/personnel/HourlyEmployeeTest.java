package com.javatunes.personnel;

import static org.junit.Assert.*;
import java.sql.Date;
import org.junit.Before;
import org.junit.Test;


public class HourlyEmployeeTest {
    private HourlyEmployee emp;

    @Before
    public void setUp() {
        emp = new HourlyEmployee("Oliver", Date.valueOf("2022-01-03"), 50.0, 30.0);
    }

    @Test
    public void testPay() {
        assertEquals(1500.0, emp.pay(), .001);
    }

    @Test
    public void testPayTaxes() {
        assertEquals(450.0, emp.payTaxes(), .001);
    }
}