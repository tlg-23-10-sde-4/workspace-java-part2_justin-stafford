package com.javatunes.personnel;

import com.javatunes.personnel.Employee;
import com.javatunes.personnel.SalariedEmployee;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.sql.Date;


public class EmployeeTest {
    private Employee emp1;
    private Employee emp2;

    @Before
    public void setUp() {
//        emp1 = new SalariedEmployee("Mary Lou", Date.valueOf("1990-01-01"));
//        emp2 = new SalariedEmployee("Mary Lou", Date.valueOf("2000-01-01"));

        emp1 = getEmployee();
        emp2 = getEmployee();
    }

    private Employee getEmployee() {
        return new Employee("Mary Lou", Date.valueOf("1999-09-09")) {
            public double pay() {return 0;}
            public double payTaxes() {return 0;}
        };
    }


            @Test
            public void equals_shouldReturnFalse_differentName_sameHireDate() {
                emp2.setName("James");
                assertNotEquals(emp1, emp2);

            }

            @Test
            private void equals_shouldReturnFalse_sameName_differentHiredate() {
                emp2.setHireDate(Date.valueOf("1990-01-02"));
                assertNotEquals(emp1, emp2);
            }

            @Test
            public void shouldReturnTrue_allPropertiesSame() {
                assertEquals(emp1, emp1);
            }

            //NAME, MEMBER-LEVEL INNER CLASSES
            private class DummyEmployee extends Employee {

                public DummyEmployee(String name, Date hireDate) {
                    super(name, hireDate);
                }

                public double pay() {
                    return 0;
                }

                public double payTaxes() {
                    return 0;
                }
            }

        }
