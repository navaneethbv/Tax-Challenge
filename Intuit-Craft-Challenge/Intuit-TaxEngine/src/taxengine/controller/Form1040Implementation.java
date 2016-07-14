package taxengine.controller;

import taxengine.calculate.TaxCalculation;
import taxengine.model.Form1040;

/**
 * Created by Navaneeth on 7/14/16.
 */
public class Form1040Implementation {

    private TaxCalculation taxCalc;

    public void setTaxCalc(final TaxCalculation taxCalc) {
        this.taxCalc = taxCalc;
    }

    public Form1040 calculateTax(final Form1040 form1040) {
        Form1040 form1040EZ = (Form1040) form1040;
        form1040EZ = taxCalc.calcGrossIncome(form1040EZ);
        form1040EZ = taxCalc.calcTaxOnIncome(form1040EZ);
        form1040EZ = taxCalc.calcTotalPaymentsAndCredits(form1040EZ);
        form1040EZ = taxCalc.calcTotalTax(form1040EZ);
        form1040EZ = taxCalc.calcRefundAndAmountDue(form1040EZ);
        return form1040EZ;
    }
}
