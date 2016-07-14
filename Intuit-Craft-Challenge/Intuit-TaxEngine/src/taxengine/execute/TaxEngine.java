package taxengine.execute;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import taxengine.controller.Form1040Implementation;
import taxengine.model.Form1040;

/**
 * Created by Navaneeth on 7/14/16.
 */

public class TaxEngine {
	
	static {
	      System.setProperty("org.apache.commons.logging.Log",
	                         "org.apache.commons.logging.impl.NoOpLog");
	   }

    public static void main(String args[]){

        
		Scanner scanIn = new Scanner(System.in);

        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:Configuration_Files/SpringFramework-config.xml");

        Form1040Implementation form1040Implementation = (Form1040Implementation) context.getBean("form1040Implementation");
        
        String fName_Initial = "";
        String lname = "";
        double salary = 0.0;
        double interest = 0.0;
        double unemploymentCompensation = 0.0;
        double dependantAmount = 0.0;
        double healthCareAmount = 0.0;

        System.out.println("Please enter your first name and initial: ");
        fName_Initial = scanIn.nextLine();

        System.out.println("Please enter your last name: ");
        lname = scanIn.nextLine();

        System.out.println("Please enter you Wages, Salaries and Tips: ");
        salary = scanIn.nextDouble();

        System.out.println("Please enter the taxable interest: ");
        interest = scanIn.nextDouble();
        
        System.out.println("Please enter the unemployment compensation: ");        
        unemploymentCompensation = scanIn.nextDouble();
        
        System.out.println("Please enter the dependant amount: ");        
        dependantAmount = scanIn.nextDouble();
                     
        System.out.println("Please enter the Healthcare amount: ");        
        healthCareAmount = scanIn.nextDouble();

        Form1040 form = new Form1040();

        form.setFirsName(fName_Initial);
        form.setLastName(lname);
        form.setTotal(salary);
        form.setTaxableInterest(interest);
        form.setUnemployementCompensation(unemploymentCompensation);
        form.setDependantAmount(dependantAmount);
        form.setHealthCare(healthCareAmount);

        form = (Form1040) form1040Implementation.calculateTax(form);

        System.out.println("Refund amount is: " + form.getRefund());
        System.out.println("The Amount Due is: " + form.getDueAmount());
        
        scanIn.close();

    }
}
