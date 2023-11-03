/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.javatunes.personnel;

import java.sql.Date;
import java.util.Objects;

public class SalariedEmployee extends Employee {
  private static final double SALARIED_TAX_RATE = 0.30;  // The tax rate constant, should match the test
  private Double salary;

  public SalariedEmployee() {
    }

  public SalariedEmployee(String name, Date hireDate) {
      super(name, hireDate);
    }
  
  public SalariedEmployee(String name, Date hireDate, Double salary) {
      this(name, hireDate);
      setSalary(salary);
    }

    @Override
    public double pay () {
      System.out.println(getName() + " is paid a huge salary of  " + getSalary());
      return getSalary();
    }

    @Override  // interface TaxPayer
    public double payTaxes () {
      double taxes = SALARIED_TAX_RATE * getSalary();
      System.out.println(getName() + " paid taxes of " + taxes);
      return taxes;
    }

    public Double getSalary () {
      return this.salary;
    }
    public void setSalary (Double salary){
      this.salary = salary;
    }

    // leverage super.toString() for classname, name, and hireDate
    @Override
    public String toString () {
      return super.toString() + ", salary=" + getSalary();
    }

    // leverage super.equals() for name, hireDate equality, check salary here
    @Override
    public boolean equals (Object obj){
      boolean result = false;
      if (obj instanceof SalariedEmployee) {
        SalariedEmployee other = (SalariedEmployee) obj;
        result = super.equals(obj) &&
                Objects.equals(this.getSalary(), other.getSalary());
      }
      return result;
    }

    // take the hash of superclass (name, hireDate) and add salary to the mix
    @Override
    public int hashCode () {
      return Objects.hash(super.hashCode(), getSalary());
    }
  }