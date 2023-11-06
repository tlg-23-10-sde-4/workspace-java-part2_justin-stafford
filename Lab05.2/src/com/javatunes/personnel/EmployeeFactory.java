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
import java.util.Map;

public class EmployeeFactory {
  
  // prevent direct instantiation - this is an all-static factory class
  private EmployeeFactory() {
  }
  
  /**
   * TODO: given the input map, create and return the correct object (with its properties set).
   * If the input map's "type" value is not "HE" or "SE", throw IllegalArgumentException with a suitable message.
   * this is an abstract class so  its not creating a new employee
   */
  public static Employee createEmployee(Map<String,String> inputMap) throws IllegalArgumentException {
    // return value
    Employee emp = null;

    // read the "indicator" of the type of employee
    String type = inputMap.get("type");

    if (!"SE".equals(type) &&!"HE".equals(type)) {
      throw new IllegalArgumentException("Invalid employee type: " + type + ".  Must be 'SE' or 'HE'.");
    }

    String name = inputMap.get("name");
    Date hireDate = Date.valueOf(inputMap.get("hireDate"));
    // 3 scenerios: if-else, if-else.  Its an HE, SE or something else
    if ("SE".equals(type)) {
      Double salary = Double.valueOf(inputMap.get("salary"));
      emp = new SalariedEmployee(name, hireDate, salary);
    }
    else  {
      //TODO: refactor repeated code to use instanceof or check its Class object (preferred):
      Double rate = Double.valueOf(inputMap.get("rate"));
      Double hours = Double.valueOf(inputMap.get("hours"));
      emp = new HourlyEmployee(name, hireDate, rate, hours);
    }
     return emp;
  }
}