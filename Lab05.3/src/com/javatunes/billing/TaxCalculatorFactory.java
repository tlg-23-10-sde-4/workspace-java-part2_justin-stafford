package com.javatunes.billing;

public class TaxCalculatorFactory {

    // prevent instantiation from outside, this is an allstatic class
    private TaxCalculatorFactory() {
    }

    // Consider implementing a "cache" of TaxCalculator objects.
    // these objects are stateless and thread-safe.

    public static TaxCalculator getTaxCalculator(Location location) {
        TaxCalculator calc = null;

        switch (location) {
            case ONLINE:
                calc = new OnlineTax();
                break;
            case EUROPE:
                calc = new EuropeTax();
                break;
            case USA:
                calc = new USATax();
          }
          return calc;
    }


    }
