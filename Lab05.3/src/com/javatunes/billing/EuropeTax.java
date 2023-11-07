/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.javatunes.billing;

/**
 * European orders are taxed as follows:
 *  VAT is 17% of taxable amount.
 *  Luxury tax is an additional 25% on amount over $100.
 *  
 * TODO: implement this algorithm.
 */
public class EuropeTax implements TaxCalculator {
    private static final double VATrate = 0.17;
    private static final double luxuryRate = 0.25;
    private static final double luxuryMargin = 100.0;

    public double taxAmount(double taxableAmount) {
        double vat = taxableAmount * VATrate;  // find my VAT tax
        double luxuryTax = 0;  //assume no luxury tax

        //but if there is a luxury tax...
        if (taxableAmount > luxuryMargin) {    // from my example of 101. luxuryTax = 101 - 100 = $1
            luxuryTax = (taxableAmount - luxuryMargin) * luxuryRate;  // then $1 * .25 = .25
        }
        return vat + luxuryTax;  // should be $17 + .25 = $17.25
    }
}
