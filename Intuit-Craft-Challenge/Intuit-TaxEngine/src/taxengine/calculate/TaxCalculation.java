package taxengine.calculate;

import taxengine.model.Form1040;


/**
 * Created by Navaneeth on 7/14/16.
 */


public class TaxCalculation {

    private float fedTax;
    private float earnedIncome;
    private float nonCombatElection;
    private float stateTax;
    private float otherTax;
    
    public void setFedTax(float fedTax) {
        this.fedTax = fedTax;
    }
    public float getFedTax() {
        return fedTax;
    }
    public void setEarnedIncome(final float earnedIncome) {
        this.earnedIncome = earnedIncome;
    }
    public float getEarnedIncome() {
        return earnedIncome;
    }
    
    public Form1040 calcGrossIncome(final Form1040 form1040) {
        double grossIncome  = form1040.getTotalSalary() + form1040.getTaxInterest() + form1040.getUnemployementCompesation();
        form1040.setGrossIncome(grossIncome);
        return form1040;
    }

    public Form1040 calcTaxOnIncome(Form1040 form1040){
        double taxOnIncome = 0;
        if(form1040.getDependantAmount() > form1040.getGrossIncome()){
            form1040.setTaxableIncome(taxOnIncome);
        }
        else{
        	taxOnIncome = form1040.getGrossIncome() - form1040.getDependantAmount();
            form1040.setTaxableIncome(taxOnIncome);
        }
        return form1040;
    }

    public Form1040 calcTotalPaymentsAndCredits(Form1040 form1040){
        form1040.setTotalPaymentsAndCredit(fedTax + earnedIncome + nonCombatElection);
        return form1040;
    }

    public Form1040 calcTotalTax(Form1040 form1040){
        form1040.setTotalTax(form1040.getTax() + form1040.getHealthCare());
        return form1040;
    }

    public Form1040 calcRefundAndAmountDue(Form1040 form1040){
        if(form1040.getTotalPaymentsAndCredit() > form1040.getTotalTax()){
            form1040.setRefund(form1040.getTotalPaymentsAndCredit() - form1040.getTotalTax());
        }
        else if(form1040.getTotalTax() > form1040.getTotalPaymentsAndCredit()){
            form1040.setDueAmount(form1040.getTotalTax() - form1040.getTotalPaymentsAndCredit());
        }
        return form1040;
    }
	public float getNonCombatElection() {
		return nonCombatElection;
	}
	public void setNonCombatElection(float nonCombatElection) {
		this.nonCombatElection = nonCombatElection;
	}
	public float getStateTax() {
		return stateTax;
	}
	public void setStateTax(float stateTax) {
		this.stateTax = stateTax;
	}
	public float getOtherTax() {
		return otherTax;
	}
	public void setOtherTax(float otherTax) {
		this.otherTax = otherTax;
	}    
}
