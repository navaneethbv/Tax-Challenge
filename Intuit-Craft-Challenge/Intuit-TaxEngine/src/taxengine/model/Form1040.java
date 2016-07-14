package taxengine.model;

/**
 * Created by Navaneeth on 7/14/16.
 */
public class Form1040 {
	
    private String fname;
    private String lname;    
    private double totalSalary;
    private double taxInterest;
    private double unemploymentCompensation;
    private double grossIncome;
    private double dependantAmount;
    private double nonCombatPay;
    private double taxableIncome;
    private double fedTax;
    private double earnedIncomeCredit;
    private double totalPaymentsAndCredit;
    private double tax;
    private double healthCare;
    private double totalTax;
    private double refund;
    private double dueAmount;
	

    public void setTotal(final double totalSalary) {
        this.totalSalary = totalSalary;
    }

    public void setTaxableInterest(final double taxInterest) {
        this.taxInterest = taxInterest;
    }

    public void setUnemployementCompensation(final double unemployementCompesation) {
        this.unemploymentCompensation = unemployementCompesation;
    }

    public void setGrossIncome(final double grossIncome) {
        this.grossIncome = grossIncome;
    }

    public void setDependantAmount(final double dependantAmount) {
        this.dependantAmount = dependantAmount;
    }

    public void setTaxableIncome(final double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    public void setFederalIncomeTax(final double fedTax) {
        this.fedTax = fedTax;
    }

    public void setEarnedIncomeCredit(final double earnedIncomeCredit) {
        this.earnedIncomeCredit = earnedIncomeCredit;
    }

    public void setTotalPaymentsAndCredit(final double totalPaymentsAndCredit) {
        this.totalPaymentsAndCredit = totalPaymentsAndCredit;
    }

    public void setTax(final double tax) {
        this.tax = tax;
    }

    public void setHealthCare(final double healthCare) {
        this.healthCare = healthCare;
    }

    public void setTotalTax(final double totalTax) {
        this.totalTax = totalTax;
    }

    public void setRefund(final double refund) {
        this.refund = refund;
    }

    public void setDueAmount(final double dueAmount) {
        this.dueAmount = dueAmount;
    }

    public double getTotalSalary() {
        return totalSalary;
    }

    public double getTaxInterest() {
        return taxInterest;
    }

    public double getUnemployementCompesation() {
        return unemploymentCompensation;
    }

    public double getGrossIncome() {
        return grossIncome;
    }

    public double getDependantAmount() {
        return dependantAmount;
    }

    public double getTaxableIncome() {
        return taxableIncome;
    }

    public double getFederalIncomeTax() {
        return fedTax;
    }

    public double getEarnedIncomeCredit() {
        return earnedIncomeCredit;
    }

    public double getTotalPaymentsAndCredit() {
        return totalPaymentsAndCredit;
    }

    public double getTax() {
        return tax;
    }

    public double getHealthCare() {
        return healthCare;
    }

    public double getTotalTax() {
        return totalTax;
    }

    public double getRefund() {
        return refund;
    }

    public double getDueAmount() {
        return dueAmount;
    }

    public void setFirsName(final String fname) {
        this.fname = fname;
    }

    public void setLastName(final String lname) {
        this.lname = lname;
    }

    public void setUnemploymentCompensation(final double unemploymentCompensation) {
        this.unemploymentCompensation = unemploymentCompensation;
    }

    public void setAmountRelatedMaritalStatus(final double dependantAmount) {
        this.dependantAmount = dependantAmount;
    }

    public String getFirsName() {
        return fname;
    }

    public String getLastName() {
        return lname;
    }

    public double getUnemploymentCompensation() {
        return unemploymentCompensation;
    }

	public double getNonCombatPay() {
		return nonCombatPay;
	}

	public void setNonCombatPay(double nonCombatPay) {
		this.nonCombatPay = nonCombatPay;
	}
}
