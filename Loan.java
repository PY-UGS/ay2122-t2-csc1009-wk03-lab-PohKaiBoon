import java.util.Date;
import java.lang.Math;


public class Loan {
    
        private double annualInterestRate;
        private int numberOfYears;
        private double loanAmount;
        private Date loanDate;


        //Constructers
        public Loan(){

        }

        public Loan(double annualInterestRate, int numberOfYears, double loanAmount ){
            this.annualInterestRate= annualInterestRate;
            this.numberOfYears= numberOfYears;
            this.loanAmount= loanAmount;
        }

        //Getters
        public double getAnnualInterestRate() {
            return this.annualInterestRate;
        }

        public int getNumberOfYears() {
            return this.numberOfYears;
        }

        public double getLoanAmount() {
            return this.loanAmount;
        }
        
        public Date getLoanDate() {  
            
            Date date = new Date();
            this.loanDate= date;
            return this.loanDate;
            
           
        }

        // Setters
        public void setAnnualInterestRate(double annualInterestRate) {
            this.annualInterestRate = annualInterestRate;
        }

        public void setNumberOfYears(int numberOfYears) {
            this.numberOfYears = numberOfYears;
        }
    
        public void setLoanAmount(double loanAmount) {
            this.loanAmount = loanAmount;
        }


        public double getMonthlyPayment() {
            double monthlyInterestRate= (this.annualInterestRate/100)/12;
            double power= 1/Math.pow((1+monthlyInterestRate), (this.numberOfYears*12));
            double denominater= 1- power;
            double monthlyPayment= (this.loanAmount*monthlyInterestRate)/denominater;
            return monthlyPayment;
        }

        public double getTotalPayment() {
            double totalPayment=  this.getMonthlyPayment()* this.numberOfYears*12;
            return totalPayment;
        }
           



    

}
