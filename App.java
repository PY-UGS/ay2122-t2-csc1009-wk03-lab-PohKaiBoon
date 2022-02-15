import java.util.Scanner;
import java.text.DecimalFormat;


public class App {

    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args)  {
        
        Scanner scans = new Scanner(System.in);

        
        System.out.print("Enter annual interest rate, for example, 8.25: ");
        double annualInterestRate= scans.nextDouble();

        System.out.print("Enter number of years as an integer: ");
        int numberOfYears= scans.nextInt();

        System.out.print("Enter loan amount, for example, 120000.95: ");
        double loanAmount= scans.nextDouble();

        Loan loan1= new Loan(annualInterestRate, numberOfYears, loanAmount);


        System.out.println("The loan was created on "+ loan1.getLoanDate());

        System.out.println("The monthly payment is "+ df.format(loan1.getMonthlyPayment()));

        System.out.print("The total payment is "+ df.format(loan1.getTotalPayment()));

      //close scanner
      scans.close();
      


        
    }
}
